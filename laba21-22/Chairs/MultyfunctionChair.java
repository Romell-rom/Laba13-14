package laba21-22;

public class MultyfunctionChair implements Chair {
    public MultyfunctionChair() {
        System.out.println("Магический стул у вас)");
    }

    @Override
    public void sit() {

        System.out.println("Вы сели на мультифункцианальный стул");
    }
}
