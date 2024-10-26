import java.util.HashMap;

public class EA18IsomorphicStrings {
    public static void main(String[] args) {
        String s = "dabc";
        String t = "dadc";
        boolean a=true;
        HashMap<Character,Character>Hm=new HashMap<>();
        HashMap<Character,Character>rev=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!Hm.containsKey(s.charAt(i)) && (!rev.containsKey(t.charAt(i)))){
                Hm.put(s.charAt(i),t.charAt(i));
                rev.put(t.charAt(i),s.charAt(i));
            }
            else if(Hm.containsKey(s.charAt(i)) && Hm.get(s.charAt(i))!=t.charAt(i)){
                a=false;
            }
            else if(rev.containsKey(t.charAt(i)) && rev.get(t.charAt(i))!=s.charAt(i)){
                a=false;
            }
        }
        System.out.println(a);
    }
}
