public class Main {
    public static void main(String[] args) {
        BonusMileService service = new BonusMileService();
        int price = 10_000;
        int bonusMile = service.calculate(price); // должно получиться 500
        System.out.println(bonusMile);
    }
}