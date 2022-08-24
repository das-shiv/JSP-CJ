class Prog7
{
 public static void main(String[] args)
 {
     char ch='5';

     if(ch>='A'&& ch<='Z' || ch>='a' && ch<= 'z')
     {
         System.out.println("The given char is alphabet");
     }
     else if(ch>='0' && ch<='9')
     {
         System.out.println("The given char is number");

     }
     else {
         System.out.println("The given char is special character");
     }

 }
}