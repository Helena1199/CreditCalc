public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int payment = service.calcPayment(1_000_000, 36);
        System.out.println(payment);
    }
}
