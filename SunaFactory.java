import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SunaFactory implements Aldea {

   Scanner sc = new Scanner(System.in);

   private int ataque = 80;
   private int defensa = 60;
   private int chakra = 90;
   private String aldea = "Suna";

   private List<String> jutsus = Arrays.asList(
        "jutsu 0 de Suna", 
        "justu 1 de Suna"
    );

    private List<String> ninjasSunaList = Arrays.asList(

   );
   
   @Override
    public String nombreAldea() {
      return "Vas a crear un ninja de la aldea Suna.";
   }

   @Override
   public void obtenerInformacionNinja() {
      System.out.println("Por favor, ingresa el nombre del ninja:");
      String nombre = sc.nextLine(); 
      System.out.println("Por favor, ingresa el rango del ninja:");
      String rango = sc.nextLine();


   }



}
