public class brakets {
    public static void main(String[] args) {
        String s = "{}{{}{{{}}}{}}";
        boolean chk = true;
        int sum=0;
        
        for (int i = 0; i < s.length(); i++) {
            
            int c = s.charAt(i);
            if(c==123){
                c = 1;
            }
            if(c==125){
                c = -1;
            }
            System.out.println(sum);
            System.out.println(c);
            sum += c;
            
            if(sum<0){
                chk = false;
            }
        }
        if(chk==false){
            System.out.println("Brakets incomplete");
        }
        else{
            System.out.println("Brakets Complete");
        }
    }
}
