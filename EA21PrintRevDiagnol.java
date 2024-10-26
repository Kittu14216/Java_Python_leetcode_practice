public class EA21PrintRevDiagnol {
    public static void main(String[] args) {
        int Mat[][]={{1,2,3,9},
                     {4,5,6,9},
                     {9,7,8,9}};
                    
        for(int i=0;i<Mat.length;i++){
            int j=Mat[0].length-i-1;
            System.out.println(Mat[i][j]);
        }
    }
}
