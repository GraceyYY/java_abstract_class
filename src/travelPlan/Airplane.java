package travelPlan;

public class Airplane implements Strategy {
    @Override
    public String chooseTransportation(int budget) {

        return budget >= 1000 ? "可以乘飞机旅行" : "不能乘飞机旅行";
    }
}
