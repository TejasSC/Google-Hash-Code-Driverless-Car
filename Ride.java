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

    boolean overlap = false;

    for(int time = earliestStart; time <= latestFinishi;time ++)
    {
      if(time>ride.earliestStart&&time<latestFinish){overlap=true};
    }

    return overlap
  }// Overlap

  public boolean Before(Ride ride) 
  {
    return (this.earliestStart<ride.earliestStart);

  }//Before

  public boolean After(Ride ride)
  {
    return (ride.latestFinish<this.latestFinish);
  }// After
}//Ride
