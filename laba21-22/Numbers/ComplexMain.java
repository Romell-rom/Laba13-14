package laba21-22;

public class ComplexMain {
    public static void main(String[] args) {
        ComplexNumberInterface number;
        ComplexNumberFactory creating = new Create();
        number = creating.create();
    }
}
