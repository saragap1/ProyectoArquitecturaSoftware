import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class XmlExportVisitor implements Visitor {
    private BufferedWriter writer;

    public XmlExportVisitor(String archivo) throws IOException {
        this.writer = new BufferedWriter(new FileWriter(archivo));
        writer.write("<ninjas>\n");
    }

    @Override
    public void visitar(Ninja ninja) {
        try {
            writer.write("  " + ninja.toXml());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cerrar() {
        try {
            writer.write("</ninjas>");
            writer.close();
            System.out.println("✅ Ninjas exportados en XML");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
