// Find the maximum number words in an senetence
public class EA8FindTheMaxWords {
    public static void main(String[] args) {
        int ans=0;
        String[] arr={"my name is Kittu","Iam going to school everyday","i like tasty food","as as as asas as as as as as"};
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)==' '){
                    count=count+1;
                }

            }
            if (count>ans){
                ans=count;
            }
        }
        System.out.println(ans);
    }
}
