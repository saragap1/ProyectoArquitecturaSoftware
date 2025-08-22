import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// C
public class SunaFactory extends AldeaFactory {

   public Ninja crearNinja() {
      return new SunaNinja().obtenerInformacionNinja();
   }
 

}
