package ejercicio2;
public class Buscador {
   public boolean haySubString(String subTexto, String texto) {
      int i, j;
      boolean found = false;
      for (i = 0; (i < texto.length()) && !found; i++) {
         j = 0;
         found = false;
         while (!found) {
            if (j >= subTexto.length()) {
               break;
            } else if ((i + j) >= texto.length()) {
               break;
            } else if (subTexto.charAt(j) != texto.charAt(i + j)) {
               break;
            } else {
               j++;
               if (j == subTexto.length()) {
                  found = true;
               }
            }
         }
      }
      return found;
   }
}

