package tuto2;
public class Container <T>{
    private T t;
    Container(){}
    void add(T x){
        t=x;
    }
    T retrieve(){
        return t;
    }
    
    public static void main(String[] args) {
        Container<Integer> c1=new Container();
        Container<String> c2=new Container();
        c1.add(50);
        c2.add("Java");
        System.out.println(c1.retrieve());
        System.out.println(c2.retrieve());
    }
}
