
public class AccentureCode {
    public static String checkDifference(String A, String B) {
        int count1 = 0;
        int count2 = 0;
        int diff = 0;  
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == ' ') {
                count1++;
            }
        }
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == ' ') {
                count2++;
            }
        }
        diff = Math.abs(count2 - count1);
        if (diff % 2 == 0) {
            return "Even" + diff;
        } 
        else {
            return "Odd" + diff;
        }
          
    }
    public static void main(String[] args) {
        String A = "Mer cer M  e  t  t    l";
        String B = "Mer cer Met tl";
        String result = checkDifference(A, B);
        System.out.println(result);
    }
}

