class SmallestOfFive {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 40;
        int num3 = 30;
        int num4 = 20;
        int num5 = 10;
        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
            System.out.println("The smallest number is:" + num1);

        }
        else if(num2<num3 && num2<num4 && num2<num5)
        {
            System.out.println("The smallest number is:"+num2);

        }
        else if(num3<num4&& num3<num5)
        {
            System.out.println("The smallest umber is:"+num3);
        }
        else if(num4<num5)
        {
            System.out.println("The smallest number is:"+num4);

        }
        else
        {
            System.out.println("The smallest number is:"+num5);
        }
    }

}