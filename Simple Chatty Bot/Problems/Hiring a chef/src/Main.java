import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        scan.next();
        scan.next();
        scan.next();
        String pref = scan.next();
        System.out.print("The form for " + name + " is completed. We will contact you if we need" +
                " a chef that cooks " + pref + " dishes.");
    }
}