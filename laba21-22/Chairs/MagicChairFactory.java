package laba21-22;

public class MagicChairFactory implements Factory {

    @Override
    public Chair createChair(){
        return new MagicChair();
    }
}
