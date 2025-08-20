import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KiriFactory implements Aldea {

   Scanner sc = new Scanner(System.in);

   private int ataque = 90;
   private int defensa = 70;
   private int chakra = 100;
   private String aldea = "Kiri"; 
   
   
   private List<String> jutsus = Arrays.asList(
        "Justsu 0 de Kiri", 
        "Jutsu 1 de Kiri"
    );

   private List<String> ninjasKiriList = Arrays.asList(

   );
      
      @Override
    public String nombreAldea() {
      return "Vas a crear un ninja de la aldea Kiri.";
   }

   @Override
   public void obtenerInformacionNinja() {
      System.out.println("Por favor, ingresa el nombre del ninja:");
      String nombre = sc.nextLine(); 
      System.out.println("Por favor, ingresa el rango del ninja:");
      String rango = sc.nextLine();

   }

}  
