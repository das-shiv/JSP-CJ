class Emp
{
    String name;
    int id;
    Emp()   //default custom constructor becasue passing some data
    {
        name = "Tedy";
        id = 1234;

    }

    public  void empDetails()
    {
        System.out.println(name);
        System.out.println(id);
    }


    public static void main(String[] args) {
        Emp e = new Emp();
        System.out.println(e.name);
        System.out.println(e.id);
        System.out.println("-----------");
        e.empDetails();
    }



}


