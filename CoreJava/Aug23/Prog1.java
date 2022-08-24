class Prog1
{
    public static void ice()
    {
        System.out.println("Strawberry");
    }

    public static void main(String[] args) {
        chocolate();

    }

    public static void chocolate()
    {
        System.out.println("Kit Kat");
        ice();
    }
}