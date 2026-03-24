package tuto2;
public class Duo <A,B>{
    A first;
    B second;
    
    Duo(A x,B y){
        first=x;
        second=y;
    }
    
    void printAll(){
        System.out.println(first+" "+second);
    }
    
    public static void main(String[] args) {
        Duo sideShape=new Duo("Nine",9);
        Duo points=new Duo(9.9,9.9);
        sideShape.printAll();
        points.printAll();
    }
}
