import java.util.*;

public class Ride
{
  private final Intersection startInt;
  private final Intersection endInt;
  private final int earliestStart;
  private final int latestFinish;

  public Ride(Intersection startInt, Intersection endInt, int earliestStart, int latestFinish)
  { 
    this.startInt = startInt;
    this.endInt = endInt;
    this.earliestStart = earliestStart;
    this.latestFinish = latestFinish;
  }//Ride constructor

}//Ride
