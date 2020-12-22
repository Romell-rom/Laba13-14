package laba21-22;

public class VictorianChairFactory implements Factory {


    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
