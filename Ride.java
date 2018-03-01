import java.util.*;

public class Ride
{
  public final Intersection startInt;
  public final Intersection endInt;
  public final int earliestStart;
  public final int latestFinish;

  public Ride(Intersection startInt, Intersection endInt, int earliestStart, 
              int latestFinish)
  { 
    this.startInt = startInt;
    this.endInt = endInt;
    this.earliestStart = earliestStart;
    this.latestFinish = latestFinish;
  }//Ride constructor
   
  public boolean Overlap(Ride ride)
  {
    return true;
  }// Overlap

  public boolean Before(Ride ride) 
  {
    return true;

  }//Before

  public boolean After(Ride ride)
  {
    return true;
  }// After
}//Ride
