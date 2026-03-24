//7&8
package tuto2;
import java.util.ArrayList;
public class Seven <E>{
    void allTransportation(ArrayList<?> x){}
    static <E> void printAll(ArrayList<?> y){
        for(Object x:y){
            System.out.print(x+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        ArrayList<String> vehicle = new ArrayList<>();
        ArrayList<Object> transportation = new ArrayList<>();
        
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
        numOfCars.add(9);
        numOfCars.add(6);
        printAll(numOfCars);
    }
}

/*9.Object type*/

/*10.it is replaced with the extended class*/