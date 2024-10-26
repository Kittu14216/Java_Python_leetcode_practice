public class EA6ASCII{
    public static void main(String[] args) {
        String s="hello";
        int temp=0;
        for (int i=0;i<s.length()-1;i++){
            int first=s.charAt(i);
            int second=s.charAt(i+1);
            int res=Math.abs(first-second);
            temp=res+temp; 
        }
        System.out.println(temp);
    }
}