import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Any String: ");
        String str=scanner.nextLine();
        String temp="";
        for(int i=0;i<str.length();i++){
            temp=str.charAt(i)+temp;
        }
        if (temp.toLowerCase().equals(str.toLowerCase())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        scanner.close();
    }

}
