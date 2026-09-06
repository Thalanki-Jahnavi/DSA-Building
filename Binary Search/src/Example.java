public class Example {
    public static void main(String[] args) {
        int nums[]={10,20,30,40,50};
        int start=0;
        int end=nums.length-1;
        int target=40;
        int result=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                result=mid;
                break;
            } else if (nums[mid]>target) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        System.out.println(result);
    }
}
