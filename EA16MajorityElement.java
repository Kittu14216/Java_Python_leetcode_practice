// import java.util.Arrays;
import java.util.HashMap;

public class EA16MajorityElement {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        HashMap<Integer,Integer>Hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(Hm.containsKey(arr[i])){
                int prev=Hm.get(arr[i]);
                Hm.put(arr[i],prev+1);
            }
            else{
                Hm.put(arr[i],1);
            }
            // Hm.put(arr[i],Hm.getOrDefault(Hm, 0)+1);
        }
        int res=0;
        for(int H:Hm.keySet()){
            int keyVal=Hm.get(H);
            if(keyVal>arr.length/2){
                res=H;
                break;
            }
        } 
        System.out.println(res); 
    }
}


// public class EA16MajorityElement {
//     public static void main(String[] args) {
// int arr[]={1,2,2,1,1,3};
// Arrays.sort(arr);
// int n=arr.length/2;
// System.out.println(arr[n]);

// }}