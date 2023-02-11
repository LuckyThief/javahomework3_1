public class Main {
    public static void main(String[] args) {
        BonusMileService service = new BonusMileService();
        int price = 10_000;
        int mile = 20;
        int bonusMile = service.calculate(price, mile); // должно получиться 500
        System.out.println(bonusMile);
    }
}