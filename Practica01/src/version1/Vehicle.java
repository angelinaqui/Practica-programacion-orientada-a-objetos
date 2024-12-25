package version1;
public class Vehicle {
        public double load;
        public void setLoad(double b){
            load = b;
        }
        public double maxload;
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
    
  }
