public class BonusMileService {

    public int calculate(int price, int mile) {
        int bonusMile = (price / mile);

        return bonusMile;
    }
}
