
package ejercicio2;

public class Fish extends Animal implements Pet{
    public String name;
    public Fish(){
        super(0);
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void play(){
        System.out.println("Le gusta jugar saltando por unos segundos fuera del agua");
    }
    @Override
    public void walk(){
        System.out.println("Los peces no caminan porque tienen "+legs+" patas");
    }

    @Override
    public void eat() {
        System.out.println("come peces más pequeños");
    }
}
