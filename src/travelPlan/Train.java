package travelPlan;

public class Train implements Strategy {
    @Override
    public String chooseTransportation(int budget) {

        return budget >= 400 ? "可以乘火车旅行" : "不能乘火车旅行";
    }
}
