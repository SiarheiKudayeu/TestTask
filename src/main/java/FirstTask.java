import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое число");
        int n = input.nextInt();
        if (n > 7){
            System.out.println("Привет");
        }
    }
}