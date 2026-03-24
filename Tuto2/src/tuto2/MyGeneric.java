package tuto2;
public class MyGeneric<T>{
    private T e;
    MyGeneric(){}
    
    void setMyGeneric(T x){
        e=x;
    }
    T getMyGeneric(){
        return e;
    }
    public static void main(String[] args) {
        MyGeneric<String> strObj=new MyGeneric();
        MyGeneric<Integer> intObj=new MyGeneric();
        intObj.setMyGeneric(69);
        strObj.setMyGeneric("sixnine");
        System.out.println(intObj.getMyGeneric());
        System.out.println(strObj.getMyGeneric());
    }
}
