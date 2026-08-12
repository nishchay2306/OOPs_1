package oops_1;

public class Student {
    String name;
    int rollno;
    int marks;
    public static void main()
    {
        Student stu = new Student("Nishchay",23);
        stu.display();
    }
    Student(String name,int rollno)
    {
        this(name,rollno,-1);
    }
    Student(String name,int rollno,int marks)
    {
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
   void display()
    {
        System.out.println(this.name);
        System.out.println(this.rollno);
        System.out.println(this.marks);
    }
}
