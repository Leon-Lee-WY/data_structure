package tuto_1;
public abstract class Vehicle {
    double maxSpeed;
    protected double currentSpeed=20;
    
    Vehicle(double maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    
    abstract double accelerate();
    
    double getCurrentSpeed(){
        return currentSpeed;
    }
    
    double getMaxSpeed(){
        return this.maxSpeed;
    }
    void pedalToTheMetal(){
        if(currentSpeed==this.maxSpeed){
            System.out.println("Reached max speed");
        }
        else{
            accelerate();
        }
    }
}

/*No. We can't create an instance of Vehicle Object because the Vehicle is an abstract class*/
