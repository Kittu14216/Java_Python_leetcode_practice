public class EA25OptimalHighestsumofsubarrayoflength3 {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6};
        int ans=0;
        int temp=0;
        int l=0;
        int sl=3;
        for(int r=0;r<arr.length;r++){
            temp+=arr[r];
           if(r-l==sl){
            temp-=arr[l];
            l++;
            
           }
            if(r-l+1==sl){
                ans=Math.max(ans,temp);
            }
        }
        System.out.println(ans);
    }
}
