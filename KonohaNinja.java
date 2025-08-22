import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KonohaNinja implements NinjaSegunAldea {

   Scanner sc = new Scanner(System.in);
   private int ataque = 100;
   private int defensa = 80;        
   private int chakra = 120;
   private String aldea = "Konoha";

   private List<String> jutsus = Arrays.asList(
        "Kirigakure no Jutsu", 
        "Suiton: Suiryūdan no Jutsu"
    );
    
    public Ninja obtenerInformacionNinja() {
      System.out.println("Por favor, ingresa el nombre del ninja:");
      String nombre = sc.nextLine();   
      System.out.println("Por favor, ingresa el rango del ninja:");
      String rango = sc.nextLine();
      Ninja ninjaKonoha = new Ninja.Builder()
                .nombre(nombre)
                .rango(rango)
                .aldea(aldea)
                .ataque(ataque)
                .defensa(defensa)
                .chakra(chakra)
                .jutsus(jutsus.toArray(new String[0]))
                .build();
      System.out.println(ninjaKonoha);
      return ninjaKonoha;
}

}