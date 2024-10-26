import java.util.*;
public class EA19SetMismatch{
    public static void main(String []args){
        int arr[]={1,2,3,3,4};
        HashSet<Integer>Hs=new HashSet<>();
        int duplicate=-1; 
        int missing=-1;
        for(int i=0;i<arr.length;i++){
            if(Hs.contains(arr[i])){
                duplicate=arr[i];
            }
            Hs.add(arr[i]);  
        }
        for(int i=1;i<arr.length+1;i++){
            if(!Hs.contains(i)){
                missing=i;
            }
        }
int returningArr[]={duplicate,missing};
System.out.println(Arrays.toString(returningArr));
    }
}