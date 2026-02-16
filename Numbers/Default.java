class Defaultvalues{
    byte by;
    short sh;
    int i;
    long l;
    float f;
    double d;
    String s;
    boolean bo;
}
public class Default{
    public static void main(String args[]){
        Defaultvalues obj=new Defaultvalues();
        System.out.println("Default value of byte is :"+obj.by);
        System.out.println("Default value of short is :"+obj.sh);
        System.out.println("Default value of int is :"+obj.i);
        System.out.println("Default value of long is :"+obj.l);
        System.out.println("Default value of float is :"+obj.f);
        System.out.println("Default value of double is :"+obj.d);
        System.out.println("Default value of string is :"+obj.s);
        System.out.println("Default value of boolean is :"+obj.bo);
    }
}