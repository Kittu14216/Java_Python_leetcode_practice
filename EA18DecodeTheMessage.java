import java.util.HashMap;
public class EA18DecodeTheMessage {
    public static void main(String[] args) {
        String key= "the quick brown fox jumps over the lazy dog"; String message = "vkbs bs t suepuv";
        String s="";
        int num=97;
        HashMap<Character,Character>Hm=new HashMap<>();
        for(int i=0;i<key.length();i++){
            if(!Hm.containsKey(key.charAt(i))&& key.charAt(i)!=' '){
                Hm.put(key.charAt(i),(char)num);
                num++;
            }   
        }
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                s=s+' ';
            }
            else{
            s=s+Hm.get(message.charAt(i));
            }
        }
        System.out.println(s);
    }
}
