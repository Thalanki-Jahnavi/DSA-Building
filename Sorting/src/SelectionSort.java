import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int min,temp;
        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.print("Selection Sort: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
