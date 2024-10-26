
public class  CountingOnesInArr{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,3,1,1,1,2,3,4,5,5,6,6,6,6,5,4,32,2,2,11,3,4,1,3,1};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count+=1;
            }
        }
        System.out.println(count);

    }
}