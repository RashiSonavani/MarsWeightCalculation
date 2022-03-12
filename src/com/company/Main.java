package com.company;

public class Main {

    public static void main(String[] args) {

        float earthweightSonavani;
        float marsweightSonavani;
        double marsweightInDoubleSonavani;
        int  marsWeightInIntSonavani;
        earthweightSonavani = 70;
        marsweightSonavani  = (earthweightSonavani  * 0.38F) ;
        System.out.println(earthweightSonavani + " kg on Earth is " + marsweightSonavani  + " kg on Mars ");

        marsweightInDoubleSonavani =marsweightSonavani ;
        System.out.println("Kilograms on Mars after converting to double "+ marsweightInDoubleSonavani );

        marsWeightInIntSonavani = (int)marsweightInDoubleSonavani;
        System.out.println("kilograms on mars when casted to interger "+ marsWeightInIntSonavani );

        char a = (char)marsWeightInIntSonavani;
        System.out.println("The ASCII table equivalent of marsWeightInInt is: "+ a);

        int exampleofMath0nChar = a * a;
        System.out.println("An example of a mathematical operation on the char type " + exampleofMath0nChar );
    }
}
