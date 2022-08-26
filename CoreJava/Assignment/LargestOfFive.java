class LargestOfFive {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 300;
        int num3 = 420;
        int num4 = 650;
        int num5 = 760;
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("The largest number is:" + num1);

        }
        else if(num2>num3 && num2>num4 && num2>num5)
        {
            System.out.println("The largest number is:"+num2);

        }
        else if(num3>num4&& num3>num5)
        {
            System.out.println("The largest umber is:"+num3);
        }
        else if(num4>num5)
        {
            System.out.println("The largest number is:"+num4);

        }
        else
        {
            System.out.println("The largest number is:"+num5);
        }
    }

}