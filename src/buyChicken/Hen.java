package buyChicken;

public class Hen implements CountPrice {
    @Override
    public int countFullPrice(int num) {
        return num * 3;
    }
}
