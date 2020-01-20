/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsubroutine;
import java.util.Scanner;

/**
 *
 * @author arkir7294
 */
public class FirstSubroutine {
    public static Scanner choice = new Scanner (System.in);
    
    public static void perimeterAreaVolume(){
        //Variable Declaration
        int playerChoice1;
        int shapeChoice;        
        int areaChoice;
        int volumeChoice;
        
        double tSide1;
        double tSide2;
        double tSide3;
        double triangleTotal;
        
        double sSide1;
        double sSide2;
        double sSide3;
        double sSide4;
        double squareTotal;
        
        double pSide1;
        double pSide2;
        double pSide3;
        double pSide4;
        double pSide5;
        double pentagonTotal;
        
        double tHeight;
        double tBase;
        double triangleAreaTotal;
        
        double sHeight;
        double sLength;
        double squareAreaTotal;
        
        double tHeightVolume;
        double tWidthVolume;
        double tLengthVolume;
        double tVolumeTotal;
        
        double sHeightVolume;
        double sWidthVolume;
        double sLengthVolume;
        double sVolumeTotal;
        
        final String SHAPE1 = "Triangle";
        final String SHAPE2 = "Square/Rectangle";
        final String SHAPE3 = "Pentagon";
        
        
        System.out.println("What would you like to find?");
        System.out.println("1. Perimeter");
        System.out.println("2. Area");
        System.out.println("3. Volume");
        playerChoice1 = choice.nextInt(); 
        
        switch (playerChoice1){
            case 1:
                //Determines shape
                System.out.println("What shape is it?");
                System.out.println("1. " + SHAPE1);
                System.out.println("2. " + SHAPE2);
                System.out.println("3. " + SHAPE3);
                shapeChoice = choice.nextInt();
                
                if (shapeChoice == 1){
                    //Asks for length
                    System.out.println("What is the length of side 1?");
                    tSide1 = choice.nextDouble();
                    System.out.println("What is the length of side 2?");
                    tSide2 = choice.nextDouble();
                    System.out.println("What is the length of side 3?");
                    tSide3 = choice.nextDouble();
                    
                    triangleTotal = tSide1 + tSide2 + tSide3;
                    
                    System.out.println("The perimeter of the triangle is " + triangleTotal);
                }else if (shapeChoice == 2){
                    //Asks for length
                    System.out.println("What is the length of side 1?");
                    sSide1 = choice.nextDouble();
                    System.out.println("What is the length of side 2?");
                    sSide2 = choice.nextDouble();
                    System.out.println("What is the length of side 3?");
                    sSide3 = choice.nextDouble();
                    System.out.println("What is the length of side 4?");
                    sSide4 = choice.nextDouble();
                    
                    squareTotal = sSide1 + sSide2 + sSide3 + sSide4;
                    
                    System.out.println("The perimeter of the square/rectangle is " + squareTotal);    
                }else if (shapeChoice == 3){
                    //Asks for length
                    System.out.println("What is the length of side 1?");
                    pSide1 = choice.nextDouble();
                    System.out.println("What is the length of side 2?");
                    pSide2 = choice.nextDouble();
                    System.out.println("What is the length of side 3?");
                    pSide3 = choice.nextDouble();
                    System.out.println("What is the length of side 4?");
                    pSide4 = choice.nextDouble();
                    System.out.println("What is the length of side 5?");
                    pSide5 = choice.nextDouble();
                    
                    pentagonTotal = pSide1 + pSide2 + pSide3 + pSide4 + pSide5;
                    
                    System.out.println("The perimeter of the pentagon is " + pentagonTotal);
                }
                break;
                
            case 2:
                //Asks shape
                System.out.println("What shape is it?");
                System.out.println("1. " + SHAPE1);
                System.out.println("2. " + SHAPE2);
                areaChoice = choice.nextInt();
                
                if (areaChoice == 1){
                    //Asks for length and height
                    System.out.println("What is the length of base (Meter)?");
                    tBase = choice.nextDouble();
                    System.out.println("What is the height (Meter)?");
                    tHeight = choice.nextDouble();
                    
                    triangleAreaTotal = (tBase * tHeight)/2;
                   
                    System.out.println("The area of the triangle is " + triangleAreaTotal);
                }else if (areaChoice == 2){
                    //Asks for length and height
                    System.out.println("What is the length (Meter)?");
                    sLength = choice.nextDouble();
                    System.out.println("What is the height (Meter)?");
                    sHeight = choice.nextDouble();
                    
                    squareAreaTotal = sLength * sHeight;
                    
                    System.out.println("The area of the square/rectangle is " + squareAreaTotal);
                }
                break;
            case 3:
                //Asks shape
                System.out.println("What shape is it?");
                System.out.println("1. " + SHAPE1);
                System.out.println("2. " + SHAPE2);
                volumeChoice = choice.nextInt();
                
                if (volumeChoice == 1){
                    //Asks for length, height and width
                    System.out.println("What is the length of base (Meter)?");
                    tLengthVolume = choice.nextDouble();
                    System.out.println("What is the height (Meter)?");
                    tHeightVolume = choice.nextDouble();
                    System.out.println("What is the width (Meter)");
                    tWidthVolume = choice.nextInt();
                    
                    tVolumeTotal = (tLengthVolume * tHeightVolume * tWidthVolume)/2;
                    
                    System.out.println("The volume of the triangular Prism is " + tVolumeTotal);
                }else if (volumeChoice == 2){
                    //Asks for length, height and width
                    System.out.println("What is the length of base (Meter)?");
                    sLengthVolume = choice.nextDouble();
                    System.out.println("What is the height (Meter)?");
                    sHeightVolume = choice.nextDouble();
                    System.out.println("What is the width (Meter)");
                    sWidthVolume = choice.nextInt();
                    
                    sVolumeTotal = sHeightVolume * sWidthVolume * sLengthVolume;
                    
                    System.out.println("The volume of the cube/rectangular prism is " + sVolumeTotal);
                }
                break;
        }
        
    }
    
