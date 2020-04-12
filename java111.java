import java.util.Scanner;

public class FirstTask {

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
        public static void main(String[] args){
            first();
            second();
        }


}
