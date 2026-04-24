[ Program-1 Write a program to create a Calculator ](#Code-1)

[ Program-2 Write a program to show Command Line Arguments ](#Code-2)

[ Program-3 Write a program using classes and objects to do the reverse of 1-D array.](#Code-3)

[ Program-4 Write a program to perform operations on (3x3) order matrix.](#Code-4)

[ Program-5 Write a program to perform pattern printing , pallindrome , armstrong number , fibonacci series , factorial.](#Code-5)

[ Program-6 Write a program to add two distances where each distance is given in meter , centimeter and milimeter.](#Code-6)

[ Program-7 Write a program to add two times where each time is given in hours , minutes and seconds using objects and classes.](#Code-7)

[ Program-8 Write a program to demonstrate all three types of Inheritance.](#Code-8)

[ Program-9 Write a program using three classes to print 1-100 ,1-100,1-100 with and without thread and analyse the output and repeat the same program using runnable interface.](#Code-9)

[ Program-10 Using the concept of multithreading the output of all three threads must be synchronised (use join method).](#Code-10)

[ Program-11 Addition of 2 numbers using swing.](#Code-11)

[ Program-12 Make a registration form with 10 elements and send the data into database (use jdbc connectivity).](#Code-12)

[ Program-13 Make one calculator in swing.](#Code-13)

[ Program-14  Matrix Addition using swing class.](#Code-14)

[ Program-15 Create one jframe apply 10 buttons on that after clicking on each button a new
structure is created.(Circle, oval rectangle, etc ....) ](#Code-15)

[ Program-16 Just using mouse Event create a frame like paint brush with selection of colour and width .](#Code-16)

[ Program-17 Create a package of any 5 classes of your choice and import it.](#Code-17)

[ Program-18 Create one package and sub package  import and test it .
](#Code-18)

[ Program-19  Create one small array of size 5 apply array out of bounds exception using try catch give a proper message in catch and demonstrate the exception exactly in the same fashion demonstrate arithmetic exception .](#Code-19)

[ Program-20 To test the range of age of one student.write a program using user defined exception.](#Code-20)

[ Program-21 File Handling Programs (given in the PPT).](#Code-21)

[ Program-22 Inheritance Programs, using interface and abstract classes.](#Code-22)



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

## Code-9
```
class NumberThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

class NumberThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}

class NumberThread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread 3: " + i);
        }
    }
}

class Runnable1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Runnable 1: " + i);
        }
    }
}

class Runnable2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Runnable 2: " + i);
        }
    }
}

class Runnable3 implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Runnable 3: " + i);
        }
    }
}

public class Program9 {
    public static void main(String[] args) {
        System.out.println("WITHOUT THREAD:");
        for (int i = 1; i <= 100; i++) {
            System.out.print("Class 1: " + i+" ");
        }
        for (int i = 1; i <= 100; i++) {
            System.out.print("Class 2: " + i+" ");
        }
        for (int i = 1; i <= 100; i++) {
            System.out.print("Class 3: " + i +" ");
        }

        System.out.println("\nUSING THREAD CLASS:");
        NumberThread1 t1 = new NumberThread1();
        NumberThread2 t2 = new NumberThread2();
        NumberThread3 t3 = new NumberThread3();

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\nUSING RUNNABLE INTERFACE:");
        Thread r1 = new Thread(new Runnable1());
        Thread r2 = new Thread(new Runnable2());
        Thread r3 = new Thread(new Runnable3());

        r1.start();
        r2.start();
        r3.start();
    }
} 
```
<img width="1403" height="736" alt="image" src="https://github.com/user-attachments/assets/58a971ce-1a6d-4977-8841-9e9b6f5b1c90" />

## Code-10
```
class MyThread extends Thread {
    String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " : " + i);
            try {
                Thread.sleep(500); // delay for visibility
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        try {
            t1.start();
            t1.join();   // wait for t1 to finish

            t2.start();
            t2.join();   // wait for t2 to finish

            t3.start();
            t3.join();   // wait for t3 to finish

        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("All threads executed in synchronized manner.");
    }
}
```
<img width="636" height="463" alt="image" src="https://github.com/user-attachments/assets/57fb0517-8a71-4e77-8730-2f0ed2940bad" />

## Code-11
```
import javax.swing.*;
import java.awt.event.*;

public class AddTwoNumbersSwing {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Addition of Two Numbers");

        // Create components
        JLabel l1 = new JLabel("Enter First Number:");
        l1.setBounds(30, 30, 150, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(180, 30, 150, 30);

        JLabel l2 = new JLabel("Enter Second Number:");
        l2.setBounds(30, 80, 150, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(180, 80, 150, 30);

        JButton btn = new JButton("Add");
        btn.setBounds(120, 130, 100, 30);

        JLabel result = new JLabel("Result: ");
        result.setBounds(30, 180, 300, 30);

        // Button action
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    int sum = num1 + num2;

                    result.setText("Result: " + sum);
                } catch (Exception ex) {
                    result.setText("Invalid Input!");
                }
            }
        });

        // Add components to frame
        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(btn);
        frame.add(result);

        // Frame settings
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```
<img width="470" height="353" alt="image" src="https://github.com/user-attachments/assets/1574a473-181c-43d0-881e-53770d622611" />

## Code-12
```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class RegistrationForm extends JFrame implements ActionListener {

    JTextField firstNameField, lastNameField, ageField, emailField, phoneField, cityField;
    JTextArea addressArea;
    JRadioButton maleBtn, femaleBtn;
    JComboBox<String> courseBox, branchBox;
    JButton submitBtn, clearBtn;

    RegistrationForm() {
        setTitle("Student Registration Form");
        setSize(600, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(240, 248, 255));

        JLabel title = new JLabel("Student Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(140, 20, 350, 40);
        add(title);

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(80, 90, 120, 25);
        add(firstNameLabel);

        firstNameField = new JTextField();
        firstNameField.setBounds(220, 90, 250, 25);
        add(firstNameField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(80, 130, 120, 25);
        add(lastNameLabel);

        lastNameField = new JTextField();
        lastNameField.setBounds(220, 130, 250, 25);
        add(lastNameField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(80, 170, 120, 25);
        add(genderLabel);

        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");

        maleBtn.setBounds(220, 170, 80, 25);
        femaleBtn.setBounds(310, 170, 100, 25);

        maleBtn.setBackground(new Color(240, 248, 255));
        femaleBtn.setBackground(new Color(240, 248, 255));

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);

        add(maleBtn);
        add(femaleBtn);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(80, 210, 120, 25);
        add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(220, 210, 250, 25);
        add(ageField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(80, 250, 120, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(220, 250, 250, 25);
        add(emailField);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(80, 290, 120, 25);
        add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(220, 290, 250, 25);
        add(phoneField);

        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(80, 330, 120, 25);
        add(courseLabel);

        String[] courses = {"B.Tech", "BCA", "MCA", "B.Sc", "M.Tech"};
        courseBox = new JComboBox<>(courses);
        courseBox.setBounds(220, 330, 250, 25);
        add(courseBox);

        JLabel branchLabel = new JLabel("Branch:");
        branchLabel.setBounds(80, 370, 120, 25);
        add(branchLabel);

        String[] branches = {"CSE", "IT", "ECE", "AI/ML", "Data Science"};
        branchBox = new JComboBox<>(branches);
        branchBox.setBounds(220, 370, 250, 25);
        add(branchBox);

        JLabel cityLabel = new JLabel("City:");
        cityLabel.setBounds(80, 410, 120, 25);
        add(cityLabel);

        cityField = new JTextField();
        cityField.setBounds(220, 410, 250, 25);
        add(cityField);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(80, 450, 120, 25);
        add(addressLabel);

        addressArea = new JTextArea();
        addressArea.setBounds(220, 450, 250, 70);
        addressArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(addressArea);

        submitBtn = new JButton("Submit");
        submitBtn.setBounds(160, 550, 120, 35);
        submitBtn.setBackground(new Color(144, 238, 144));
        submitBtn.addActionListener(this);
        add(submitBtn);

        clearBtn = new JButton("Clear");
        clearBtn.setBounds(310, 550, 120, 35);
        clearBtn.setBackground(new Color(255, 182, 193));
        clearBtn.addActionListener(this);
        add(clearBtn);

        setVisible(true);
    }

    public Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "stress_user",
                "Stress123"
            );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database Connection Error: " + e.getMessage());
        }

        return con;
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitBtn) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();

            String gender = "";
            if (maleBtn.isSelected()) {
                gender = "Male";
            } else if (femaleBtn.isSelected()) {
                gender = "Female";
            }

            String age = ageField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String course = courseBox.getSelectedItem().toString();
            String branch = branchBox.getSelectedItem().toString();
            String city = cityField.getText();
            String address = addressArea.getText();

            try {
                Connection con = getConnection();

                String query = "INSERT INTO registration " +
        "(id, first_name, last_name, gender, age, email, phone, course, branch, city, address) " +
        "VALUES (reg_seq.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

               PreparedStatement pst = con.prepareStatement(query);

pst.setString(1, firstName);
pst.setString(2, lastName);
pst.setString(3, gender);
pst.setInt(4, Integer.parseInt(age));
pst.setString(5, email);
pst.setString(6, phone);
pst.setString(7, course);
pst.setString(8, branch);
pst.setString(9, city);
pst.setString(10, address);

pst.executeUpdate();
               
                JOptionPane.showMessageDialog(this, "Registration Successful!");

                con.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        }

        if (e.getSource() == clearBtn) {
            firstNameField.setText("");
            lastNameField.setText("");
            ageField.setText("");
            emailField.setText("");
            phoneField.setText("");
            cityField.setText("");
            addressArea.setText("");
            maleBtn.setSelected(false);
            femaleBtn.setSelected(false);
            courseBox.setSelectedIndex(0);
            branchBox.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
```
<img width="1202" height="1308" alt="image" src="https://github.com/user-attachments/assets/523d95a2-b4d1-48c3-9600-864c8ad2ea40" />
<img width="1235" height="276" alt="image" src="https://github.com/user-attachments/assets/d978d8e3-7501-4bd7-96ed-5cb553189f83" />
<img width="380" height="30" alt="image" src="https://github.com/user-attachments/assets/15886e37-6a1b-4552-8943-c97399320b6f" />



## Code-13
```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorSwing extends JFrame implements ActionListener {

    JTextField display;
    JButton[] numberButtons = new JButton[10];
    JButton addButton, subButton, mulButton, divButton;
    JButton equalButton, clearButton, deleteButton, dotButton;

    JPanel panel;

    Font myFont = new Font("Arial", Font.BOLD, 22);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    CalculatorSwing() {
        setTitle("Calculator");
        setSize(420, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(245, 245, 245));

        display = new JTextField();
        display.setBounds(30, 30, 340, 60);
        display.setFont(new Font("Arial", Font.BOLD, 28));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBackground(Color.WHITE);
        display.setForeground(Color.BLACK);
        display.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        add(display);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equalButton = new JButton("=");
        clearButton = new JButton("C");
        deleteButton = new JButton("Del");
        dotButton = new JButton(".");

        JButton[] functionButtons = {
            addButton, subButton, mulButton, divButton,
            equalButton, clearButton, deleteButton, dotButton
        };

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(new Color(255, 255, 255));
            numberButtons[i].addActionListener(this);
        }

        for (JButton button : functionButtons) {
            button.setFont(myFont);
            button.setFocusable(false);
            button.setBackground(new Color(220, 220, 220));
            button.addActionListener(this);
        }

        clearButton.setBackground(new Color(255, 153, 153));
        deleteButton.setBackground(new Color(255, 204, 153));
        equalButton.setBackground(new Color(153, 255, 153));
        addButton.setBackground(new Color(204, 229, 255));
        subButton.setBackground(new Color(204, 229, 255));
        mulButton.setBackground(new Color(204, 229, 255));
        divButton.setBackground(new Color(204, 229, 255));

        panel = new JPanel();
        panel.setBounds(30, 120, 340, 320);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(new Color(245, 245, 245));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);

        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);

        panel.add(dotButton);
        panel.add(numberButtons[0]);
        panel.add(equalButton);
        panel.add(divButton);

        add(panel);

        clearButton.setBounds(30, 460, 160, 40);
        deleteButton.setBounds(210, 460, 160, 40);

        add(clearButton);
        add(deleteButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                display.setText(display.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == dotButton) {
            if (!display.getText().contains(".")) {
                display.setText(display.getText().concat("."));
            }
        }

        if (e.getSource() == addButton) {
            if (!display.getText().isEmpty()) {
                num1 = Double.parseDouble(display.getText());
                operator = '+';
                display.setText("");
            }
        }

        if (e.getSource() == subButton) {
            if (!display.getText().isEmpty()) {
                num1 = Double.parseDouble(display.getText());
                operator = '-';
                display.setText("");
            }
        }

        if (e.getSource() == mulButton) {
            if (!display.getText().isEmpty()) {
                num1 = Double.parseDouble(display.getText());
                operator = '*';
                display.setText("");
            }
        }

        if (e.getSource() == divButton) {
            if (!display.getText().isEmpty()) {
                num1 = Double.parseDouble(display.getText());
                operator = '/';
                display.setText("");
            }
        }

        if (e.getSource() == equalButton) {
            if (!display.getText().isEmpty()) {
                num2 = Double.parseDouble(display.getText());

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            JOptionPane.showMessageDialog(this, "Cannot divide by zero");
                            display.setText("");
                            return;
                        }
                        result = num1 / num2;
                        break;
                }

                if (result == (int) result) {
                    display.setText(String.valueOf((int) result));
                } else {
                    display.setText(String.valueOf(result));
                }

                num1 = result;
            }
        }

        if (e.getSource() == clearButton) {
            display.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
        }

        if (e.getSource() == deleteButton) {
            String text = display.getText();
            if (!text.isEmpty()) {
                display.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    public static void main(String[] args) {
        new CalculatorSwing();
    }
}
```
<img width="529" height="668" alt="image" src="https://github.com/user-attachments/assets/1551edca-50a8-4555-a650-ad5da3dd7e57" />

## Code-14
```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MatrixAdditionSwing extends JFrame implements ActionListener {

    JTextField[][] matrixA = new JTextField[3][3];
    JTextField[][] matrixB = new JTextField[3][3];
    JTextField[][] resultMatrix = new JTextField[3][3];

    JButton addButton, clearButton;
    JLabel titleLabel, labelA, labelB, labelResult;

    Font titleFont = new Font("Arial", Font.BOLD, 24);
    Font labelFont = new Font("Arial", Font.BOLD, 18);
    Font fieldFont = new Font("Arial", Font.PLAIN, 18);

    MatrixAdditionSwing() {
        setTitle("Matrix Addition Using Swing");
        setSize(850, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(245, 248, 255));

        titleLabel = new JLabel("Matrix Addition Calculator");
        titleLabel.setFont(titleFont);
        titleLabel.setBounds(260, 20, 350, 40);
        titleLabel.setForeground(new Color(30, 60, 120));
        add(titleLabel);

        labelA = new JLabel("Matrix A");
        labelA.setFont(labelFont);
        labelA.setBounds(120, 80, 120, 30);
        add(labelA);

        labelB = new JLabel("Matrix B");
        labelB.setFont(labelFont);
        labelB.setBounds(360, 80, 120, 30);
        add(labelB);

        labelResult = new JLabel("Result Matrix");
        labelResult.setFont(labelFont);
        labelResult.setBounds(600, 80, 150, 30);
        add(labelResult);

        createMatrix(matrixA, 70, 130);
        createMatrix(matrixB, 320, 130);
        createResultMatrix(resultMatrix, 570, 130);

        addButton = new JButton("Add Matrices");
        addButton.setBounds(250, 420, 150, 45);
        addButton.setFont(new Font("Arial", Font.BOLD, 16));
        addButton.setBackground(new Color(153, 255, 153));
        addButton.addActionListener(this);
        add(addButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(430, 420, 150, 45);
        clearButton.setFont(new Font("Arial", Font.BOLD, 16));
        clearButton.setBackground(new Color(255, 204, 153));
        clearButton.addActionListener(this);
        add(clearButton);

        JLabel note = new JLabel("Enter integer values in both matrices and click Add Matrices.");
        note.setFont(new Font("Arial", Font.ITALIC, 15));
        note.setBounds(180, 490, 500, 30);
        note.setForeground(Color.DARK_GRAY);
        add(note);

        setVisible(true);
    }

    void createMatrix(JTextField[][] matrix, int startX, int startY) {
        int width = 50;
        int height = 40;
        int gap = 10;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = new JTextField();
                matrix[i][j].setBounds(startX + j * (width + gap), startY + i * (height + gap), width, height);
                matrix[i][j].setFont(fieldFont);
                matrix[i][j].setHorizontalAlignment(JTextField.CENTER);
                matrix[i][j].setBackground(Color.WHITE);
                matrix[i][j].setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100), 2));
                add(matrix[i][j]);
            }
        }
    }

    void createResultMatrix(JTextField[][] matrix, int startX, int startY) {
        int width = 50;
        int height = 40;
        int gap = 10;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = new JTextField();
                matrix[i][j].setBounds(startX + j * (width + gap), startY + i * (height + gap), width, height);
                matrix[i][j].setFont(fieldFont);
                matrix[i][j].setHorizontalAlignment(JTextField.CENTER);
                matrix[i][j].setEditable(false);
                matrix[i][j].setBackground(new Color(230, 255, 230));
                matrix[i][j].setBorder(BorderFactory.createLineBorder(new Color(0, 128, 0), 2));
                add(matrix[i][j]);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            try {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int a = Integer.parseInt(matrixA[i][j].getText());
                        int b = Integer.parseInt(matrixB[i][j].getText());
                        int sum = a + b;
                        resultMatrix[i][j].setText(String.valueOf(sum));
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid integer values in all boxes.");
            }
        }

        if (e.getSource() == clearButton) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrixA[i][j].setText("");
                    matrixB[i][j].setText("");
                    resultMatrix[i][j].setText("");
                }
            }
        }
    }

    public static void main(String[] args) {
        new MatrixAdditionSwing();
    }
}
```
<img width="1030" height="702" alt="image" src="https://github.com/user-attachments/assets/76321eb3-5e02-4045-9c86-e00680623b65" />

## Code-15
```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeButtonsFrame extends JFrame implements ActionListener {

    JButton circleBtn, ovalBtn, rectBtn, squareBtn, lineBtn;
    JButton arcBtn, triangleBtn, diamondBtn, polygonBtn, fillOvalBtn;

    DrawingPanel drawingPanel;
    String currentShape = "";

    Font btnFont = new Font("Arial", Font.BOLD, 14);

    ShapeButtonsFrame() {
        setTitle("Shape Drawing Using 10 Buttons");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2, 5, 10, 10));
        topPanel.setBackground(new Color(240, 248, 255));
        topPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        circleBtn = createButton("Circle", new Color(255, 204, 204));
        ovalBtn = createButton("Oval", new Color(255, 229, 204));
        rectBtn = createButton("Rectangle", new Color(255, 255, 204));
        squareBtn = createButton("Square", new Color(204, 255, 204));
        lineBtn = createButton("Line", new Color(204, 255, 255));
        arcBtn = createButton("Arc", new Color(204, 229, 255));
        triangleBtn = createButton("Triangle", new Color(229, 204, 255));
        diamondBtn = createButton("Diamond", new Color(255, 204, 229));
        polygonBtn = createButton("Polygon", new Color(220, 220, 220));
        fillOvalBtn = createButton("Fill Oval", new Color(255, 180, 180));

        topPanel.add(circleBtn);
        topPanel.add(ovalBtn);
        topPanel.add(rectBtn);
        topPanel.add(squareBtn);
        topPanel.add(lineBtn);
        topPanel.add(arcBtn);
        topPanel.add(triangleBtn);
        topPanel.add(diamondBtn);
        topPanel.add(polygonBtn);
        topPanel.add(fillOvalBtn);

        drawingPanel = new DrawingPanel();
        drawingPanel.setBackground(Color.WHITE);

        JLabel heading = new JLabel("Click any button to draw a shape", JLabel.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 24));
        heading.setForeground(new Color(40, 40, 120));
        heading.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        add(heading, BorderLayout.NORTH);
        add(topPanel, BorderLayout.SOUTH);
        add(drawingPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    JButton createButton(String text, Color color) {
        JButton btn = new JButton(text);
        btn.setFont(btnFont);
        btn.setBackground(color);
        btn.setFocusable(false);
        btn.addActionListener(this);
        return btn;
    }

    public void actionPerformed(ActionEvent e) {
        currentShape = e.getActionCommand();
        drawingPanel.repaint();
    }

    class DrawingPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3));
            g2.setColor(new Color(50, 50, 50));

            if (currentShape.equals("Circle")) {
                g2.drawOval(320, 120, 150, 150);
            }
            else if (currentShape.equals("Oval")) {
                g2.drawOval(280, 140, 220, 120);
            }
            else if (currentShape.equals("Rectangle")) {
                g2.drawRect(280, 140, 220, 120);
            }
            else if (currentShape.equals("Square")) {
                g2.drawRect(320, 120, 150, 150);
            }
            else if (currentShape.equals("Line")) {
                g2.drawLine(250, 100, 550, 250);
            }
            else if (currentShape.equals("Arc")) {
                g2.drawArc(280, 120, 220, 150, 0, 180);
            }
            else if (currentShape.equals("Triangle")) {
                int[] x = {390, 300, 480};
                int[] y = {100, 250, 250};
                g2.drawPolygon(x, y, 3);
            }
            else if (currentShape.equals("Diamond")) {
                int[] x = {390, 320, 390, 460};
                int[] y = {100, 180, 260, 180};
                g2.drawPolygon(x, y, 4);
            }
            else if (currentShape.equals("Polygon")) {
                int[] x = {330, 380, 450, 430, 350, 300};
                int[] y = {120, 90, 130, 210, 240, 180};
                g2.drawPolygon(x, y, 6);
            }
            else if (currentShape.equals("Fill Oval")) {
                g2.setColor(new Color(255, 120, 120));
                g2.fillOval(300, 130, 200, 120);
            }
        }
    }

    public static void main(String[] args) {
        new ShapeButtonsFrame();
    }
}
```
<img width="1087" height="718" alt="image" src="https://github.com/user-attachments/assets/148e9aee-d207-4bf8-8f8e-e000e79d8053" />

## Code-16
```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PaintBrushApp extends JFrame {

    JComboBox<String> colorBox;
    JComboBox<Integer> sizeBox;
    JButton clearButton;

    DrawPanel drawPanel;

    Color selectedColor = Color.BLACK;
    int brushSize = 5;

    ArrayList<BrushPoint> points = new ArrayList<>();

    PaintBrushApp() {
        setTitle("Paint Brush Using Mouse Events");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(230, 240, 255));
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        JLabel titleLabel = new JLabel("Simple Paint Brush");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setForeground(new Color(30, 60, 120));

        JLabel colorLabel = new JLabel("Select Color:");
        colorLabel.setFont(new Font("Arial", Font.BOLD, 16));

        String[] colors = {"Black", "Red", "Blue", "Green", "Pink", "Orange"};
        colorBox = new JComboBox<>(colors);
        colorBox.setFont(new Font("Arial", Font.PLAIN, 15));

        JLabel sizeLabel = new JLabel("Brush Width:");
        sizeLabel.setFont(new Font("Arial", Font.BOLD, 16));

        Integer[] sizes = {2, 4, 6, 8, 10, 12, 15, 20};
        sizeBox = new JComboBox<>(sizes);
        sizeBox.setFont(new Font("Arial", Font.PLAIN, 15));

        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Arial", Font.BOLD, 15));
        clearButton.setBackground(new Color(255, 180, 180));

        topPanel.add(titleLabel);
        topPanel.add(colorLabel);
        topPanel.add(colorBox);
        topPanel.add(sizeLabel);
        topPanel.add(sizeBox);
        topPanel.add(clearButton);

        drawPanel = new DrawPanel();
        drawPanel.setBackground(Color.WHITE);

        add(topPanel, BorderLayout.NORTH);
        add(drawPanel, BorderLayout.CENTER);

        colorBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String colorName = (String) colorBox.getSelectedItem();

                if (colorName.equals("Black")) {
                    selectedColor = Color.BLACK;
                } else if (colorName.equals("Red")) {
                    selectedColor = Color.RED;
                } else if (colorName.equals("Blue")) {
                    selectedColor = Color.BLUE;
                } else if (colorName.equals("Green")) {
                    selectedColor = Color.GREEN;
                } else if (colorName.equals("Pink")) {
                    selectedColor = Color.PINK;
                } else if (colorName.equals("Orange")) {
                    selectedColor = Color.ORANGE;
                }
            }
        });

        sizeBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                brushSize = (Integer) sizeBox.getSelectedItem();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                points.clear();
                drawPanel.repaint();
            }
        });

        setVisible(true);
    }

    class BrushPoint {
        int x, y, size;
        Color color;

        BrushPoint(int x, int y, Color color, int size) {
            this.x = x;
            this.y = y;
            this.color = color;
            this.size = size;
        }
    }

    class DrawPanel extends JPanel implements MouseMotionListener, MouseListener {

        DrawPanel() {
            addMouseMotionListener(this);
            addMouseListener(this);
        }

        public void mouseDragged(MouseEvent e) {
            points.add(new BrushPoint(e.getX(), e.getY(), selectedColor, brushSize));
            repaint();
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (BrushPoint p : points) {
                g.setColor(p.color);
                g.fillOval(p.x, p.y, p.size, p.size);
            }
        }

        public void mouseMoved(MouseEvent e) { }
        public void mouseClicked(MouseEvent e) { }
        public void mousePressed(MouseEvent e) { }
        public void mouseReleased(MouseEvent e) { }
        public void mouseEntered(MouseEvent e) { }
        public void mouseExited(MouseEvent e) { }
    }

    public static void main(String[] args) {
        new PaintBrushApp();
    }
}
```
<img width="1062" height="704" alt="image" src="https://github.com/user-attachments/assets/801034c7-9b28-46bb-87ec-9828bd0dcaf2" />

## Code-17
```
package mypackage;

public class ClassA {
    public void show() {
        System.out.println("This is Class A");
    }
}
```
```
package mypackage;

public class ClassB {
    public void show() {
        System.out.println("This is Class B");
    }
}
```
```
package mypackage;

public class ClassC {
    public void show() {
        System.out.println("This is Class C");
    }
}
```
```
package mypackage;

public class ClassD {
    public void show() {
        System.out.println("This is Class D");
    }
}
```
```
package mypackage;

public class ClassE {
    public void show() {
        System.out.println("This is Class E");
    }
}
```
```
import mypackage.*;

public class MainApp {
    public static void main(String[] args) {

        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        ClassD d = new ClassD();
        ClassE e = new ClassE();

        a.show();
        b.show();
        c.show();
        d.show();
        e.show();
    }
}
```
<img width="433" height="188" alt="image" src="https://github.com/user-attachments/assets/2cae0fa9-de50-4d99-b216-b9b37860cfac" />

## Code-18
```
package mypack.subpackage;

public class SubClass {
    public void showSub() {
        System.out.println("Hello from Sub Package Class");
    }
}
```
```
package mypack;

import mypack.subpackage.SubClass;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("Hello from Main Package");

        SubClass obj = new SubClass();
        obj.showSub();
    }
}
```
<img width="655" height="116" alt="image" src="https://github.com/user-attachments/assets/27904960-21dc-4eae-8f04-67b53bb60221" />

## Code-19
```

public class ExceptionDemo {
    public static void main(String[] args) {

        // ArrayIndexOutOfBoundsException demonstration
        try {
            int[] arr = new int[5];

            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
            arr[4] = 50;

            System.out.println("Trying to access 6th element...");
            System.out.println(arr[5]);   // invalid index
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Message: Array index is out of range.");
        }

        System.out.println();

        // ArithmeticException demonstration
        try {
            int a = 10;
            int b = 0;
            int c = a / b;

            System.out.println("Result = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
            System.out.println("Message: Division by zero is not allowed.");
        }

        System.out.println();
        System.out.println("Program ended successfully after handling exceptions.");
    }
}
```
<img width="518" height="245" alt="image" src="https://github.com/user-attachments/assets/e8c9666f-3fb5-4b8f-b046-53ccbd9eb245" />

## Code-20
```
import java.util.Scanner;
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class StudentAgeTest {

    // method to check age
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 5 || age > 25) {
            throw new InvalidAgeException("Invalid Age! Age must be between 5 and 25.");
        } else {
            System.out.println("Valid student age.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            checkAge(age);   // calling method

        } catch (InvalidAgeException e) {
            System.out.println("User Defined Exception Caught!");
            System.out.println("Message: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        }

        sc.close();
    }
}
```
<img width="393" height="127" alt="image" src="https://github.com/user-attachments/assets/4b84d6d3-3451-48a3-8f2f-8c9f81f74485" />

## Code-21
```
import java.io.*;

public class ByteStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("bytefile.txt");
            fos.write("Hello Byte Stream".getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream("bytefile.txt");

            int b;
            System.out.println("Data from file:");

            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }

            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
<img width="367" height="130" alt="image" src="https://github.com/user-attachments/assets/99c55b6a-4d03-48ca-ad1b-51578df24b0f" />

```
import java.io.*;

public class PrimitiveStreamDemo {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"));

            dos.writeInt(111);
            dos.writeUTF("Himani Sharma");
            dos.writeDouble(95.5);
            dos.writeBoolean(true);

            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"));

            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double marks = dis.readDouble();
            boolean passed = dis.readBoolean();

            dis.close();

            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Passed: " + passed);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
<img width="411" height="180" alt="image" src="https://github.com/user-attachments/assets/9031650c-7152-432b-b3d7-54abb732c4d2" />

```
import java.io.*;

public class CharacterStreamDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("charfile.txt");
            fw.write("Hello Java File Handling");
            fw.close();

            FileReader fr = new FileReader("charfile.txt");

            int ch;
            System.out.println("Data from file:");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
<img width="456" height="173" alt="image" src="https://github.com/user-attachments/assets/64253002-58f7-44a3-a5c7-9dd3d2388d26" />

```
import java.io.*;

public class CharFileCopy {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("dest_char.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied using character stream.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
<img width="377" height="95" alt="image" src="https://github.com/user-attachments/assets/330e4592-6044-4ca1-a74f-07d1b3edd8de" />

```
import java.io.*;

public class ByteFileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("dest_byte.txt");

            int b;

            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();

            System.out.println("File copied using byte stream.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
<img width="352" height="139" alt="image" src="https://github.com/user-attachments/assets/e1f12fa7-a72d-4a43-9e74-239468e02206" />



## Code-22
```
// -------- INTERFACE --------
interface Printable {
    void print();
}

// -------- ABSTRACT CLASS --------
abstract class Shape {
    abstract void draw();

    void message() {
        System.out.println("This is an abstract class.");
    }
}

// -------- INHERITANCE --------
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// -------- CLASS IMPLEMENTING INTERFACE --------
class Document implements Printable {
    public void print() {
        System.out.println("Printing document using interface.");
    }
}

// -------- CLASS EXTENDING ABSTRACT CLASS --------
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// -------- MAIN CLASS --------
public class ConceptDemo {
    public static void main(String[] args) {

        // Inheritance
        System.out.println("---- INHERITANCE ----");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println();

        // Interface
        System.out.println("---- INTERFACE ----");
        Document doc = new Document();
        doc.print();

        System.out.println();

        // Abstract Class
        System.out.println("---- ABSTRACT CLASS ----");
        Circle c = new Circle();
        c.draw();
        c.message();
    }
}
```
<img width="470" height="317" alt="image" src="https://github.com/user-attachments/assets/b4b6aac6-3f78-49c7-95d4-90339c9be14c" />


