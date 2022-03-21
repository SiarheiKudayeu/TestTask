import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int n = input.nextInt();
        int [] massive = new int[n];
        for(int i = 0; i < n; i ++){
            System.out.println("Введите значение элемента массива");
            int vvod = input.nextInt();
            massive[i]=vvod;
        }
        System.out.print("Элеметы массива кратные трем следующие: ");
        for(int i = 0; i < n; i ++){
            if(massive[i]%3==0){
                System.out.print(massive[i]+" ");
            }

        }

    }
}