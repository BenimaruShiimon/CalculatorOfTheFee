package HWStructureHomeWork.ru.netology.service;

public class CalculatorCustoms {

    public static final int WEIGHT = 100;
    public static final int PRICE = 100;

    public static int calculateOfTheFee(int price, int weight) {
        return (price / PRICE) + (weight * WEIGHT);
    }
}
