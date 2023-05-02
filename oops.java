// 1st example

/* class Pen// create class named as pen
{
    String color;
    String type;

    // call method
    public void write()// method write
    {
        System.out.println("Write anywhere");
    }
}
public class oops {// main class
    public static void main(String args[])
    {
        Pen pen1 = new Pen();// objects
        pen1.color = "blue";
        pen1.type="gel";
        pen1.write();
    }
}*/
// 2nd example

/* 
class Student{
    String name;
    int age;


    // create method function
    public void read()
    {
        System.out.println("read in b.tech cse");
    }
}

public class oops{
    public static void main(String args[])
    {
        Student studentName = new Student();
        studentName.age=21;
        studentName.name="Sayani";
        System.out.print(studentName.name);
        System.out.print(" ");
        studentName.read();
    }
}*/


// 3rd example
class student1{
    String Name;
    int age;
/*
student1()// non parameter construcor
{
    System.out.println("constructor called");
} */
/*
student1(String name, int age)// paramitereize constructor
{
    this.Name = name;
    this.age =age;
}  */


// copy constructor

student1(student1 s2)
{
    this.Name = s2.Name;
    this.age = s2.age;
}

    public void Info()
    {
       System.out.println(this.Name); 
       System.out.println(this.age); 
    }
student1()
{

}
}
public class oops{
    public static void main(String args[])
    {
        student1 st = new student1();// student()---> constructor 
        st.Name="aman";
        st.age = 22;
        student1 s2 = new student1(st);
        s2.Info();
    }
}












