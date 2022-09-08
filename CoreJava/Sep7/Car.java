class Car
{


    String brand;
    String model;
    int cc;
    double cost = 999999;


    Car(String brand, String model, int cc)
    {
        this.brand = brand;
        this.model = model;
        this.cc = cc;
    }

    public void carDetails()
    {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(cc);
    }





    public static void main(String[] args) {

        Car c = new Car("TATA", "Nano", 400);
        c.carDetails();

        Car c1 = new Car("Audi", "q7", 6000);
        c1.carDetails();


    }


}