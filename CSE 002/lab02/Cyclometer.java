/*
  Name: Gustavo Adame Delarosa
  Date: 9/7/18
  Course: CSE 002-110
  About: This program simulates a bicycle cyclometer that records two kinds of data:
  1. the time elapsed in seconds.
  2. the number of rotations of the front wheel during that time. 
*/
public class Cyclometer {
    // main method required for every Java program
   public static void main(String[] args) {
//The integers used in this program
  int secsTrip1 = 480;  //initializes secsTrip1 480, which states the number of seconds of trip 1
  int secsTrip2 = 3220;  //initializes secsTrip2 3220, which states the number of seconds of trip 2
      int countsTrip1 = 1561;  //initializes countTrip1 1561, which states the number of counts of trip 1
      int countsTrip2 = 9037; //initializes countTrip2 9037, which states the number of count of trip 2
 
 //The operations used in this program 
  double wheelDiameter = 27.0;  //Initializes wheelDiameter as 27.0 
    double PI = 3.14159; // States Pi as a constant
    int feetPerMile = 5280;  //States the conversion factor of feetPerMile
    int inchesPerFoot = 12;   //States the conversion factor of inchesPerFoot
    int secondsPerMinute = 60;  //States the conversion factor of secondsPerMinute
    double distanceTrip1, distanceTrip2, totalDistance;  //Declares distanceTrip1, distanceTrip2, totalDistance as double
  
  //Outputs of the program
       //Prints out the time it took for trip 1 and the counts it had 
   System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts."); 
       //Prints out the time it took for trip 1 and the counts it had
     System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts.");
  
  distanceTrip1 = countsTrip1 * wheelDiameter * PI;  // Gives distance in inches
  distanceTrip1 /= inchesPerFoot * feetPerMile; // Gives distance in miles
  distanceTrip2 = countsTrip2 * wheelDiameter * PI / inchesPerFoot / feetPerMile;
    totalDistance = distanceTrip1 + distanceTrip2;

  //Print out the output data.
  System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");



}  //end of main method   
} //end of class


