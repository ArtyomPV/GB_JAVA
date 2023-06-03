package CalculatorComplex.calculator;

public class CalculatorComplex implements CalculableComplex {
    private int primaryRealArg;
    private int primaryImagArg;

    public CalculatorComplex(int primaryRealArg, int primaryImagArg) {
        this.primaryRealArg = primaryRealArg;
        this.primaryImagArg = primaryImagArg;
    }

    @Override
    public CalculableComplex sum(int realArg, int imagArg) {
        this.primaryRealArg += realArg;
        this.primaryImagArg += imagArg;
        return this;
    }

    @Override
    public CalculatorComplex multi(int realArg, int imagArg) {
        this.primaryRealArg = primaryImagArg * realArg - this.primaryImagArg * realArg;
        this.primaryRealArg = primaryImagArg * imagArg + this.primaryImagArg * realArg;
        return this;
    }

    @Override
    public String getResult() {
        return String.format("%d + %dj", this.primaryRealArg, this.primaryImagArg);
    }
}
