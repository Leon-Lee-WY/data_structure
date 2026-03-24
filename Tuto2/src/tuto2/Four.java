package tuto2;
public class Four {
    public static <T extends Comparable<T>> String minmax(T[]arr){
        if (arr==null||arr.length==0) {
            return "Array is empty";
        }
        T min=arr[0];
        T max=arr[0];
        
        for(int x=0;x<arr.length-1;x++){
            if(arr[x].compareTo(arr[x+1])>0){
                max=arr[x];
            }
            if(arr[x].compareTo(arr[x+1])<0){
                min=arr[x];
            }
        }
        return "min = "+min+", max = "+max;
    }
    public static void main(String[] args) {
        String[]name={"John","Ant","Chris","Jill"};
        System.out.println(minmax(name));
    }
}
