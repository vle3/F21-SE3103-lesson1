package model;

public class Calculator {
    
    private double lastN;
    private double lastN2;
    private double result;

    public void enter(double n)
    {
        lastN2 = lastN;
        lastN = n;
    }

    public void add()
    {
        result = lastN + lastN2;
    }

    public double getResult()
    {
        return result;
    }
}
