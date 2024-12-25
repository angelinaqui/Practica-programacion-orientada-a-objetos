package ejercicio2;
public class TestBuscador {
 public static void main(String[] args) {
      Buscador busca = new Buscador();
      String texto = "El gato en el tejado";
      String subTexto = "El";
      if (busca.haySubString(subTexto, texto) == true) {
         System.out.println("El substring  [" + subTexto + "] Si se encuentra en el string [" + texto +"]");
      } else {
         System.out.println("El substring [" + subTexto + "] NO se encuentra en el string [" + texto + "]");
      }
   }
}