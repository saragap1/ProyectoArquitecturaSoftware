import java.util.List;
import java.util.ArrayList;

public class Misiones {

    public static List<Misiones> misionesDisponibles = new ArrayList<>();

    private String nombreMision;
    private String rangoMision;
    private int recompensaAtaque;
    private int recompensaDefensa;
    private int recompensaChakra;

    public Misiones(Builder builder) {
        this.nombreMision = builder.nombreMision;

        this.rangoMision = builder.rangoMision;
        this.recompensaAtaque = builder.recompensaAtaque;
        this.recompensaDefensa = builder.recompensaDefensa;
        this.recompensaChakra = builder.recompensaChakra;
    }

    public static class Builder {
        private String nombreMision;
        private String rangoMision;
        private int recompensaAtaque;
        private int recompensaDefensa;
        private int recompensaChakra;

        public Builder nombreMision(String nombreMision) {
            this.nombreMision = nombreMision;
            return this;
        }

        public Builder rangoMision(String rangoMision) {
            this.rangoMision = rangoMision;
            return this;
        }

        public Builder recompensaAtaque(int recompensaAtaque) {
            this.recompensaAtaque = recompensaAtaque;
            return this;
        }

        public Builder recompensaDefensa(int recompensaDefensa) {
            this.recompensaDefensa = recompensaDefensa;
            return this;
        }

        public Builder recompensaChakra(int recompensaChakra) {
            this.recompensaChakra = recompensaChakra;
            return this;
        }

        public Misiones build() {
            return new Misiones(this);
        }
    }

    public String getNombreMision() {
        return nombreMision;
    }

    public String getRangoMision() {
        return rangoMision;
    }

    public int getRecompensaAtaque() {
        return recompensaAtaque;
    }

    public int getRecompensaDefensa() {
        return recompensaDefensa;
    }

    public int getRecompensaChakra() {
        return recompensaChakra;
    }
    @Override
    public String toString() {  
        return "Mision: nombre=" + nombreMision  + ", rango=" + rangoMision + ", recompensaAtaque=" + recompensaAtaque + 
        ", recompensaDefensa=" + recompensaDefensa +", recompensaChakra=" + recompensaChakra;
    }

    public static void agregarMision(Misiones mision) {
        misionesDisponibles.add(mision);
    }

    public static List<Misiones> getMisionesDisponibles() {
        return misionesDisponibles;
    }

    public static void main(String[] args) {
        
        Misiones mision1 = new Misiones.Builder()
                .nombreMision("Rescate de personas en la Aldea").rangoMision("A").recompensaAtaque(50).recompensaDefensa(30).recompensaChakra(20).build();
        Misiones mision2 = new Misiones.Builder()
                .nombreMision("Protección del Puente contra espíritus").rangoMision("B").recompensaAtaque(40).recompensaDefensa(25).recompensaChakra(15).build();
        Misiones mision3 = new Misiones.Builder()
                .nombreMision("Pelea con ladrones en la aldea Kiri").rangoMision("C").recompensaAtaque(30).recompensaDefensa(20).recompensaChakra(10).build();
        Misiones mision4 = new Misiones.Builder()
                .nombreMision("Entrega de un amuleto importante a otra Aldea").rangoMision("S").recompensaAtaque(70).recompensaDefensa(40).recompensaChakra(30).build();
        Misiones mision5 = new Misiones.Builder()
                .nombreMision("Patrulla nocturna por la Aldea").rangoMision("D").recompensaAtaque(20).recompensaDefensa(10).recompensaChakra(5).build();
        
        Misiones.agregarMision(mision1);
        Misiones.agregarMision(mision2);
        Misiones.agregarMision(mision3);
        Misiones.agregarMision(mision4);
        Misiones.agregarMision(mision5);
    }
    
}
