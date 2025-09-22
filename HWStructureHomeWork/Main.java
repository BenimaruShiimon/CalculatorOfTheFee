package HWStructureHomeWork;
import java.util.Scanner;
import HWStructureHomeWork.ru.netology.service.CalculatorCustoms;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Здравствуйте и добро пожаловать в сервис подсчета пошлины!\n" + "Введите цену товара (в руб): ");
        int price = sc.nextInt();
        System.out.print("Пожалуйста, введите вес товара (в кг): ");
        int weight = sc.nextInt();
        int result = CalculatorCustoms.calculateOfTheFee(price, weight);
        System.out.print("Благодарю за ожидание!\n" + "Пошлина за провозимый вами товар составляет: " + result);
        sc.close();
    }
}