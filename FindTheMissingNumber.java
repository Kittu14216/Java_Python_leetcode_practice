import java.util.ArrayList;
import java.util.List;

public class FindTheMissingNumber{
    public static void main(String[] args) {
        int []lst1={1,3,4,5,6,7,8};
        List<Integer> lst2=new ArrayList<>();
        int temp=lst1[0];
        
        for(int i=temp;i<lst1.length;i++){
            for(int num:lst1){
                if (num==i){
                    break;
                }
                else{
                    lst2.add(i);
                }
            }
        }
        System.out.println(lst2);
    }
}
error