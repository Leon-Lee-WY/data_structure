package tuto2;
public class MinMaxTwoDArray {
    public static <E extends Comparable<E>> E min(E[][] list){
        if(list==null||list.length==0||list[0].length==0){
            return null;
        }
        E min=list[0][0];
        for(int x=0;x<list.length;x++){
            for(int y=0;y<list[x].length;y++){
                if(list[x][y].compareTo(min)<0){
                    min=list[x][y];
                }
            }
        }
        return min;
    }
        public static <E extends Comparable<E>> E max(E[][] list){
        if(list==null||list.length==0||list[0].length==0){
            return null;
        }
        E max=list[0][0];
        for(int x=0;x<list.length;x++){
            for(int y=0;y<list[x].length;y++){
                if(list[x][y].compareTo(max)>0){
                    max=list[x][y];
                }
            }
        }
        return max;
    }
        public static void main(String[] args) {
        Integer[][]arr={{3,3,4},{9,1,10},{7,2,8}};
            System.out.println(min(arr));
            System.out.println(max(arr));
    }
}
