import java.util.*;
public class EA22PascalsTriangle{
    public List<List<Integer>> generate(int numrows){
        List<List<Integer>> Ans=new ArrayList<>();
        List<Integer>tempArraylist=new ArrayList<>();
        tempArraylist.add(1);
        Ans.add(tempArraylist);
        for(int i=1;i<numrows;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++){
                temp.add(Ans.get(i-1).get(j)+Ans.get(i-1).get(j-1));
            }
            temp.add(1);
            Ans.add(temp);
        }
        return Ans;
        
    }
    public static void main(String args[]){
        EA22PascalsTriangle obj=new EA22PascalsTriangle();
        List<List<Integer>> res=obj.generate(5);
        System.out.println(res);
    }
      
}