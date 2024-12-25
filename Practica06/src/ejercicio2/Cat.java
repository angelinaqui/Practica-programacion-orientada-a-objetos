
package ejercicio2;

public class Cat extends Animal implements Pet{
    public String name;
    public Cat (String name){
        super(4);
        this.name = name;
    }
    public Cat (){
        this(null);
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
    public void eat(){
        System.out.println("Es carnivoro, atrapa a sus presa y puede comer ruedores, pajaros, pequeños peces e insectos");
    }
    @Override
    public void play(){
        System.out.println("le gusta juagr con estambre y perseguir cosas");
    }
}
