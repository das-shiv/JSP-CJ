class Car {
    String brand;
    int cost;

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "TATA";
        c1.cost = 900000;

        c2.brand = "Mahindra";
        c2.cost = 500000;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("---------");
        System.out.println(c1.brand);
        System.out.println(c1.cost);
        System.out.println("----------");
        System.out.println(c2.brand);
        System.out.println(c2.cost);


    }
}