import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter searching item: ");
        int item=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                System.out.println(item+" is present in "+i+" index position");
                count++;
            }
        }
        if(count==0){
            System.out.println("Item is not found");
        }
        System.out.println(count+" no. of items present in an array");
    }
}
