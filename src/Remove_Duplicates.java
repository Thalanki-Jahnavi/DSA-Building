import java.util.*;
public class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int count=0;
            for (int j=0;j<i;j++){
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
            if(count==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
