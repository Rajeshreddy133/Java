import java.util.Scanner;

public class Anagrams{

    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length())
        return false;
        char[] ch1=a.toLowerCase().toCharArray();
        char[] ch2=b.toLowerCase().toCharArray();
        
        for(int i=0;i<ch1.length-1;i++)
        {
            for(int j=0;j<ch1.length-i-1;j++)
            {
                if(ch1[j]>ch1[j+1])
                {
                    char temp=ch1[j];
                    ch1[j]=ch1[j+1];
                    ch1[j+1]=temp;
                }
            }
        }
        for(int i=0;i<ch2.length-1;i++)
        {
            for(int j=0;j<ch2.length-i-1;j++)
            {
                if(ch2[j]>ch2[j+1])
                {
                    char temp=ch2[j];
                    ch2[j]=ch2[j+1];
                    ch2[j+1]=temp;
                }
            }
        }
        for(int i=0;i<=ch1.length-1;i++)
        {
            if(ch1[i]!=ch2[i])
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}