import java.util.ArrayList;
import java.util.List;

public class Calculator implements Calculatable{
    private List<String> history = new ArrayList<String>();
    @Override
    public Integer add(Integer number1, Integer number2) {
        history.add(number1 + " + " + number2 + " = " + (number1+number2));
        return number1 + number2;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        history.add(number1 + " - " + number2 + " = " + (number1-number2));
        return number1 - number2;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        history.add(number1 + " * " + number2 + " = " + (number1*number2));
        return number1 * number2;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        history.add(number1 + " / " + number2 + " = " + (number1/number2));
        return number1 / number2;
    }

    @Override
    public List<String> getHistory() {
        return history;
    }
}
