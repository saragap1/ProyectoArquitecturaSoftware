import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KonohaFactory implements Aldea {

   Scanner sc = new Scanner(System.in);

   private int ataque = 100;
   private int defensa = 80;        
   private int chakra = 120;
   private String aldea = "Konoha";

   private List<String> jutsus = Arrays.asList(
        "Kirigakure no Jutsu", 
        "Suiton: Suiryūdan no Jutsu"
    );
    
   private List<String> ninjasKonohaList = Arrays.asList(

   );


   @Override
    public String nombreAldea() {
      return "Vas a crear un ninja de la aldea Konoha.";
   }

   @Override
   public void obtenerInformacionNinja() {
      System.out.println("Por favor, ingresa el nombre del ninja:");
      String nombre = sc.nextLine();   
      System.out.println("Por favor, ingresa el rango del ninja:");
      String rango = sc.nextLine();
   }

   
    
}