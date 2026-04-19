import java.util.Scanner;
class RotateString{
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String str=s+s;
        if(str.contains(goal)){
            return true;
        }
        return false;
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the Main String : ");
        String str=sc.nextLine();
        System.out.println("Entyer the Goal String : ");
        String goal=sc.nextLine();
        System.out.println(rotateString(str,goal));
    }
}