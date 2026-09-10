import java.util.*;
public class Average_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double avg=(double) sum/arr.length;
        System.out.print("Average of an array: "+avg);
    }
}
