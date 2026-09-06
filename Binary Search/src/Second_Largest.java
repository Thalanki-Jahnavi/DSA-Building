public class Second_Largest {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int lar=-1;
        int slar=-1;
        for(int num:arr){
            if(num>lar){
                slar=lar;
                lar=num;
            }
            else if((num<lar) && (num>slar)){
                slar=num;
            }
        }
        System.out.println(slar);
    }
}
