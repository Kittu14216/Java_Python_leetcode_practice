import java.util.Arrays;
public class EA12ReplaceElementswithGreatestElementonRightSide {
    public static void main(String[] args) {
        int arr[]={17,18,5,4,6,1};
        //=============================================================
        // for(int i=0;i<arr.length;i++){//17
        //     int rightmax=-1;
        //     for(int j=i+1;j<arr.length;j++){//18
        //         rightmax=Math.max(rightmax,arr[j]); 
        //     }
        //     arr[i]=rightmax;
        // }
        //============================================================
        int rightmax=-1;
        for(int i=arr.length-1;i>=0;i--){
            int prev=arr[i];
            arr[i]=rightmax;
            rightmax=Math.max(rightmax,prev);  
        }
        System.out.println(Arrays.toString(arr));
    }
}
