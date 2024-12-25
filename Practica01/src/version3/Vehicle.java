package version3;
public class Vehicle {
    private double load;
        public void setLoad(double b){
            load = b;
        }
    private double maxload;
        public void setMaxLoad(double c){
            maxload = c;
        }

    public Vehicle(double a){
        a = kiloToNewts(a);
        maxload = a;
    }
    public double getLoad(){
        load = kiloToNewts(load);
        return load;
    }
    public double getMaxLoad(){
        maxload = kiloToNewts(maxload);
        return maxload;
    }
    public boolean addBox(double extraLoad){
        extraLoad = kiloToNewts(extraLoad);
        load += extraLoad;
        if(load > maxload){
            System.out.println("es mayor");
            load -= extraLoad;
            return false;
        }else{
            System.out.println("esta bien");
            return true;
        }
    }
    private double kiloToNewts(double d){
        d = d*9.8;
        return d;
    }
     private double newtsToKilo(double e){
        e = e/9.8;
        return e;
    }
}
