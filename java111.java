 import java.util.Scanner;

public class Сonditional {
    public static void first() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int input = in.nextInt();

        System.out.println("Enter second number: ");
        int input2 = in.nextInt();

        int squad = (input * input) + (input2 * input2);
        int quads = (input + input2) * (input + input2);

        if ( squad > quads ) {
            System.out.println(  squad + " more then : " + quads);
        }
        if ( quads > squad ) {
            System.out.println( quads  + " more then : " + squad);
        }
        else{
            System.out.println(squad + " = " + quads);
        }
    }

    public static void second (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");

        float salary = in.nextFloat();
        float experience = in.nextFloat();

        if (experience >= 2 && experience <5){
            double premium = salary * 0.02;
            System.out.println(premium + " // " + (premium+salary));
        }
        if (experience > 5 && experience < 10){
            double premium = salary * 0.15;
            System.out.println(premium + " // " + (premium +salary));
        }
    }

    public static void thred(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter point A: ");

        int x1 = in.nextInt();
        int x2 = in.nextInt();

        System.out.println("Enter point B: ");
        int y1 =  in.nextInt();
        int y2 = in.nextInt();

        int a = x1*x1+y1*y1;
        int b = x2*x2+y2*y2;

        if (a < b){
            System.out.println("closer point A");
        }
        else if (b < a){
            System.out.println("closer point B");
        }
        else{
            System.out.println("equidistant");
        }
    }

    public static void fourth(){
        Scanner in = new Scanner(System.in);
        System.out.println("");

        int a = in.nextInt();
        int b = in.nextInt();
        int c =  in.nextInt();

        if ((a + b) > c && (b + c) > a && (c + a) > b){
            System.out.println("triangle exist");
        }
        else {
            System.out.println("triangle is not exist");
        }

    }

    public static void fives(){
        Scanner in = new Scanner(System.in);
        System.out.println("");

        int a = in.nextInt();
        int b = in.nextInt();
        int c =  in.nextInt();

        if (a > 0) a = a * a;
        if (c > 0) c = c * c;
        if (b > 0) b = b * b;
    }

    public static void six() throws NumberFormatException {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        int a = in.nextInt();


        if (a < 1 || a > 12) {
            System.out.println("not correct");
        }

        if (3 <= a && a <= 5){
            System.out.println("Spring");
        }
        if (6 <= a && a <= 8){
            System.out.println("Summer");
        }
        if (9 <= a && a <= 11){
            System.out.println("autumn");
        }
        if ((1 <= a && a <= 2) || a == 12 ){
            System.out.println("Winter");
        }


    }

    public static void main(String[] args){
      //  first();
      //  second();
      //  thred();
      //  fourth();
      //  fives();
      //  six();
    }

}

