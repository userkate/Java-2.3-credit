public class CreditPaymentService {
    public double calculate(int credit, int time, double percent) {
        double x = percent / 12 / 100;     // ставка в месяц
        double y = Math.pow(1 + x, time); // степень
        double z = x * y / (y-1);        // аннуитет
        double payment = z * credit;
        return payment;
    }

}
