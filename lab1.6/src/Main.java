import java.util.Scanner;

public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

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
        if (isPrime(array[i])) {
            System.out.println(array[i]);
        }
    }
}