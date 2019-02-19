package buyChicken;

public class Rooster implements CountPrice {
    @Override
    public int countFullPrice(int num) {
        return num * 5;
    }
}
