import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        System.out.print("Enter array length: ");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //Bubble Sort
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Sorted Order: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Search
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        System.out.print("Enter Selected item: ");
        int item=sc.nextInt();
        while(start<=end){
            if(item==arr[mid]){
                System.out.println(item+" is present in = "+mid);
                break;
            }
            else if(item>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        if(start>end){
            System.out.println(item+" is not found");
        }
    }
}
