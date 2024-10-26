import java.util.ArrayList;

public class EA23SubstringSubArray{
    public static void main(String Args[]){
        ArrayList<String>arr=new ArrayList<>();
        String S="vign";
        for(int i=0;i<S.length();i++){
            for(int j=i;j<S.length();j++){
                String temp=S.substring(i, j+1);
                arr.add(temp);
            }  
        }
System.out.println(arr);
    }
}