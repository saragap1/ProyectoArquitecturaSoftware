import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportVisitor {
    

    public static void exportarNinjasTxt(List<Ninja> ninjas) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("ninjas.txt"))) {
        for (Ninja ninja : ninjas) {
            writer.write(ninja.toString());
            writer.newLine();
        }
        System.out.println("Ninjas exportados exitosamente a ninjas.txt");
    } catch (IOException e) {
        System.out.println("Error al exportar los ninjas: " + e.getMessage());
    }

}
    public static void exportarNinjasJson(List<Ninja> ninjas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ninjas.json"))) {
            writer.write("[\n");
            for (int i = 0; i < ninjas.size(); i++) {
                Ninja ninja = ninjas.get(i);
                writer.write("  " + ninja.toJson());
                if (i < ninjas.size() - 1) {
                    writer.write(",");
                }
                writer.newLine();
            }
            writer.write("\n]");
            System.out.println("Ninjas exportados exitosamente a ninjas.json");
        } catch (IOException e) {
            System.out.println("Error al exportar los ninjas: " + e.getMessage());
        }
    }

    public static void exportarNinjasXml(List<Ninja> ninjas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ninjas.xml"))) {
            writer.write("<ninjas>\n");
            for (Ninja ninja : ninjas) {
                writer.write("  " + ninja.toXml());
                writer.newLine();
            }
            writer.write("</ninjas>");
            System.out.println("Ninjas exportados exitosamente a ninjas.xml");
        } catch (IOException e) {
            System.out.println("Error al exportar los ninjas: " + e.getMessage());
        }
    }

}

