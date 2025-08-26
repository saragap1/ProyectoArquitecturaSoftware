import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JsonExportVisitor implements Visitor {
    private BufferedWriter writer;
    private boolean first = true;

    public JsonExportVisitor(String archivo) throws IOException {
        this.writer = new BufferedWriter(new FileWriter(archivo));
        writer.write("[\n");
    }

    @Override
    public void visitar(Ninja ninja) {
        try {
            if (!first) writer.write(",\n");
            writer.write("  " + ninja.toJson());
            first = false;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cerrar() {
        try {
            writer.write("\n]");
            writer.close();
            System.out.println("✅ Ninjas exportados en JSON");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
