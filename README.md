[ Program-1 Write a program to create a Calculator ](#Code-1)

[ Program-2 Write a program to show Command Line Arguments ](#Code-2)

[ Program-3 Write a program using classes and objects to do the reverse of 1-D array.](#Code-3)

[ Program-4 Write a program to perform operations on (3x3) order matrix.](#Code-4)

[ Program-5 Write a program to perform pattern printing , pallindrome , armstrong number , fibonacci series , factorial.](#Code-5)

[ Program-6 Write a program to add two distances where each distance is given in meter , centimeter and milimeter.](#Code-6)

[ Program-7 Write a program to add two times where each time is given in hours , minutes and seconds using objects and classes.](#Code-7)

[ Program-8 Write a program to demonstrate all three types of Inheritance.](#Code-8)

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



## Code-3
```
class ReverseArray {
    int arr[] = {10, 20, 30, 40, 50};

    void reverse() {
        int n = arr.length;

        System.out.println("Original Array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nReversed Array:");
        for(int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class ArrayReverse {
    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();  // creating object
        obj.reverse();                          // calling method
    }
}
```
<img width="643" height="241" alt="image" src="https://github.com/user-attachments/assets/10872cab-9445-49ce-afb8-80cd18f0f3fd" />



## Code-4
```
class MatrixOperations {
    int A[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    int B[][] = {
        {9, 8, 7},
        {6, 5, 4},
        {3, 2, 1}
    };

    void sumMatrix() {
        System.out.println("Sum of Matrices:");
        int C[][] = new int[3][3];

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    void multiplyMatrix() {
        System.out.println("\nMultiplication of Matrices:");
        int C[][] = new int[3][3];

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                C[i][j] = 0;
                for(int k=0;k<3;k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("\nTranspose of Matrix A:");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(A[j][i] + " ");
            }
            System.out.println();
        }
    }

    void sumRows() {
        System.out.println("\nSum of Rows:");
        for(int i=0;i<3;i++) {
            int sum = 0;
            for(int j=0;j<3;j++) {
                sum += A[i][j];
            }
            System.out.println("Row " + (i+1) + " Sum = " + sum);
        }
    }

    void sumColumns() {
        System.out.println("\nSum of Columns:");
        for(int j=0;j<3;j++) {
            int sum = 0;
            for(int i=0;i<3;i++) {
                sum += A[i][j];
            }
            System.out.println("Column " + (j+1) + " Sum = " + sum);
        }
    }

    void sumDiagonals() {
        int mainDiag = 0, secDiag = 0;

        for(int i=0;i<3;i++) {
            mainDiag += A[i][i];
            secDiag += A[i][2-i];
        }

        System.out.println("\nSum of Main Diagonal = " + mainDiag);
        System.out.println("Sum of Secondary Diagonal = " + secDiag);
    }
}

public class Matrix {
    public static void main(String args[]) {
        MatrixOperations obj = new MatrixOperations();

        obj.sumMatrix();
        obj.multiplyMatrix();
        obj.transpose();
        obj.sumRows();
        obj.sumColumns();
        obj.sumDiagonals();
    }
}
```
<img width="644" height="548" alt="image" src="https://github.com/user-attachments/assets/5a26ff12-b44d-4865-82fd-aeb62d4fdb4e" />




## Code-5
```
class NumberOperations {

    void pattern() {
        System.out.println("Pattern Printing:");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void palindrome() {
        int num = 121, rev = 0, temp = num;

        while(temp != 0) {
            int r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;
        }

        if(num == rev)
            System.out.println("\n" + num + " is a Palindrome Number");
        else
            System.out.println("\n" + num + " is not a Palindrome Number");
    }

    void armstrong() {
        int num = 153, sum = 0, temp = num;

        while(temp != 0) {
            int r = temp % 10;
            sum = sum + (r * r * r);
            temp = temp / 10;
        }

        if(sum == num)
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is not an Armstrong Number");
    }

    void fibonacci() {
        int a = 0, b = 1, c;

        System.out.println("\nFibonacci Series:");
        System.out.print(a + " " + b + " ");

        for(int i = 3; i <= 10; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    void factorial() {
        int num = 5;
        int fact = 1;

        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("\n\nFactorial of " + num + " = " + fact);
    }
}

public class Demo {
    public static void main(String args[]) {
        NumberOperations obj = new NumberOperations();

        obj.pattern();
        obj.palindrome();
        obj.armstrong();
        obj.fibonacci();
        obj.factorial();
    }
}
```
<img width="635" height="336" alt="image" src="https://github.com/user-attachments/assets/3d10f798-aff9-46f1-a606-b7c60f1cc663" />


## Code-6
```
class Distance {
    int meter, centimeter, millimeter;

    Distance(int m, int c, int mm) {
        meter = m;
        centimeter = c;
        millimeter = mm;
    }

    void addDistance(Distance d1, Distance d2) {
        millimeter = d1.millimeter + d2.millimeter;
        centimeter = d1.centimeter + d2.centimeter;
        meter = d1.meter + d2.meter;

        // Conversion
        if(millimeter >= 10) {
            centimeter += millimeter / 10;
            millimeter = millimeter % 10;
        }

        if(centimeter >= 100) {
            meter += centimeter / 100;
            centimeter = centimeter % 100;
        }
    }

    void display() {
        System.out.println("Total Distance = " + meter + " meter " 
        + centimeter + " centimeter " + millimeter + " millimeter");
    }
}

public class AddDistance {
    public static void main(String args[]) {

        Distance d1 = new Distance(5, 80, 7);
        Distance d2 = new Distance(3, 50, 8);
        Distance result = new Distance(0,0,0);

        result.addDistance(d1, d2);
        result.display();
    }
}
```
<img width="652" height="189" alt="image" src="https://github.com/user-attachments/assets/0f214830-6a8a-4c6e-adb5-adc99b4b8377" />


## Code-7
```
class Time {
    int hours, minutes, seconds;

    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    void addTime(Time t1, Time t2) {
        seconds = t1.seconds + t2.seconds;
        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours;

        // Conversion
        if(seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }

        if(minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
    }

    void display() {
        System.out.println("Total Time = " + hours + " hours " 
        + minutes + " minutes " + seconds + " seconds");
    }
}

public class AddTime {
    public static void main(String args[]) {

        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(3, 20, 30);
        Time result = new Time(0,0,0);

        result.addTime(t1, t2);
        result.display();
    }
}
```
<img width="658" height="183" alt="image" src="https://github.com/user-attachments/assets/df714c04-0610-4588-b7fc-7030501e2001" />


## Code-8
```
class A {
    void showA() {
        System.out.println("Class A");
    }
}

// Single Inheritance
class B extends A {
    void showB() {
        System.out.println("Class B");
    }
}

// Multilevel Inheritance
class C extends B {
    void showC() {
        System.out.println("Class C");
    }
}

// Hierarchical Inheritance
class D extends A {
    void showD() {
        System.out.println("Class D");
    }
}

public class Inheritance {
    public static void main(String args[]) {

        C obj1 = new C();   // Multilevel
        obj1.showA();
        obj1.showB();
        obj1.showC();

        D obj2 = new D();   // Hierarchical
        obj2.showA();
        obj2.showD();
    }
}
```
<img width="616" height="180" alt="image" src="https://github.com/user-attachments/assets/d2e1b2f3-da57-4de7-a06e-99e9c45d1d3e" />

