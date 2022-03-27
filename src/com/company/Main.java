package com.company;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {

	//task1();
    //task2();
    //task3();
    //task4();
        task5();


    }
    static void task1(){
    //a,b,c
        int intVar1 =2, intVar2 =3 ;

      short shortSum =  (short) (intVar1 + intVar2);
        System.out.println(shortSum);//5

        //d
        System.out.println(shortSum++); //5
        System.out.println(shortSum); //6
        //System.out.println(++shortSum); //7
        //e,f
        byte byteSum = (byte) shortSum;
        System.out.println("in byte: "+byteSum);
        //g
        System.out.println(++byteSum);//7

    }

    static void task2(){
        //a
        float a = 1.1345f;
        //Scanner scanner = new Scanner(System.in);

        System.out.println("Task 2: " +a);
        //float number = scanner.nextFloat();

        //b
        System.out.println("Round down to closest int: "+Math.floor(a));
        //c
        System.out.println("Round to closest int: "+Math.round(a));
        //d
        System.out.println("Round up to closest int: "+Math.ceil(a));
    }
    static void task3(){

        double b = Math.toRadians(45);

        //sin
        System.out.println("Task3 (sin in degrees): "+Math.sin(b));
        System.out.println("Task3 (sin in radians): "+Math.sin(45));
        //cos
        System.out.println("Cos: " + Math.cos(b));
        //tan
        System.out.println("Tan: "+Math.tan(b));
        //asin
        System.out.println("asin: "+Math.asin(b));
        //acos
        System.out.println("acos: "+Math.acos(b));
        //atan
        System.out.println("atan: "+Math.atan(b));
        //ata2
        System.out.println("atan2: "+Math.atan2(45,60));
    }
    static void task4(){
        int c=2;
        int d = 10;

        //1. Increment and decrement operators

        System.out.println("Increment of 2: "+ ++c);
        //System.out.println("Increment of 2: "+ c++);
        System.out.println("Decrement of 10: "+ --d);
        //System.out.println("Decrement of 10: "+ d--);

        //2. Bitwise Complement operator
        int e = 35;
        System.out.println("Bitwise Complement operator for 35: "+ ~e);

        //3. Arithmetic operator
        int f =5;
        int g =11;
        System.out.println("Addition of 5 and 11: "+ (f+g));
        System.out.println("Subtraction of 5 and 11: "+ (f-g));
        System.out.println("Multiplication of 5 and 11: " + (f*g));

        //4. Relational operator
        System.out.println("If 100 >= that 35?: "+ (100>=35));
        System.out.println("If 100 is equal to 35?: "+ (100 == 35));

        //5. Bitwise operator
        System.out.println("Right shift for 34: "+ (34>>1));//divides by 2
        System.out.println("Left shift for 34: "+ (34<<2));//multiples by 4

        //6. Conditional operators(&&, ||)
        System.out.println("True and False: "+ (true && false));
        System.out.println("False and False: "+ (false && false));

        System.out.println("True or False: " + (true || false));
        System.out.println("False or False: "+ (false || false));

        //ternary operator(?:)
        int x = 3;
        System.out.println("If x is equal to 3(0 otherwise): "+ ((x==1)?3:0));
        System.out.println("If x is equal to 3(0 otherwise): "+ ((x==3)?3:0));
    }

    static void task5(){
        int distance,hour,min,sec;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your distance in meters: ");
        distance = scanner.nextInt();
        float dist_km = (float) distance/1000;
        float dist_miles = (float) distance/1609;

        System.out.println("Please enter your time taken(only hours): ");
        hour = scanner.nextInt();
        float hours_to_sec =(float) hour*3600;

        System.out.println("Please enter your time taken(only minutes): ");
        min = scanner.nextInt();
        float min_to_hours =(float) min/60;
        float min_to_sec = (float) min*60;

        System.out.println("Please enter your time taken(only seconds): ");
        sec = scanner.nextInt();
        float sec_to_hours = (float) sec/3600;

        float m_s = (float) distance/(hours_to_sec+min_to_sec+sec);
        float km_h = dist_km/(hour+min_to_hours+sec_to_hours);
        float miles_h = dist_miles/((hour+min_to_hours+sec_to_hours));

        System.out.println("Your speed in m/s: "+ m_s);
        System.out.println("Your speed in km/h: "+km_h);
        System.out.println("Your speed in km/h: "+miles_h);


    }
}
