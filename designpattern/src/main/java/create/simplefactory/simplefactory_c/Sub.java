package create.simplefactory.simplefactory_c;

public class Sub implements Operation{
    @Override
    public Double getReslt(Double param1, Double param2) {
        return param1 - param2;
    }
}
