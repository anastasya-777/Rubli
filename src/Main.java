public class Main {
    public static void main(String[] args) {
        // Исходные данные
        int currentBalance = 100; // Текущий баланс клиента
        int deposit = 1500; // Сумма пополнения

        // Расчёт бонуса
        int bonus = (deposit > 1000) ? (deposit / 100) : 0;

        // Итоговый счёт
        int finalBalance = currentBalance + deposit + bonus;

        // Вывод результатов
        System.out.println("Итоговый счёт: " + finalBalance + " руб.");
        System.out.println("Количество бонусных рублей: " + bonus + " руб.");
    }
}
