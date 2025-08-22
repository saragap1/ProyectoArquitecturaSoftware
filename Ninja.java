import java.util.Arrays;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Ninja{

    private String nombre;
    private String rango;
    private String aldea;
    private int ataque;
    private int defensa;
    private int chakra;
    private List<String> jutsus;
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"nombre\":\"").append(nombre).append("\",");
        sb.append("\"rango\":\"").append(rango).append("\",");
        sb.append("\"aldea\":\"").append(aldea).append("\",");
        sb.append("\"ataque\":").append(ataque).append(",");
        sb.append("\"defensa\":").append(defensa).append(",");
        sb.append("\"chakra\":").append(chakra).append(",");
        sb.append("\"jutsus\":[");
    for (int i = 0; i < jutsus.size(); i++) {
        sb.append("\"").append(jutsus.get(i).trim()).append("\"");
        if (i < jutsus.size() - 1) sb.append(",");
        }
        sb.append("]");
        sb.append("}");
        return sb.toString();
    }

    public String toXml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ninja>");
        sb.append("<nombre>").append(nombre).append("</nombre>");
        sb.append("<rango>").append(rango).append("</rango>");
        sb.append("<aldea>").append(aldea).append("</aldea>");
        sb.append("<ataque>").append(ataque).append("</ataque>");
        sb.append("<defensa>").append(defensa).append("</defensa>");
        sb.append("<chakra>").append(chakra).append("</chakra>");
        sb.append("<jutsus>");
        for (String jutsu : jutsus) {
            sb.append("<jutsu>").append(jutsu.trim()).append("</jutsu>");
        }
        sb.append("</jutsus>");
        sb.append("</ninja>");
        return sb.toString();
    }

    private Ninja(Builder builder) {

        this.nombre=builder.nombre;
        this.rango=builder.rango;
        this.aldea = builder.aldea;
        this.ataque = builder.ataque;
        this.defensa = builder.defensa;
        this.chakra = builder.chakra;
        this.jutsus= builder.jutsus;

    }

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