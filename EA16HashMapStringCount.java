import java.util.HashMap;
public class EA16HashMapStringCount {
    public static void main(String[] args) {
        HashMap<String,Integer> Hm=new HashMap<>(); 
        String arr[]={"Hello","hai","How","hai","hai"};
        for(int i=0;i<arr.length;i++){
            // if(Hm.containsKey(arr[i])){
            //     int prev=Hm.get(arr[i]);
            //     Hm.put(arr[i],prev+1);
            // }
            // else{
            //     Hm.put(arr[i],1);
            // }
            Hm.put(arr[i],Hm.getOrDefault(arr[i],0)+1);
        }
        for(String count:Hm.keySet()){
            System.out.println(count+" "+Hm.get(count));
        }
    }
}
