class Calculator
{
    public static double addition(double a, double b)
    {
        double sum = a+b;
        return sum;
    }
    public static double subtract(double a,double b)
    {
        double difference = a-b;
        return difference;
    }

    public static double multiply(double a, double b)
    {
        double mult = a*b;
        return mult;
    }

    public static double divison(double a, double b)
    {
        double div = a/b;
        return div;
    }

    public static void main(String[] args)
    {

        double add = addition(6.5, 5.5);
        System.out.println("Addition is:"+ add);

        double sub = subtract(6.5,5.5);
        System.out.println("Subtraction is:"+ sub);

        double mul = multiply(6.5,5.5);
        System.out.println("Multiplication is:"+ mul);

        double div = divison(6.5,5.5);
        System.out.println("Division is:"+div);
    }
}