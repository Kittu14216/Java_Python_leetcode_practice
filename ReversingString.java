public class ReversingString{
    public static void main(String args[]){
        String str="Kishore";
        String temp="";
        String temp1="";

        for(int i=0;i<str.length();i++){
            temp=str.charAt(i)+temp;
        }
        System.out.println(temp);

// Other way of reversing string
        for(int j=str.length()-1;j>=0;j--){
            temp1=temp1+str.charAt(j);
        }
        System.out.println(temp1);
    }
}