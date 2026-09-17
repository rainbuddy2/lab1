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

    int min = array[0];
    int max = array[0];

    for (int i = 1; i < n; i++) {
        if (array[i] < min) {
            min = array[i];
        }

        if (array[i] > max) {
            max = array[i];
        }
    }

    System.out.println(max);
    System.out.println(min);
}
