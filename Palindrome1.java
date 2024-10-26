import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=scanner.nextLine();
        int len=str.length();
        boolean palindrome=true;
        for(int i=0;i<len/2;i++){
            if (str.charAt(i)!=str.charAt(len-i-1)){
               palindrome=false;
               break;
            }
        }
        if (palindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        scanner.close();
    }

   
}
