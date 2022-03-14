public class A_OOP {
    // person class 
    private static class Person{
        String name;
        int age;
        
        void sayHi(){
            System.out.println("Hello my name is "+this.name+" and I am "+this.age+" years old");
        }
    }
    // person class end
    public static void main(String []arg){
        // object 1
        Person p1 = new Person();
        p1.name = "Humayun Anwar Khan";
        p1.age = 24;
        p1.sayHi();
        
        // object 2
        Person p2 = new Person();
        p2.name = "Dilber Husain Khan";
        p2.age = 24;
        p2.sayHi();
        
        //
        Person p3 = p2; // here , we are not using new keyword so no new instance is created 
        p3.name = "Husain";  //p3 point the instance of p2 and it also make changes in p2
        p3.age = 25; 
        p3.sayHi();
        p2.sayHi();

    }

}
