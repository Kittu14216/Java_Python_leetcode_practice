public class TwoSum {
    public static void main(String[] args) {
        int [] lst={7, 4, 5, 6, 1,2, 8, 9};
        int target=8;
        for(int i=0;i<lst.length;i++){
            for(int j=0;j<lst.length;){
                if(lst[i]+lst[j]==target){
                    System.out.println(i+" "+j);
                    
                }
                break;
            }

        }
    }
}
