import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KiriNinja implements NinjaSegunAldea {

    Scanner sc = new Scanner(System.in);

   private int ataque = 90;
   private int defensa = 70;
   private int chakra = 100;
   private String aldea = "Kiri"; 
   
   private List<String> jutsus = Arrays.asList(
        "Justsu 0 de Kiri", 
        "Jutsu 1 de Kiri"
    );

    public Ninja obtenerInformacionNinja() {
      System.out.println("Por favor, ingresa el nombre del ninja:");
      String nombre = sc.nextLine(); 
      System.out.println("Por favor, ingresa el rango del ninja:");
      String rango = sc.nextLine();
      Ninja ninjaKiri = new Ninja.Builder()
                .nombre(nombre)
                .rango(rango)
                .aldea(aldea)
                .ataque(ataque)
                .defensa(defensa)
                .chakra(chakra)
                .jutsus(jutsus.toArray(new String[0]))
                .build();
      System.out.println(ninjaKiri);
      return ninjaKiri;


}

}