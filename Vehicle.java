import java.util.*;

public class Vehicle
{
  private Ride[] vehicleRides;
  int rideCount;

  //Empty, a vehicle initially has no rides 
  public Vehicle()
  {

  }//Vehicle

  public Vehicle(Ride[] vehicleRides)
  {
    this.vehicleRides = vehicleRides;
  }//Vehicle

  public int calcScore()
  {
    
  }//calcScore


  public void addRide(ride addedRide)
  {
    //check for overlaps
    for(int rideNo = 0; rideNo < rideCount; rideNo ++)
    {
      if(addedRide.overlaps(vehicleRides[rideNo]))
      {//remove if they overlap
        remove(rideNo);
      }
    }

    int rideIndex = -1;;

    for(int rideNo = rideNo-1;rideNo>=0;rideNo--)
    {
      if(addedRide.before(vehicleRides[rideNo]))
      {//if the new ride will come before a current array ride, it moves the current ride forwasrd
        vehicleRides[rideNo+1]=vehicleRides[rideNo];
      }else if(rideIndex==-1){rideIndex=rideNo}
    }

  }//addRide

  private void remove(int index)
  {
    for(int rideNo = index;rideNo<rideCount-1;rideNo++)
    {

      vehicleRides[index] = vehicleRides[index]+1;
      rideCount--;
  
    }//push all the rides back an index and decrease count

  }//remove
}
