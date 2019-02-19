package travelPlan;

public class Traveler {
    private Strategy strategy;

    public Traveler(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(int budget) {
        return strategy.chooseTransportation(budget);
    }
}
