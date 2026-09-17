import java.util.Scanner;
void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter number of integers");
    int n = scanner.nextInt();
    int[] array = new int[n];
    System.out.println("enter integers");

    for (int i = 0; i < n; i++) {
        array[i] = scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
        if (array[i] >= 100 && array[i] <= 999) {
            int a = array[i] / 100;
            int b = (array[i] / 10) % 10;
            int c = array[i] % 10;

            if (a != b && b != c && a != c) {
                System.out.println(array[i]);
            }
        }
    }
}