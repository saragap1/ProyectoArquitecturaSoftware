public class KonohaFactory extends AldeaFactory {

   @Override
   public Ninja crearNinja() {
      return new KonohaNinja().obtenerInformacionNinja();
   }

    

}

   