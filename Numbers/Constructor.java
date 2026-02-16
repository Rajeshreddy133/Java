class Human{
    String name;
    int age;
    //Human(){
    //    System.out.println("this is a constructor");
    //}
    Human(int age,String name){
       age=45;
       name="madhu";
    }
}
class Constructor{
    public static void main(String args[]){
        Human obj=new Human();
    }
}