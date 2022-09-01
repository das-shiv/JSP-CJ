class Prog2
{
    static int a =10;
    static String name = "TEDDY";

    public static void m1()
    {
        System.out.println("It's raining");
    }

    public static void m2()
    {
        System.out.println("hi");
    }

    public static void main(String[] args) {

        System.out.println("Main starts");
        System.out.println(Prog2.a);
        System.out.println(Prog2.name);
        m1();
        m2();
        System.out.println("Main ends");
    }
}