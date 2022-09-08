class Laptop
{
    String brand;
    int ram;
    double cost;

    Laptop(String brand, int ram, double cost)
    {
        this.brand = brand;
        this.ram = ram;
        this.cost = cost;
    }

    public void laptopDetails()
    {
        System.out.println(brand);
        System.out.println(ram);
        System.out.println(cost);
    }


    public static void main(String[] args) {

        Laptop l = new Laptop("Hp", 12, 40000.00);
        l.laptopDetails();



    }





}