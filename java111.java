import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    public static void third(){
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

    public static void array1() {
        System.out.println("task1");
        List<Integer> numList = inputNumbers();
        Integer[] evenList = numList.stream().filter(i -> i % 2 == 0).toArray(Integer[]::new);
        Integer[] oddList = numList.stream().filter(i -> i % 2 == 1).toArray(Integer[]::new);

        List<Integer> resList = Stream.concat(Stream.of(evenList), Stream.of(oddList)).collect(Collectors.toList());

        System.out.println(resList);
        System.out.println("--------------------------");
    }

    public void array2() {
        System.out.println("task2");
        List<Integer> numList = inputNumbers();

        List<Integer> resList = numList.stream()
                .filter(i -> i % 3 == 0 || i % 9 == 0).collect(Collectors.toList());

        System.out.println(resList);
        System.out.println("--------------------------");
    }

    public void array3() {
        System.out.println("task3");
        List<Integer> numList = inputNumbers();

        List<Integer> resList = numList.stream()
                .filter(i -> i % 5 == 0 || i % 10 == 0).collect(Collectors.toList());

        System.out.println(resList);
    }

    public void array4() {
        System.out.println("task4");
        List<Integer> numList = inputNumbers();

        int gcd = findGCD(numList);
        int lcm = fingLCM(numList);

        System.out.println("gcd: " + gcd);
        System.out.println("lcm: " + lcm);
        System.out.println("--------------------------");
    }

    private static List<Integer> inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numList.add(scanner.nextInt());
        }
        return numList;
    }

    private int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private int findGCD(List<Integer> list) {
        int result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result = gcd(list.get(i), result);

            if (result == 1) {
                return 1;
            }
        }

        return result;
    }

    private int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private int fingLCM(List<Integer> list) {
        int result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result = lcm(result, list.get(i));
        }
        return result;
    }

    public void array5() {
        System.out.println("task5");
        List<Integer> numList = inputNumbers();

        List<Integer> resList = numList.stream()
                .filter(this::isPrime)
                .collect(Collectors.toList());

        System.out.println(resList);
        System.out.println("--------------------------");
    }

    private boolean isPrime(int n) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .allMatch(i -> n % i != 0);
    }

    public void array6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("task6");
        String numString = scanner.nextLine().trim();
        int length = numString.length();

        if (length == 1) {
            System.out.println("YES");
            return;
        }

        int num1, num2;
        if (length % 2 == 0) {
            num1 = Integer.parseInt(numString.substring(0, length / 2));
            num2 = Integer.parseInt(numString.substring(length / 2, length));
        } else {
            num1 = Integer.parseInt(numString.substring(0, length / 2));
            num2 = Integer.parseInt(numString.substring(length / 2 + 1, length));
        }

        if (getNumSum(num1) == getNumSum(num2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println("--------------------------");
    }

    private int getNumSum(int n) {
        int sum = 0;
        for (; n != 0; n /= 10) {
            sum += (n % 10);
        }
        return sum;
    }

    public static void array7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("task7");

        String[] numbers = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

        int n = scanner.nextInt();

        System.out.println(numbers[n]);
        System.out.println("--------------------------");
    }

    public static void main(String[] args){
        //  first();
        //  second();
        //  third();
        //  fourth();
        //  fives();
        //  six();

        //array1();
        //array2();
        //array3();
        //array4();
        //array5();
        //array6();
        //array7();

    }

}
