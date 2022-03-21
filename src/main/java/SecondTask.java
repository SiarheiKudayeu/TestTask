import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое имя");
        String name = input.next();
        if (name.equals("Вячеслав") ){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}