import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SunaNinja implements NinjaSegunAldea {

   Scanner sc = new Scanner(System.in);
   private int ataque = 80;
   private int defensa = 60;
   private int chakra = 90;
   private String aldea = "Suna";

   private List<String> jutsus = Arrays.asList(
        "jutsu 0 de Suna", 
        "justu 1 de Suna"
   );

   public Ninja obtenerInformacionNinja() {
      System.out.println("Por favor, ingresa el nombre del ninja: ");
      String nombre = sc.nextLine(); 
      System.out.println("Por favor, ingresa el rango del ninja: ");
      String rango = sc.nextLine(); 
      Ninja ninjaSuna = new Ninja.Builder()
                .nombre(nombre)
                .rango(rango)
                .aldea(aldea)
                .ataque(ataque)
                .defensa(defensa)
                .chakra(chakra)
                .jutsus(jutsus.toArray(new String[0]))
                .build();
      System.out.println(ninjaSuna);
      return ninjaSuna;

   }
   
}

