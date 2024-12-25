package ejercicio1;
public class TestExceptions {
  public static void main(String[] args) {
    try{
    for ( int i = 0; true; i++ ) {
      System.out.println("args[" + i + "] is '" + args[i] + "'");
      }
    }
    catch(ArrayIndexOutOfBoundsException nfe) {
        System.err.println("El índice es mayor o igual al tamaño del arreglo");
        System.err.println("El programa va a terminar anormalmente");
        System.exit(4);
    }
  }
}
