public class EA12MaxdiffBetweenIncreasingarr{
    public static void main(String[] args) {
        int arr[]={9,4,3,2};
        // int diff=-1;
        // int temp=0;
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         // System.out.println(i+" "+j);
        //         if(arr[j]>arr[i]){
        //             temp=arr[j]-arr[i];//5-1
        //             diff=Math.max(diff, temp);
        //         }    
        //     }
        // }
        // System.out.println(diff); 
        int diff=-1;
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>temp){
            diff=Math.max(diff,arr[i]-temp);
            }
            if(arr[i]<temp){
                temp=arr[i];
            }
        }
        System.out.println(diff);
    }
}


