import java.util.*;
public class Swap_First_Last {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Before Swapping: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int temp;
        temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        System.out.println();
        System.out.print("After Swapping: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
