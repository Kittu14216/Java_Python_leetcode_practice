import java.util.HashMap;
public class EA17NumberofGoodPairsHashMap{
    public static void main(String[] args) {     
        int arr[]={1,2,1,1,1};
        HashMap<Integer,Integer>Hm=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(Hm.containsKey(arr[i])){
                count=count+Hm.get(arr[i]);
                Hm.put(arr[i],Hm.get(arr[i])+1);
            }
            else{
                Hm.put(arr[i],1);
            }
        }    
System.out.println(count);
    }
}