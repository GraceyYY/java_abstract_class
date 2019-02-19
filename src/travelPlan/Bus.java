package travelPlan;

public class Bus implements Strategy {
    @Override
    public String chooseTransportation(int budget) {

        return budget >= 300 ? "可以乘大巴旅行" : "不能乘大巴旅行";
    }
}
