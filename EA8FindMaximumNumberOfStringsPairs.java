public class EA8FindMaximumNumberOfStringsPairs {
    public static void main(String[] args) {
        String []words={"cd","ac","dc","ca","zz",};
        int count=0;
        for(int i=0;i<words.length;i++){
            String c="";
            for(int j=0;j<words[i].length();j++){
                c=words[i].charAt(j)+c;//dc   
            }
            System.out.println(c);
            for(int x=i+1;x<words.length;x++){
                if (c.equals(words[x])){
                    count=(count+1);
                }
            }
        }
        System.out.println(count);
    }
}
