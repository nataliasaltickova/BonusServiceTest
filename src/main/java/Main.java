public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        boolean registered = true;
        long amount = 1000_60;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;

        System.out.println(passed);
    }
}