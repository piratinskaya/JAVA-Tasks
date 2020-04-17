import java.util.*;

public class Main {
    // сортировка
    public static void task1() {
        System.out.print("N = ");
        int n = new Scanner(System.in).nextInt();
        Integer[] a = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 120 - 20);
            System.out.printf("%d ", a[i]);
        }
        List<Integer> l = Arrays.asList(a);
        Collections.sort(l, Collections.<Integer>reverseOrder());

        System.out.print("\nОтсортированный массив:\n");
        for (int el : l) {
            System.out.printf("%d ", el);
        }
    }
    // сумма элементов
    public static void task2() {
        System.out.print("N = ");
        int n = new Scanner(System.in).nextInt();
        Integer[] a = new Integer[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 120 - 20);
            sum += a[i];
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\nСумма элементов = %d\n", sum);
    }

    public static void task3() {
        System.out.print("Введите число: ");
        int n = new Scanner(System.in).nextInt();

        Map<String, List<Integer>> m = new HashMap<>();
        List<Integer> l1 = new ArrayList<Integer>() {{
            add(5);
            add(3);
            add(28);
            add(16);
        }};
        List<Integer> l2 = new ArrayList<Integer>() {{
            add(89);
            add(112);
            add(178);
        }};
        m.put("Кашель", l1);
        m.put("Температура", l2);

        boolean fl = false;
        for (Map.Entry<String, List<Integer>> ent : m.entrySet()) {
            if (fl) break;
            for (int el : ent.getValue()) {
                if (el == n) {
                    fl = true;
                    break;
                }
            }
        }
        if (fl) System.out.print("Такое значение уже есть.");
        else System.out.print("Такого значения нет.");
    }

    public static void task4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите числа для LinkedList (через пробел): ");
        LinkedList<Integer> li = new LinkedList<>();

        String[] nums = scan.nextLine().split("\\s+");
        for (String s : nums) {
            if (s.equals("")) break;
            li.add(Integer.parseInt(s));
        }

        System.out.print("Какие числа вставить в начало (через пробел): ");
        List<Integer> beg = new ArrayList<>();
        nums = scan.nextLine().split("\\s+");
        for (String s : nums) {
            if (s.equals("")) break;
            beg.add(Integer.parseInt(s));
        }

        System.out.print("Какие числа вставить в конец (через пробел): ");
        List<Integer> en = new ArrayList<>();
        nums = scan.nextLine().split("\\s+");
        for (String s : nums) {
            if (s.equals("")) break;
            en.add(Integer.parseInt(s));
        }

        for (int i = beg.size() - 1; i >= 0; i--) {
            li.addFirst(beg.get(i));
        }
        for (int el : en) {
            li.addLast(el);
        }

        System.out.print(li);
    }

    public static void task5() {

        System.out.print("Введите число: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Введите элементы массива (через пробел): ");
        List<Integer> l = new ArrayList<>();
        String[] nums = new Scanner(System.in).nextLine().split("\\s+");
        for (String s : nums) {
            if (s.equals("")) break;
            l.add(Integer.parseInt(s));
        }

        int i = -1;
        for (i = 0; i < l.size(); i++) {
            if (l.get(i) == n)
                System.out.printf("Индекс элемента: %d", i);
        }
        if (i == -1) {
            System.out.print("Число не найдено в массиве");
        }

    }

    public static void task6() {
        Caller c1 = new Caller("Управление Роспотребнадзора по Саратовской области", "88001001858", "Саратов");
        Caller c2 = new Caller("ФБУЗ \"Центр гигиены и эпидемиологии в Саратовской области\"", "8452333875", "Саратов");
        c2.setName("Телефоны горячей линии по коронавирусу");
        c1.getInfo();
        c2.getInfo();
    }


    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();

    }
}