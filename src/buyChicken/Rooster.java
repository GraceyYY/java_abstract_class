package buyChicken;

public class Rooster extends Chicken{
    @Override
    public int countFullPrice(int num) {
        return num * 5;
    }
}
