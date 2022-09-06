class Kfc {
    {
        System.out.println("Welcome to KFC");
    }

    String burger = "Zinger";
    String drink = "pepsi";
    int cost = 199;

    public void eat() {
        System.out.println(burger);
        System.out.println(drink);
        System.out.println(cost);
    }

    public static void main(String[] args) {

        Kfc k = new Kfc();
        k.eat();


    }

    {
        System.out.println("Thank you");
        System.out.println("Visit again");


    }
}