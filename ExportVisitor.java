import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExportVisitor implements Visitor {
    private String formato;
    private BufferedWriter writer;
    private boolean firstJson = true; // Para comas en JSON

    public ExportVisitor(String formato, String archivo) throws IOException {
        this.formato = formato.toLowerCase();
        this.writer = new BufferedWriter(new FileWriter(archivo));

        if (formato.equals("json")) writer.write("[\n");
        if (formato.equals("xml")) writer.write("<ninjas>\n");
    }

    @Override
    public void visitar(Ninja ninja) {
        try {
            switch (formato) {
                case "txt":
                    writer.write(ninja.toString());
                    break;
                case "json":
                    if (!firstJson) writer.write(",\n");
                    writer.write("  " + ninja.toJson());
                    firstJson = false;
                    break;
                case "xml":
                    writer.write("  " + ninja.toXml());
                    break;
                default:
                    throw new IllegalArgumentException("Formato no soportado: " + formato);
            }
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cerrar() {
        try {
            if (formato.equals("json")) writer.write("\n]");
            if (formato.equals("xml")) writer.write("</ninjas>");
            writer.close();
            System.out.println("✅ Ninjas exportados a formato " + formato.toUpperCase());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        java.util.List<Ninja> ninjas = new java.util.ArrayList<>();
        // Suponiendo que 'ninjas' es una colección de objetos Ninja
        ExportVisitor visitor = null;
        int opcionExportar = 2; // Ejemplo: 1 para txt, 2 para json, 3 para xml

        try {
            switch (opcionExportar) {
                case 1:
                    visitor = new ExportVisitor("txt", "ninjas.txt");
                    break;
                case 2:
                    visitor = new ExportVisitor("json", "ninjas.json");
                    break;
                case 3:
                    visitor = new ExportVisitor("xml", "ninjas.xml");
                    break;
                default:
                    System.out.println("❌ Opción no válida. No se exportó ningún archivo.");
            }

            if (visitor != null) {
                for (Ninja n : ninjas) {
                    n.aceptar(visitor);
                }
                visitor.cerrar();
                System.out.println("Ninjas exportados correctamente.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al exportar los ninjas: " + e.getMessage());
        }
    }
}
