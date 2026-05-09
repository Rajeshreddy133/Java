import java.util.Scanner;
class RemoveOccurrences{
    public static String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>=part.length()){
            int pos=sb.indexOf(part);
            if(pos==-1){
                break;
            }
            sb.delete(pos,pos+part.length());
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        System.out.println("Enter the Pattern : ");
        String part=sc.nextLine();
        System.out.println(removeOccurrences(s,part));
    }
}