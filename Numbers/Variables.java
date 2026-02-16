class Variables{
    public static void main(String args[]){
        int a=333;int b=20;
        char s='a';
        float f=4.6f;
        double d=33.5;
        System.out.println(b);
        System.out.println(a);
        System.out.println(s);
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
        int sum=add(a,b);
        System.out.println("sum:"+sum);
    }
    public static int add(int a ,int b){
       return a+b;
    }
}