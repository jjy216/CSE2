////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Lab02-Cyclometer
//01.30.2015
//CSE-002
//The bicycle cyclometer (meant to measure speed, distance, etc.) records two kinds of data, the time elapsed in seconds, and the number of rotations of the front wheel during that time.

public class Cyclometer { //main method required for every Java Program
  public static void main(String [] args){
  
    //our input data.
	int secsTrip1=480;  //Trip 1 takes 480s
	int secsTrip2=3220;  //Trip 2 takees 3220s
	int countsTrip1=1561;  //Trip 1 has 1561 rotations
	int countsTrip2=9037; //Trip 2 has 9037 rotations
	
    //our intermediate variables and output data.
	double wheelDiameter=27.0, //diameter of wheel is 27
  	PI=3.14159, //PI is 3.14159
  	feetPerMile=5280,  //In a mile, there are 5280 ft
  	inchesPerFoot=12,   //In a foot, there are 12 in.
  	secondsPerMinute=60;  //In a minute, there are 60 s.
	double distanceTrip1, distanceTrip2,totalDistance; 
 
    //Print out the numbers stored in the variables
	System.out.println("Trip 1 took "+
       	(secsTrip1/secondsPerMinute)+" minutes and had "+
       	countsTrip1+" counts.");
	System.out.println("Trip 2 took "+
       	(secsTrip2/secondsPerMinute)+" minutes and had "+
       	countsTrip2+" counts.");
       	
    //run the calculations, store the values.
	distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	distanceTrip1=inchesPerFoot*feetPerMile; // Converts to distance in miles
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	totalDistance=distanceTrip1+distanceTrip2;
	
	//Print out the output data
	System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");
  }
}
