class Prog5
{
    static int a=10;
    static int b; //declaration of b need to be outside  static block
    static {
        b=20;
        //System.out.println(b);
        System.out.println("hi");
    }
    public static void m1()
    {
        System.out.println("m1 method");
    }
    public static void main(String[] args) {

        System.out.println(b);
        System.out.println(a);
        m1();
    }
}