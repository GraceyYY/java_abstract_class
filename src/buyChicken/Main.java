package buyChicken;

public class Main {
    public static void main(String[] args) {
        Chicken rooster = new Rooster();
        Chicken hen = new Hen();
        Chicken chick = new Chick();

        int roosterNum = 0;
        int henNum = 0;
        int chickNum = 0;

        for (roosterNum = 0; roosterNum <= 20; roosterNum++) {

            for (henNum = 0; henNum <= 33; henNum++) {
                chickNum = 100 - roosterNum - henNum;
                if (chickNum % 3 == 0) {
                    if (rooster.countFullPrice(roosterNum) + hen.countFullPrice(henNum) + chick.countFullPrice(chickNum) == 100) {
                        System.out.println("公鸡：" + roosterNum + ", 母鸡：" + henNum + ", 小鸡：" + chickNum);
                    }
                }
            }
        }
    }
}
