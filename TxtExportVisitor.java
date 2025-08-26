import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TxtExportVisitor implements Visitor {
    private BufferedWriter writer;
    

    public TxtExportVisitor(String archivo) throws IOException {
        this.writer = new BufferedWriter(new FileWriter(archivo));
    }

    @Override
    public void visitar(Ninja ninja) {
        try {
            writer.write(ninja.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cerrar() {
        try {
            writer.close();
            System.out.println("✅ Ninjas exportados en TXT");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
