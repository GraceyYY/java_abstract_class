package buyChicken;

public class Chick implements CountPrice {
    @Override
    public int countFullPrice(int num) {
        return num / 3;
    }
}
