package tuto2;
public class Circle implements Comparable<Circle>{
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
    
    @Override
    public int compareTo(Circle other){
        if(this.radius>other.radius){
            return 1;
        }
        if(this.radius<other.radius){
            return -1;
        }
        return 0;
    }
    
    double getRadius(){
        return this.radius;
    }
}

class FindMax {
    public static<E extends Comparable<E>> E max(E[] list) {
        if (list== null||list.length==0){
            return null;
        }
        E maxmax=list[0];
        for (int i=1;i<list.length;i++) {
            if (list[i].compareTo(maxmax) > 0) {
                maxmax= list[i];
            }
        }
        return maxmax;
    }
    
    public static void main(String[] args) {
        Integer[]storeInt={1,2,3};
        String[]storeStr={"red","green","blue"};
        Circle[]storeCir={new Circle(3),new Circle(2.9),new Circle(5.9)};
        System.out.println(max(storeInt));
        System.out.println(max(storeStr));
        System.out.println(max(storeCir).getRadius());
    }
}

