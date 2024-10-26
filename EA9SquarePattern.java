public class EA9SquarePattern {
    public static void main(String[] args) {
        int n=5;
        // ================================
        // for(int i=0;i<n;i++){
            
        //     for(int j=0;j<n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
        // ================================in this space is printed in last column
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
                if(j!=n-1){
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }
}
