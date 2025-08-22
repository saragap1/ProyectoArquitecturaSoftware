import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


// clase abstracta.
public abstract class AldeaFactory {

    public abstract Ninja crearNinja();
    
}


       /* List<String> ninjas = new ArrayList<>(Arrays.asList());
        List<String> ninjasKiri = new ArrayList<>(Arrays.asList());
        List<String> ninjasKonoha = new ArrayList<>(Arrays.asList());
        List<String> ninjasSuna = new ArrayList<>(Arrays.asList());

        Scanner sc = new Scanner(System.in);

        
        System.out.println("\nPor favor, ingresa el número de la aldea en donde quieres crear un nuevo ninja:\n"+
            "1. Aldea Kiri\n"+
            "2. Aldea Konoha\n"+
            "3. Aldea Suna\n");

            int opcionAldea = sc.nextInt();     
            
                if (opcionAldea ==1){
                    KiriFactory ninjaKiri = new KiriFactory();
                    //ninjaKiri.nombreAldea();
                    ninjaKiri.obtenerInformacionNinja();
                    ninjasKiri.add(ninjaKiri.toString());
                    ninjas.add(ninjaKiri.toString());
                    System.out.println("Ninja de Kiri creado exitosamente.");  

                    System.out.println(ninjas);
                    System.out.println(ninjasKiri);
                    
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
                }
        
        sc.close();
    }*/


