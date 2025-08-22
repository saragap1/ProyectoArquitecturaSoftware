import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KonohaFactory extends AldeaFactory {

   @Override
   public Ninja crearNinja() {
      return new KonohaNinja().obtenerInformacionNinja();
   }
   
    

}

   