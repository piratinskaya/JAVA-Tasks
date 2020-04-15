import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Book {

    private String name;
    private double price;
    private int pageAmount;
    private int publicationYear;

    public Book() {
    }

    public Book(String name, double price, int pageAmount, int year) {
        this.name = name;
        this.price = price;
        this.pageAmount = pageAmount;
        this.publicationYear = year;
    }

    public double getAveragePrice() {
        return price / pageAmount;
    }

    public int getDaysAfterPublication() {
        Calendar currCcalendar = new GregorianCalendar();
        Calendar calendar = new GregorianCalendar(publicationYear, 0, 0);
        return (int) ((currCcalendar.getTime().getTime() - calendar.getTime().getTime()) / (1000 * 60 * 60 * 24));
    }

    @Override
    public String toString() {
        return "Book: " + name + "\n"
                + "Price: " + price + "\n"
                + "Page amount: " + pageAmount + "\n"
                + "Publication year: " + publicationYear + "\n";
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.print("Input price: ");
        double price = in.nextDouble();

        System.out.print("Input pageAmount: ");
        int pageAmount = in.nextInt();

        System.out.print("Input year: ");
        int year = in.nextInt();

        Book book = new Book(name, price, pageAmount, year);
        System.out.println(book.toString());

        System.out.println("Average price: " + book.getAveragePrice());
        System.out.println("Days after publication: " + book.getDaysAfterPublication());

        System.out.println("-------------------------------");

    }

}