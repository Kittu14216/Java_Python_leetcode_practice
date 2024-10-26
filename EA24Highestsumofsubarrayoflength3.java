public class EA24Highestsumofsubarrayoflength3{
    public static void main(String[] args) {
        int arr[]={5,9,1,8,7};
        int sum=0;
        int arrLen=3;
        for(int i=0;i<arr.length-arrLen+1;i++){
                int temp=0;
                for(int k=i;k<=i+arrLen-1;k++){
                    temp=temp+arr[k];    
                }
                sum=Math.max(sum, temp);    
        }
        System.out.println(sum);
    }
}