import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int temp,j;
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            j=i;
            while (j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
        System.out.print("Insertion Sort: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
