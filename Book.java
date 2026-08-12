package oops_1;

public class Book {
String title;
String author;
double price;
public static void main()
{
    Book mybook = new Book();
    System.out.println(mybook.title);
    System.out.println(mybook.author);
    System.out.println(mybook.price);

    mybook.title="haunting adeline";
    mybook.author="nishchay";
    mybook.price=98.88;

    System.out.println(mybook.title);
    System.out.println(mybook.author);
    System.out.println(mybook.price);


}
}
