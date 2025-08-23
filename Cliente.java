import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Cliente {

    private static List<Misiones> misionesAsignadas = new ArrayList<>();
    private static List<Ninja> ninjas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

   public static void main(String a[]){

        Misiones.main(a);
        int opcionMenu = 0;

        while (opcionMenu != 5) {

            System.out.println(ninjas);
            System.out.print("\nEsta es una simulación de Ninjas al estilo Naruto !!!! qué haras hoy??:\n"+
                "1. Quiero crear un ninja personalizado\n"+
                "2. Quiero crear un ninja según una aldea\n"+
                "3. Asigname una misión según mi rango!!!\n" +
                "4. Quiero simular un combate\n" +
                "5. Salir y exportar toda la información\n" + 
                "Por favor pon un numero enterooo!!! si no me toca hacer else: ");

            opcionMenu = sc.nextInt();
            System.out.print("\nHas elegido " + opcionMenu + " como opción.\n");

            if (opcionMenu == 1){
                crearNinjaPersonalizado();
            } else if (opcionMenu == 2){
                CrearNinjaSegunAldea();
            } else if (opcionMenu == 3){
                
                if (ninjas.isEmpty()) {
                    System.out.println("No hay ninjas disponibles para asignar una misión. Crea un ninja primero.");
                } else {
                    System.out.println("Por favor, ingresa el número del ninja al que deseas asignar una misión: ");
                    for (int i = 0; i < ninjas.size(); i++) {
                        System.out.println((i + 1) + ". " + ninjas.get(i).getNombre());
                    }

                    int numeroNinja = sc.nextInt();
                    Ninja ninjaSeleccionado = ninjas.get(numeroNinja - 1);
                    hacerMision(ninjaSeleccionado);

                    
                    if (numeroNinja < 1 || numeroNinja > ninjas.size()) {
                        System.out.println("Número de ninja no válido.");
                        continue;
                    }
            }

            } else if (opcionMenu == 4){
                // Código para simular un combate
            } else if (opcionMenu == 5){
                System.out.println("¿En qué formato deseas exportar los ninjas?");
                System.out.println("1. TXT");
                System.out.println("2. JSON");
                System.out.println("3. XML");
                System.out.print("Selecciona una opción: ");
                int opcionExportar = sc.nextInt();
                sc.nextLine(); 

            switch (opcionExportar) {
                case 1:
                    ExportVisitor.exportarNinjasTxt(ninjas); // Asumiendo que ya tienes este método para TXT
                    System.out.println("Ninjas exportados en formato TXT.");
                    break;
                case 2:
                    ExportVisitor.exportarNinjasJson(ninjas); // Implementa este método
                    System.out.println("Ninjas exportados en formato JSON.");
                    break;
                case 3:
                    ExportVisitor.exportarNinjasXml(ninjas); // Implementa este método
                    System.out.println("Ninjas exportados en formato XML.");
                    break;
                default:
                    System.out.println("Opción no válida. No se exportó ningún archivo.");
            }
            System.out.println("¡Hasta luego!");

            } else {
                System.out.println("Por favor, ingresa un número válido.");
                sc.close();
            }
        }


    }

    private static void crearNinjaPersonalizado() {
        sc.nextLine();
        System.out.println("Por favor, ingresa el nombre del ninja: ");
        String nombre = sc.nextLine();  
        System.out.println("Por favor, ingresa el rango del ninja (Jonin, Chunin, Genin): ");
        String rango = sc.nextLine();           
        System.out.println("Por favor, ingresa la aldea del ninja (Kiri, Konoha, Suna): ");
        String aldea = sc.nextLine();   
        System.out.println("Por favor, ingresa el ataque del ninja (Entero): ");
        int ataque = sc.nextInt();
        System.out.println("Por favor, ingresa la defensa del ninja (Entero): ");
        int defensa = sc.nextInt();
        System.out.println("Por favor, ingresa el chakra del ninja (Entero): ");
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
        ninjas.add(ninjaPersonalizado);
        System.out.println("Ninja personalizado: " + ninjaPersonalizado);
        
    }

    private static void CrearNinjaSegunAldea() {
        System.out.println("\nPor favor, ingresa el número de la aldea en donde quieres crear un nuevo ninja:\n"+
                    "1. Aldea Kiri\n"+
                    "2. Aldea Konoha\n"+
                    "3. Aldea Suna\n");

                int opcionAldea = sc.nextInt();     
                
                if (opcionAldea == 1){
                    AldeaFactory ninjaKiri = new KiriFactory();
                    ninjas.add(ninjaKiri.crearNinja());

                } else if (opcionAldea == 2){

                    AldeaFactory ninjaKonoha = new KonohaFactory();
                    ninjas.add(ninjaKonoha.crearNinja());
                                      
                } else if (opcionAldea == 3){
                    AldeaFactory ninjaSuna = new SunaFactory();
                    ninjas.add(ninjaSuna.crearNinja());

                } else {

                    System.out.println("Por favor, ingresa un número válido.");
                }
       
    }

    private static void hacerMision(Ninja ninjaSeleccionado) {

        System.out.println("Ninja seleccionado: " + ninjaSeleccionado.getNombre() + " (Rango: " + ninjaSeleccionado.getRango() + ")");
        List<Misiones> misionesDisponibles = Misiones.getMisionesDisponibles();
        List<Misiones> misionesFiltradas = new ArrayList<>();
        String rangoNinja = ninjaSeleccionado.getRango();

        for (Misiones mision : misionesDisponibles) {
            if (rangoNinja.equals("Genin")) {
                if (mision.getRangoMision().equals("C") || mision.getRangoMision().equals("D")) {
                    misionesFiltradas.add(mision);
                }
            } else if (rangoNinja.equals("Chunin")) {
                if (mision.getRangoMision().equals("B") || mision.getRangoMision().equals("C") || mision.getRangoMision().equals("D")) {
                    misionesFiltradas.add(mision);
                }
            } else if (rangoNinja.equals("Jonin")) {
                misionesFiltradas.add(mision); 
            }
        }

        if (misionesFiltradas.isEmpty()) {
            System.out.println("No hay misiones disponibles para el rango de este ninja.");
            return;
        }

        System.out.println("Misiones disponibles para " + ninjaSeleccionado.getNombre() + ":");
        for (int i = 0; i < misionesFiltradas.size(); i++) {
            System.out.println((i + 1) + ". " + misionesFiltradas.get(i).getNombreMision() + " (Rango: " + misionesFiltradas.get(i).getRangoMision() + ")");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Selecciona una misión por número: ");
        int numeroMision = sc.nextInt();

        if (numeroMision < 1 || numeroMision > misionesFiltradas.size()) {
            System.out.println("Número de misión no válido.");
            return;
        }

        Misiones misionSeleccionada = misionesFiltradas.get(numeroMision - 1);
        recompensasMision(ninjaSeleccionado, misionSeleccionada);
        System.out.println("Misión completada. Recompensas aplicadas.");
        System.out.println("Estado actualizado del ninja: " + ninjaSeleccionado);  
        misionesAsignadas.add(misionSeleccionada);
         
    }   
    

    private static void recompensasMision(Ninja ninjaSeleccionado, Misiones misionSeleccionada) {
        System.out.println("\nMisión asignada a " + ninjaSeleccionado.getNombre() + ": " + misionSeleccionada.getNombreMision());
        ninjaSeleccionado.setAtaque(ninjaSeleccionado.getAtaque() + misionSeleccionada.getRecompensaAtaque());
        ninjaSeleccionado.setDefensa(ninjaSeleccionado.getDefensa() + misionSeleccionada.getRecompensaDefensa());
        ninjaSeleccionado.setChakra(ninjaSeleccionado.getChakra() + misionSeleccionada.getRecompensaChakra());
        
    }

}
    


        