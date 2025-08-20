import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Cliente {

   public static void main(String a[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Esta es una simulación de Ninjas al estilo Naruto !!!! qué haras hoy??:\n"+
         "1. Quiero crear un ninja personalizado\n"+
         "2. Quiero crear un ninja según una aldea\n"+
         "3. Asigname una misión !!!\n" +
         "4. Quiero simular un combate\n" +
         "5. Salir y exportar toda la información\n" + 
         "Por favor pon un numero enterooo!!! si no me toca hacer else: ");

        int opcionMenu = sc.nextInt();
        System.out.print("\nHas elegido " + opcionMenu + " como opción.\n");

        if (opcionMenu == 1){
                        
            sc.nextLine(); // Consumir el salto de línea pendiente
            System.out.println("Por favor, ingresa el nombre del ninja: ");
            String nombre = sc.nextLine();  
            System.out.println("Por favor, ingresa el rango del ninja: ");
            String rango = sc.nextLine();           
            System.out.println("Por favor, ingresa la aldea (Kiri, Konoha, Suna) del ninja: ");
            String aldea = sc.nextLine();   
            System.out.println("Por favor, ingresa el ataque del ninja: ");
            int ataque = sc.nextInt();
            System.out.println("Por favor, ingresa la defensa del ninja: ");
            int defensa = sc.nextInt();
            System.out.println("Por favor, ingresa el chakra del ninja: ");
            int chakra = sc.nextInt();
            System.out.println("Por favor, ingresa los jutsus del ninja (separados por comas):");
            sc.nextLine();
            String jutsusInput = sc.nextLine();
            List<String> jutsus = Arrays.asList(jutsusInput.split(","));
            Ninja ninjaPersonalizado = new Ninja.Builder()
                .nombre(nombre)
                .rango(rango)
                .aldea(aldea)
                .ataque(ataque)
                .defensa(defensa)
                .chakra(chakra)
                .jutsus(jutsus.toArray(new String[0]))
                .build();
            
            System.out.println("Ninja personalizado: " + ninjaPersonalizado);
            
        }

        else if (opcionMenu == 2){

            AldeaFactory.main(a);
                        
            /*System.out.println("\nPor favor, ingresa el número de la aldea en donde quieres crear un nuevo ninja:\n"+
            "1. Aldea Kiri\n"+
            "2. Aldea Konoha\n"+
            "3. Aldea Suna\n");

            int opcionAldea = sc.nextInt();     
            
                if (opcionAldea ==1){
                    KiriFactory ninjaKiri = new KiriFactory();
                    ninjaKiri.obtenerInformacionNinja();
                    System.out.println("Ninja de Kiri creado exitosamente.");   
                }
                else if (opcionAldea ==2){
                    KonohaFactory ninjaKonoha = new KonohaFactory();
                    ninjaKonoha.obtenerInformacionNinja();
                    System.out.println("Ninja de Konoha creado exitosamente.");                        
                }
                else if (opcionAldea ==3){
                    SunaFactory ninjaSuna = new SunaFactory();
                    ninjaSuna.obtenerInformacionNinja();
                    System.out.println("Ninja de Suna creado exitosamente.");
                }
                else{
                    System.out.println("Por favor, ingresa un número válido.");
                } */
            

        }

         sc.close();
        
    } 

}