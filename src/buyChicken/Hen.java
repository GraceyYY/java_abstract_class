package buyChicken;

public class Hen extends Chicken {
    @Override
    public int countFullPrice(int num) {
        return num * 3;
    }
}