    public static void RadiusDiameterCircumference(){
        //Variable Declaration 
        int playerChoice2;
        
        double given1;
        double radius;
        
        double given2;
        double diameter;
        
        double given3;
        double circumference;
        
        System.out.println("What would you like to find?");
        System.out.println("1. Radius");
        System.out.println("2. Diameter");
        System.out.println("3. Circumference");
        playerChoice2 = choice.nextInt(); 
        
        switch (playerChoice2){
            case 1:
                //calculates diameter using radius
                System.out.println("What is the diameter of the circle?");
                given1 = choice.nextDouble();
                
                radius = given1 / 2;
                
                System.out.println("The radius if the circle, given the diameter is " + radius);
                break;
            
            case 2:
                //Calculates radius using diameter
                System.out.println("What is the radius of the circle?");
                given2 = choice.nextDouble();
                
                diameter = given2 * 2;
                
                System.out.println("The diameter of the circle, given the radius is " + diameter);
                break;
                
            case 3:
                //calculates circumference
                System.out.println("What is the radius of the circle?");
                given3 = choice.nextDouble();
                
                circumference = Math.PI * given3 * 2;
                
                System.out.println("The circumference of the circle is " + circumference);
                break;
        }
        
    }
    
    public static void Average(){
        double avgNumber;
        
        double a[] = new double [4];
        
        System.out.println("What numbers would you like to average?");
        a[0] = choice.nextInt();
        a[1] = choice.nextInt();
        a[2] = choice.nextInt();
        a[3] = choice.nextInt();
        
        avgNumber = (a[0] + a[1] + a[2] + a[3]) / 4;
        
        System.out.println("The average of the numbers are " + avgNumber);
    }    
    
    public static void Factorial(){
        int factorial;
        int facto = 1;
        
        System.out.println("Enter the number that you would like to factorial");
        factorial = choice.nextInt();
        
        //Multiples number by the next number according to the number they want to factorial
        for (int i = 1; i <= factorial; i++){
            facto = facto * i;
        }
        System.out.println("The corresponding factorial is " + facto);
    }
    
    public static void Prime(){
        double prime;
        
        int m = 0;
        int flag = 0;
        
        System.out.println("Enter number you would like to check if it is a prime number");
        prime = choice.nextDouble();
        
        //Check if number is prime
        if (prime == 0 && prime == 1){
            System.out.println("Number is not prime");
        }else{
            for (int i = 2; i <= m;i++){
                if (prime % i == 0){
                    System.out.println("Number is not prime");
                    flag = 1;
                    break;
                }
            }
        if (flag == 0){
            System.out.println("Number is prime");
          }
        }  
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int playerChoice;
        boolean exit = false;
        
        //Will continuously re-prompt menu
        while (!exit){
        
        //Menu
        System.out.println("   ");
        System.out.println("What would you like to find?");
        System.out.println("1. Perimeter, Area, Volume");
        System.out.println("2. Radius, Diameter, Circumference");
        System.out.println("3. Average of 4 numbers");
        System.out.println("4. Factorial of a number");
        System.out.println("5. Check if a number is prime");
        System.out.println("6. Exit");
        playerChoice = choice.nextInt();
        
        switch (playerChoice){
            case 1:
                perimeterAreaVolume();
                break;
            case 2:
                RadiusDiameterCircumference();
                break;
            case 3:
                Average();
                break;
            case 4:
                Factorial();
                break;
            case 5:
                Prime();
                break;
            case 6:
                exit = true;
                break;
                
        }
        
    }
    
    }
}