public class Main {
    public static void main(String[] args) {

        int balance = 100; //начальный баланс
        int replenishment = 1000; //сумма пополнения
        int bonus = 100; //стоимость одного бонусного рубля

        if (replenishment > 1000) {
            System.out.println(replenishment / bonus + balance + replenishment);
        } else {
            System.out.println(balance + replenishment);
        }
    }
}