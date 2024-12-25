package version2;
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
        maxload = a;
    }
    public double getLoad(){
        return load;
    }
    public double getMaxLoad(){
        return maxload;
    }
    public boolean addBox(double extraLoad){
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
}
