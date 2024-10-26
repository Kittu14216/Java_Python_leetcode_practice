public class EA12TwoFurthestHousesWithDifferentColors{
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,1};
        //========================================================================================
        // int diff=0;
        // int temp=0;
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]!=arr[j]){
        //             temp=Math.abs(i-j);//temp=j-1 beacuse j index always higher than i
        //             diff=Math.max(temp,diff);
        //         }
        //     }
        // }
        //=========================================================================================
        int diff=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[arr.length-1]!=arr[i]){//-1 index constant and i looping
                diff=Math.max(diff,arr.length-1-i);
                break;
            }
        }
        for(int i=arr.length-1;i>0;i--){
            if(arr[0]!=arr[i]){//0 index set to constant and negative index looping
                diff=Math.max(diff,i-0);
                break;
            }
        }
        //=========================================================================================
        System.out.println(diff);
    }
}