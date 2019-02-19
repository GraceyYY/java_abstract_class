package buyChicken;

public class Chick extends Chicken {
    @Override
    public int countFullPrice(int num) {
        return num / 3;
    }
}
