public class AwesomeNumber {
    private int number;
    public AwesomeNumber(int n)
    {
        number = n;
    }
    public static int add(AwesomeNumber x, AwesomeNumber y)
    {
        return x.number + y.number;
    }
    public static int subtract(AwesomeNumber x, AwesomeNumber y)
    {
        return x.number - y.number;
    }
}
