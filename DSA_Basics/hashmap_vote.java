import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class VoteResult{
    String name ;
    int vote;
    VoteResult(String s,int v){
        name = s;
        vote = v;
    }
}
// don't change the name of this class
// you can add inner classes if needed
 class Main {
    public static void main (String[] args) {
    HashSet<String> set = new HashSet<String>();
    HashMap<String,Integer> map = new HashMap<String,Integer>();
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    while(num-->0){
        String voterId = sc.next();
        
        String partyName = sc.next();
        String vote = partyName;
        
        if(!set.contains(voterId)){
            set.add(voterId);
    
            if(map.containsKey(vote)){
                map.put(vote,map.get(vote)+1);
            }
            else{
            map.put(vote,1);}
        }
    }
     String[] party = map.keySet().toArray(new String[0]);
     Integer[] gotVote = map.values().toArray(new Integer [0]);
    
    VoteResult [] res = new VoteResult[party.length];
    for(int i = 0 ;i<res.length;i++){
        res[i] = new VoteResult(party[i],gotVote[i]);
    }
    class sorting implements Comparator<VoteResult>{
        public int compare(VoteResult v1, VoteResult v2){
            if(v1.vote == v2.vote){
                return v1.name.compareTo(v2.name);
            }
            else{
                return v2.vote - v1.vote;
            }
        }
    }
    Arrays.sort(res,new sorting());
    int maxVote = 0;
    for(VoteResult v : res){
        if(v.vote > maxVote){
            maxVote = v.vote;
        }
    }
    for(VoteResult v : res){
        if(v.vote == maxVote){
            System.out.println(v.name+" "+v.vote);
        }
    
        
    }
}
}