[ Program-1 Write a program to create a Calculator ](#Code-1)

[ Program-2 Write a program to show Command Line Arguments ](#Code-2)

## Code-1
```
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
```
<img width="722" height="342" alt="image" src="https://github.com/user-attachments/assets/06017d49-3729-4830-a233-c2938da027d1" />


## Code-2
```
public class Cla 
{
    public static void main(String[] args)
    {
        System.out.println(args[0] + " " + args[1]);
    }
}
```
<img width="447" height="189" alt="image" src="https://github.com/user-attachments/assets/630acee7-48f7-4915-8227-1029d68bfd6b" />

