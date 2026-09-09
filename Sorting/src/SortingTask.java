import java.util.*;
public class SortingTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array1 size: ");
        int size1= sc.nextInt();
        int a[]=new int[size1];
        System.out.println("Enter array1 elements: ");
        for (int i=0;i<size1;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter array2 size: ");
        int size2= sc.nextInt();
        int b[]=new int[size2];
        System.out.println("Enter array2 elements: ");
        for (int i=0;i<size2;i++){
            b[i]=sc.nextInt();
        }
        // Bubble Sort
        int temp1;
        for(int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp1=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp1;
                }
            }
        }
        System.out.print("Bubble Sort: ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        // Insertion Sort
        int temp2,j;
        for(int i=1;i<b.length;i++){
            temp2=b[i];
            j=i;
            while (j>0 && b[j-1]>temp2){
                b[j]=b[j-1];
                j--;
            }
            b[j]=temp2;
        }
        System.out.println();
        System.out.print("Insertion Sort: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        int[] arr3=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            arr3[i]=a[i];
        }
        for (int i=0;i<b.length;i++){
            arr3[a.length+i]=b[i];
        }
        System.out.println();
        System.out.print("After Merging: ");
        for (int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        // Insertion Sort
        int temp3,k;
        for(int i=1;i<arr3.length;i++){
            temp3=arr3[i];
            k=i;
            while (k>0 && arr3[k-1]>temp3){
                arr3[k]=arr3[k-1];
                k--;
            }
            arr3[k]=temp3;
        }
        System.out.println();
        System.out.print("Result: ");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
