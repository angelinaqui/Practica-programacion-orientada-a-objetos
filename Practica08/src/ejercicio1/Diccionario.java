package ejercicio1;

/**
 *
 * @author poo07alu11
 */
import java.util.*;
public class Diccionario {
    final HashMap<String, String> di;
    public Diccionario(){
        di = new HashMap<String, String> ();
        cargaDiccionario();
    }
    public String get(String ingles){
        String di = this.di.get(ingles);
        return di;
    }
    public void put(String ingles, String espanol) {
        di.put(ingles, espanol);
    }
    private void cargaDiccionario(){
        di.put("one", "uno");
        di.put("hello", "hola");
        di.put("water", "agua");
        di.put("exit", "salida");
        di.put("house", "casa");
        di.put("dog", "perro");
    }
}
