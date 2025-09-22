package HWStructureHomeWork;

import HWStructureHomeWork.ru.netology.service.CalculatorCustoms;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Здравствуйте и добро пожаловать в сервис подсчета пошлины!\n" + "Введите цену товара (в руб): ");
        int price = sc.nextInt() / 100;
        System.out.print("Пожалуйста, введите вес товара (в кг): ");
        int weight = sc.nextInt() * 100;
        int result = CalculatorCustoms.CALCULATE_OF_THE_FEE(weight, price);
        System.out.print("Благодарю за ожидание!\n" + "Пошлина за провозимый вами товар составляет: " + result);
        sc.close();
    }
}
