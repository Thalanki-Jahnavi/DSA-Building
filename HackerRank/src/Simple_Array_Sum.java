public class Simple_Array_Sum {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 10, 1};
        int sum=0;
        for(int i:arr){
            sum=sum+i;
        }
        System.out.println("Sum of an array: "+sum);
    }
}
