import java.util.List;
import java.util.Random;

public class Combate {
    public static void simularCombate(List<Ninja> ninjas) {
        if (ninjas.size() < 2) {
            System.out.println("Debe haber al menos dos ninjas para simular un combate.");
            return;
        }
        Ninja ninjaJugador = ninjas.get(ninjas.size() - 1);

        Random rand = new Random();
        int indiceRival;

        do {
            indiceRival = rand.nextInt(ninjas.size());   
        } while (indiceRival == ninjas.size() - 1);
        Ninja ninjaRival = ninjas.get(indiceRival);

        System.out.println("Combate entre " + ninjaJugador.getNombre() + " y " + ninjaRival.getNombre() + "!");

        int[] progresos = {25, 50, 75, 100};
        for (int p : progresos) {
            if (p < 100) {
                System.out.println("Combate al " + p + "%...");
            } else {
                System.out.println("Combate completado.");
            }
        } try { Thread.sleep(700); } catch (InterruptedException e) {}
    

        int sumaJugador = ninjaJugador.getAtaque() + ninjaJugador.getDefensa() + ninjaJugador.getChakra();
        int sumaRival = ninjaRival.getAtaque() + ninjaRival.getDefensa() + ninjaRival.getChakra();
        int cantJutsusJugador = ninjaJugador.jutsus != null ? ninjaJugador.jutsus.size() : 1;
        int cantJutsusRival = ninjaRival.jutsus != null ? ninjaRival.jutsus.size() : 1;
    
        double poderJugador = (sumaJugador * cantJutsusJugador) / (double)(sumaRival * cantJutsusRival);

        if (poderJugador > 1) {
            System.out.println(ninjaJugador.getNombre() + " ha ganado el combate contra " + ninjaRival.getNombre() + "!");
        } else if (poderJugador < 1) {
            System.out.println(ninjaRival.getNombre() + " ha ganado el combate contra " + ninjaJugador.getNombre() + "!");
        } else {
            System.out.println("El combate entre " + ninjaJugador.getNombre() + " y " + ninjaRival.getNombre() + " ha terminado en empate!");
        }
    }
}
