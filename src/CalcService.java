public class CalcService {
    public int calcPayment(int sum, int month) {
        double persent = 9.99 / month / 100;
        double x = Math.pow(1 + persent, month);
        int payment = (int) (sum * (persent + persent / (x - 1)));
        return payment;
    }
}
