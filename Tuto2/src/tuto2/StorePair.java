package tuto2;

import java.util.Objects;

public class StorePair<T extends Comparable<T>> implements Comparable<StorePair<T>>{
    private T first,second;
    public StorePair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public String toString() {
        return "first = " + first + " second = " + second;
    }
    @Override
    public boolean equals(Object x){
        if(this==x){
            return true;}
        if (x==null||getClass()!=x.getClass()){
            return false;}
        StorePair<?> other=(StorePair<?>)x;
        return Objects.equals(this.first,other.first);
    }
    @Override
    public int compareTo(StorePair<T> other){
        return this.first.compareTo(other.first);
    }
}

class Tester{
    public static void main(String[] args) {
        StorePair a=new StorePair(6,4);
        StorePair b=new StorePair(2,2);
        StorePair c=new StorePair(6,3);
        
        if(a.equals(b)&&b.equals(c)){
            System.out.println("They are equal.");
        }
        else{
            System.out.println("Bruh they not same");
        }
        
        if(a.compareTo(b)>=0&&a.compareTo(c)>=0){
            System.out.println(a.getFirst());
        }
        else if(b.compareTo(a)>=0&&b.compareTo(c)>=0){
            System.out.println(b.getFirst());
        }
        else{
            System.out.println(c.getFirst());
        }
    }
}
