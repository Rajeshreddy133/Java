import java.util.*;
class FrequencyOfEachChar{
    void charFrequency(String s){
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            int count=0;
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (s.charAt(i) == s.charAt(k)) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue;
            for(int j=0;j<s.length();j++)
            {
                char b=s.charAt(j);
                if(a==b)
                {
                    count++;
                }
            }
            System.out.println("Frequency of "+a+" is : "+count);
        }
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        FrequencyOfEachChar fc=new FrequencyOfEachChar();
        String s=sc.nextLine();
        fc.charFrequency(s);
    }
}