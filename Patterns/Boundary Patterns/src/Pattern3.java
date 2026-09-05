public class Pattern3 {
    public static void main(String[] args) {
        int n=11;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==11 || j==1 || j==11 || i+j==n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
