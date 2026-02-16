class Human{
    private int age;
    private String name;
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    public String getName(){
        return name;
    }
    public void setName(String s){
        name=s;
    }
}
class Encapsulation{
    public static void main(String args[]){
        Human obj=new Human();
       obj.setAge(25);
       obj.setName("John");
       System.out.println("Name: "+obj.getName()+":"+obj.getAge());
        //obj.name="john";
        //obj.age=34;
        //System.out.println("Name :"+name+":"+age);
    }
}
    