import java.util.List;

public class Ninja{

    private String nombre;
    private String rango;
    private String aldea;
    private int ataque;
    private int defensa;
    private int chakra;
    private List<String> jutsus;

    private Ninja(Builder builder) {

        this.nombre=builder.nombre;
        this.rango=builder.rango;
        this.aldea = builder.aldea;
        this.ataque = builder.ataque;
        this.defensa = builder.defensa;
        this.chakra = builder.chakra;
        this.jutsus= builder.jutsus;

    }

    // ?
    /*public String getNombre() { return nombre; }
    public List<String> getJutsu() { return jutsus; } 
    public String getRango() { return rango;}
    public String getAldea() { return aldea; }
    public int getAtaque() { return ataque; }       
    public int getDefensa() { return defensa; }
    public int getChakra() { return chakra; }*/

    public static class Builder {

        private String nombre;
        private String rango;
        private String aldea;
        private int ataque;
        private int defensa;
        private int chakra;
        private List<String> jutsus;

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        public Builder rango(String rango) {
            this.rango = rango;
            return this;
        }
    
        public Builder aldea(String aldea) {
            this.aldea = aldea;
            return this;
        }

        public Builder ataque(int ataque) {
            this.ataque = ataque;
            return this;
        }

        public Builder defensa(int defensa) {
            this.defensa = defensa;
            return this;
        }

        public Builder chakra(int chakra) {
            this.chakra = chakra;
            return this;
        }


        public Builder jutsuS(List<String> jutsus) {
            this.jutsus = jutsus;
            return this;
        }  

        public Builder jutsus(String... jutsus) {
            this.jutsus = java.util.Arrays.asList(jutsus);
            return this;
        }

        public Ninja build() {
            return new Ninja(this);
        }
    }

     public static Builder builder() {
        return new Builder();
    }

    public String toString() {
        return "Ninja:" +
                "nombre=" + nombre +  
                ", rango=" + rango + 
                ", aldea=" + aldea +
                ", ataque=" + ataque +  
                ", defensa=" + defensa +
                ", chakra=" + chakra +
                ", justsus='" + jutsus +

                '.';
    }
  
    public static void main(String[] args) {
        Ninja ninja = Ninja.builder()
                .nombre("Naruto")
                .rango("Hokage")
                .aldea("Konoha")
                .ataque(100)
                .defensa(80)
                .chakra(120)
                .jutsus("Rasengan","Shadow Clone Jutsu")
                
                .build();

        System.out.println(ninja);
    }


}