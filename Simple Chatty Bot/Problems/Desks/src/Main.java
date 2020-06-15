import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int table;
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        int c3 = scan.nextInt();
        if (c1 % 2 == 1) {
            c1 += 1;
        }
        if (c2 % 2 == 1) {
            c2 += 1;
        }
        if (c3 % 2 == 1) {
            c3 += 1;
        }
        table = (c1 + c2 + c3) / 2;
        System.out.print(table);
    }
}
//Another form to resolve:

/* import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        List<Integer> arr = new ArrayList<>();
        int a = 0;
        while (a <= 2) {
            arr.add(scanner.nextInt());
            a++;
        }
        int numberOfDesks = 0;
        for (int i : arr) {
            numberOfDesks += i / 2 + i % 2;
        }
        System.out.println(numberOfDesks);
    }
}*/