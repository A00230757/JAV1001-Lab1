/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harpreet Singh   Student ID:A00230757
 */


//PROGRAM DESCRIPTION
//Convert.java is a small command line application that allows a user to convert between different forms of measurement. This program:
//Collect a numeric value from the user and store it in an appropriate variable
//Collect the current unit of measurement
//Determine the appropriate conversion (in either direction, ie the user can enter km or mi)
//Display the new result


import java.util.Scanner;
public class Convert {
 
public static void main( String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter a Value To Convert");//gives message to user to enter value to convert
try{// to handle exception in case user enter other then numeric value to convert, it throughs error which will be handles in catch
Double valueToConvert=s.nextDouble();//to accept number from user and store in variable valueToConvert(double type)
System.out.println("Enter The Current Unit of Measure");// gives message to user to enter unit of measure
String unitOfMeasure=s.next();// accept and store unit of measure in unitOfMeasure(string variable)
unitOfMeasure=unitOfMeasure.toLowerCase();// sometimes user enter unit in mix of capital and small letter , to avaoid more conditional statements all characters of unit converted into lowercase.
Double miles=0.0,km=0.0,cm=0.0,in=0.0,kg=0.0,lb=0.0,g=0.0,oz=0.0,C=0.0,F=0.0,K=0.0,L=0.0,cups=0.0;//declaration of of various units of measurement in double and initialized to 0.
if(unitOfMeasure.equals("km")){ // if unit of measure in km then this condition convert into mi and display
miles=valueToConvert/1.61;
miles=Math.round(miles*100.0)/100.0;//used to round off double into 2 digits only
System.out.println(valueToConvert+ "km is equal to " +miles+"mi");
}
else if(unitOfMeasure.equals("mi")){// if unit of measure in mi then this condition  convert into km and display
km=valueToConvert/0.62;
km=Math.round(km*100.0)/100.0;//used to round off double into 2 digits only
System.out.println(valueToConvert+ "mi is equal to " +km+"km");
}
else if(unitOfMeasure.equals("cm")){// if unit of measure in km then this condition  convert into mi and display
in=valueToConvert/2.54;
in=Math.round(in*100.0)/100.0;//used to round off double into 2 digits only
System.out.println(valueToConvert+ "cm is equal to " +in+"in");
}
else if(unitOfMeasure.equals("in")){// if unit of measure in in then this condition  convert into cm and display
cm=valueToConvert/0.39;
cm=Math.round(cm*100.0)/100.0;//used to round off double into 2 digits only
System.out.println(valueToConvert+ "in is equal to " +cm+"cm");
}
else if(unitOfMeasure.equals("kg")){// if unit of measure in kg then this condition  convert into lb and display
lb=valueToConvert/0.45;
lb=Math.round(lb*100.0)/100.0;//used to round off double into 2 digits only
System.out.println(valueToConvert+ "kg is equal to " +lb+"lb");
}
else if(unitOfMeasure.equals("lb")){// if unit of measure in lb then this condition  convert into kg and display
kg=valueToConvert/2.21;
kg=Math.round(kg*100.0)/100.0;//used to round off double into 2 digits only
System.out.println(valueToConvert+ "lb is equal to " +kg+"kg");
}
else if(unitOfMeasure.equals("g")){// if unit of measure in g then this condition  convert into oz and display
oz=valueToConvert/28.35;
oz=Math.round(oz*100.0)/100.0;//used to round off double into 2 digits only
System.out.println(valueToConvert+ "g is equal to " +oz+"oz");
}
else if(unitOfMeasure.equals("oz")){// if unit of measure in oz then this condition  convert into g and display
g=valueToConvert/0.035274;
g=Math.round(g*100.0)/100.0;//used to round off double into 2 digits only
System.out.println(valueToConvert+ "oz is equal to " +g+"g");
}
else if(unitOfMeasure.equals("C") || unitOfMeasure.equals("c")){// if unit of measure in C then this condition  convert into F and K and display
F=(valueToConvert*9/5)+32;
F=Math.round(F*100.0)/100.0;//used to round off double into 2 digits only
K= valueToConvert+273.15;
K=Math.round(K*100.0)/100.0;//used to round off double into 2 digits only
System.out.println(valueToConvert+ "C is equal to " +F+"F");
System.out.println(valueToConvert+ "C is equal to " +K+"K");
}
else if(unitOfMeasure.equals("F")||unitOfMeasure.equals("f")){// if unit of measure in F then this condition  convert into C and K and display
C=(valueToConvert-32)*5/9;
C=Math.round(C*100.0)/100.0;//used to round off double into 2 digits only
K=(valueToConvert-32)*5/9+273.15;
K=Math.round(K*100.0)/100.0;//used to round off double into 2 digits only
System.out.println(valueToConvert+ "F is equal to " +C+"C");
System.out.println(valueToConvert+ "F is equal to " +K+"K");
}
else if(unitOfMeasure.equals("L")||unitOfMeasure.equals("l")){// if unit of measure in L then this condition  convert into cups and display
cups=valueToConvert/0.24;
cups=Math.round(cups*100.0)/100.0;//used to round off double into 2 digits only
System.out.println(valueToConvert+ "L is equal to " +cups+"cups");
}
else if(unitOfMeasure.equals("cup")||unitOfMeasure.equals("cups")){// if unit of measure in cup then this condition  convert into L and display
L=valueToConvert/4.17;
L=Math.round(L*100.0)/100.0;//used to round off double into 2 digits only
System.out.println(valueToConvert+ "cups is equal to " +L+"L");
}
else{// if unit of measure is invalid(or not program specific) then this condition  display instructions of invalid unit of measure
System.out.println("Invalid unit of measure");
}
}
catch(Exception ex){// if valueToConvert entered by user in start of program is not numeric than catch statement handle error
System.out.println("Invalid Valid To convert, Try Again conversion valueToConvert must be numeric");
}
}
}
