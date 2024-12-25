package ejercicio1;

public class FooBarBoz {
    public static void main(String[] args) {
       for(int i=1; i < 51; i++){
           int a = i%3;
           int b = i%5;
           int c = i%7;
           if(a == 0 & b == 0 & c == 0){
               System.out.print(i +""+ "foo"+" "+ "bar"+" "+ "boz"+"\n");
           }else if(a == 0 & b == 0){
               System.out.print(i +""+ "foo"+" "+ "bar"+"\n");
           }else if(a == 0 & c == 0){
               System.out.print(i +""+ "foo" +" "+ "boz"+"\n");
           }else if(b == 0 & c == 0){
               System.out.print(i +""+ "bar"+" "+ "boz"+"\n");
           }
           else if(a == 0){
               System.out.print(i +""+ "foo"+ "\n");
           }else if(b==0){
               System.out.print(i +""+ "bar"+ "\n");
           }else if(c==0){
               System.out.print(i +""+ "boz"+ "\n");
           }
           else{
               System.out.print(i+"\n");
           }
               
        } 
    }
    
}
