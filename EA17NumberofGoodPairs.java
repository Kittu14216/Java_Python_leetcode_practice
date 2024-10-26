public class EA17NumberofGoodPairs{
    public static void main(String[] args) {
        int arr[]={1,1,1,1};
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(i+" "+j);
                    count=count+1;
                }
            }
        }
        System.out.println(count);
    }
}