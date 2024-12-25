
package ejercicio2;

public class Spider extends Animal{
    public Spider(){
        super(8);
    }
    @Override
    public void eat(){
        System.out.println("Es carnivoro, y por lo general atrapa a su presa, lo disulve con veneno para después absorver a su presa");
        System.out.println("Se alimenta de otros insectos");
    }
    @Override
    public void walk(){
        System.out.println("mueve sus patas lentamente por telarañas");
    }
}
