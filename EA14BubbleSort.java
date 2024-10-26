import java.util.Arrays;
public class EA14BubbleSort {
    public static void main(String[] args) {
        int arr[]={9,0,8,4,6,2};
        //=========================================================================================================
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-i-1;j++){//arr.length-i-1 nothing n-i-1 beacuase evertime in the loop biggest element sends to last so we dont need to swap last element
        //         if(arr[j]>arr[j+1]){//we change the symbol to > for desecendind order
        //         int temp=arr[j];
        //         arr[j]=arr[j+1];
        //         arr[j+1]=temp;
        //         }
        //     }   
        // }
        // this sorting code takes O(n2)

        // so java developers introduce Arrays.sort() method
        //=============================================================================================================
        Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    }
}
