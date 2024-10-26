import java.util.HashMap;
public class EA15HashMap {
    public static void main(String[] args) {
        // A HashMap in Java is a collection that stores data in key-value pairs. It uses a hashing function to convert the key into an index, which helps in quick access to values. The key must be unique, and the value can be accessed using its corresponding key.
        HashMap<Integer,Integer> Hm=new HashMap<>();
        int arr[]={1,2,3,4,3,1,1,1,2,3,3,3,3,1,3,4,4,4,5};
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            if(Hm.containsKey(n)){
                int prev=Hm.get(n);
                Hm.put(n,prev+1);
            }
            else{
                Hm.put(n,1);
            }
        }
        for(int count:Hm.keySet()){
            System.out.println(count+"  -->  "+Hm.get(count));
        }
    }
}
