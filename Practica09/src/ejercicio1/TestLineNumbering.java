package ejercicio1;
import java.io.*;
public class TestLineNumbering {
    public static void main(String[] args) {
        File myDir = new File("data");
        File file = new File(myDir, args[0]);
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(new FileWriter(file));
            String s;
            System.out.print("Enter file text. ");
            System.out.println("To exit, type 00.");
            while (!(s = in.readLine()).equals("00") ){
                out.println(s);
        }
        in.close();
        out.close();
        }catch (FileNotFoundException e1) {
            System.err.println("File not found: " + file);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
     }
  }

