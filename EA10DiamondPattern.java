public class EA10DiamondPattern {
    public static void main(String[] args) {
        int n=5;
        // by placing n-1 in condition we delete last line of pyramid or by placing n-2 in initialzation in reverse pyramid
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(i*2+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(i*2+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
