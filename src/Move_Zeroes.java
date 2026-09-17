import  java.util.*;
public class Move_Zeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int temp[]=new int[arr.length];
        int lastIndex=arr.length-1;
        int firstIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                temp[lastIndex]=arr[i];
                lastIndex--;
            }
            else {
                temp[firstIndex]=arr[i];
                firstIndex++;
            }
        }
        System.out.println("New Array: ");
        for (int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
