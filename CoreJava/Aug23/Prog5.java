class Prog5
{
    public static double avg1(double a, double b, double c)
    {
        double avg =  (a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {
        double result = avg1(1.2,3.4,5.6);
        System.out.println(result);
    }
}