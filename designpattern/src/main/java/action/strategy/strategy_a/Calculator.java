package action.strategy.strategy_a;

public class Calculator {
    private ICalucatorStrategy calucatorStrategy;

    public Calculator(ICalucatorStrategy calucatorStrategy){
        this.calucatorStrategy = calucatorStrategy;
    }

    public Integer calculate(int a,int b){
        return this.calucatorStrategy.calucate(a,b);
    }
}
