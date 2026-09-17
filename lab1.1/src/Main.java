import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter number of integers");
    int n = scanner.nextInt();
    int[] array = new int[n];
    System.out.println("enter integers");

    for (int i = 0; i < n; i++) {
        array[i] = scanner.nextInt();
    }

    System.out.println("n mod 2 = 0:");
    for (int i = 0; i < n; i++) {
        if (array[i] % 2 == 0) {
            System.out.println(array[i]);
        }
    }

    System.out.println("n mod 2 != 0:");
    for (int i = 0; i < n; i++) {
        if (array[i] % 2 != 0) {
            System.out.println(array[i]);
        }
    }
}
