class Prog2
{
    public static void car()
    {
        System.out.println("Car Start ");
        bike();
        System.out.println("Car Ends");
    }

    public static void bike()
    {
        System.out.println("Bike Execute");
    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        car();
        bike();
        System.out.println("Main Ends");
    }
}
