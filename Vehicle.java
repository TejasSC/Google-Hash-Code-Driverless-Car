import java.util.*;

public class Vehicle
{
  private Ride[] vehicleRides;
  int rideCount;
  int bonus;
  //Empty, a vehicle initially has no rides 
  public Vehicle(int bonus)
  {
    rideCount=0;
    vehicleRides = new Ride[10000];
    this.bonus = bonus;
  }//Vehicle

  public Vehicle(Ride[] vehicleRides)
  {
    this.vehicleRides = vehicleRides;
  }//Vehicle

  public int calcScore()
  {
    int score = 0;
    
    int T = 0;
    for(Ride currentRide : vehicleRides)
    {//for all the rides
      if(T>=currentRide.earliestStart)
      {
        score=score+bonus;
        T = currentRide.earliestStart;
      }

      T+=GHCDC.distance(currentRide.startInt,currentRide.endInt);

      if(T<=currentRide.latestFinis)
      {
        score+=GHCDC.distance(currentRide.startInt,currentRide.endInt);
      }
    }
   
  }//calcScore


  public void addRide(Ride addedRide)
  {
    //check for overlaps
    for(int rideNo = 0; rideNo < rideCount; rideNo ++)
    {
      if(addedRide.overlaps(vehicleRides[rideNo]))
      {//remove if they overlap
        remove(rideNo);
      }
    }

    int newRideIndex = 0;

    for(int rideNo = rideCount-1;rideNo>=0;rideNo--)
    {
      if(addedRide.before(vehicleRides[rideNo]))
      {//if the new ride will come before a current array ride, it moves the current ride forwasrd
        vehicleRides[rideNo+1]=vehicleRides[rideNo];
      }else if(newRideIndex==0){newRideIndex=rideNo+1;}
    }
    
    vehicleRides[newRideIndex]=addedRide;
    rideCount++;    

  }//addRide

  private void remove(int index)
  {
    for(int rideNo = index;rideNo<rideCount-1;rideNo++)
    {

      vehicleRides[index] = vehicleRides[index+1];
  
    }//push all the rides back an index and decrease count

      rideCount--;
  }//remove
}
