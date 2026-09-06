import java.util.*;

public class Mini_Max_Sum {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        long sum=0;
        for(int i:ar){
            sum=sum+i;
        }
        System.out.println((sum- Collections.max(ar))+" "+(sum-Collections.min(ar)));
    }
}
