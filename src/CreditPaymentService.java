public class CreditPaymentService {
    public double calculate(int credit, int time, double percent) {
        double creditrate = percent / 12 / 100;                // ставка в месяц
        double degree = Math.pow(1 + creditrate, time);       // степень
        double annuity = creditrate * degree / (degree-1);   // аннуитет
        double payment = annuity * credit;
        return payment;
    }

}
