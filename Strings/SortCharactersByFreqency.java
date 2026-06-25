import java.util.*;
class SortCharactersByFreqency{
    public static String frequencySort(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Character>list=new ArrayList(hm.keySet());
        list.sort((a,b)->hm.get(b)-hm.get(a));
        StringBuilder sb=new StringBuilder();
        for(char c:list){
            int freq=hm.get(c);
            for(int i=0;i<freq;i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the String : ");
        String s=sc.nextLine();
        System.out.println(frequencySort(s));
    }
}