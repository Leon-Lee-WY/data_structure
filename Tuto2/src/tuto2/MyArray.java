package tuto2;
public class MyArray <T>{
    public static<T> void listAll(T[]arr){
        for(T x:arr){
            System.out.print(x+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Integer[]first={1,2,3,4,5};
        String[]second={"Jane","Tom","Bob"};
        Character[]third={'a','b','c'};
        
        listAll(first);
        listAll(second);
        listAll(third);
    }
}

/*3. Raw type is the name for a generic class or interface without any type argument provided.
Raw type is unsafe because they completely bypass compile-time type checking.
When Java introduced generics, there were already millions of lines of older code written using raw types. 
Java allows raw types today so that all of that legacy code doesn't instantly break and can still run on modern versions of Java.*/

/*Type erasure is a process where the Java compiler removes 
all generic type information from your code during the compilation phase
Developers did not have to upgrade the Java Virtual Machine (JVM) to run programs with generics.
The existing JVMs already knew exactly how to read the erased, raw bytecode.*/
