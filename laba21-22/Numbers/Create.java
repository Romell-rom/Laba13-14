package laba21-22;

public class Create implements ComplexNumberFactory{
    @Override
    public ComplexNumber create() {
        double re = 3;
        double im = 2;
        return new ComplexNumber(re,im);
    }
}
