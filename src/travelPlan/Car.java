package travelPlan;

public class Car implements Strategy {
    @Override
    public String chooseTransportation(int budget) {

        return budget >= 500 ? "可以自驾旅行" : "不能自驾旅行";
    }
}
