public class Calculator
{
    
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        add(num1 , num2);
        sub(num1 , num2);
        mul(num1 , num2);
        div(num1 , num2);
    }

    public static void add(int num1 , int num2)
    {
        int a = num1 + num2;
        System.out.println("Sum of numbrs is : "+a);
    }

    public static void sub(int num1 , int num2)
    {
        int s = num1 - num2;
        System.out.println("Difference is : "+s);
    }

    public static void mul(int num1 , int num2)
    {
        int m = num1 * num2;
        System.out.println("Poduct is : "+m);
    }

    public static void div(int num1 , int num2)
    {
        int d = num1 / num2;
        System.out.println("Division result is : "+d);
    }


}