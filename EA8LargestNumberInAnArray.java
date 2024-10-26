public class EA8LargestNumberInAnArray {
    public static void main(String[] args) {
        int []arr={5,8,10,11,50,65,100,15,20,25};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            //=========================
            // ans=Math.max(ans,arr[i]);
            //=========================
            if(arr[i]>ans){
                ans=arr[i];
            }  
        }
        System.out.println(ans);
        
    }
}
