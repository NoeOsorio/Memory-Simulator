import java.util.ArrayList;

public class Page 
{
  public int id;
  public int physical;
  public byte R;
  public byte M;
  public int inMemTime;
  public int lastTouchTime;
  public long high;
  public long low;
  public ArrayList<String> segmentos;

  public Page( int id, int physical, byte R, byte M, int inMemTime, int lastTouchTime, long high, long low ) 
  {
    this.id = id;
    this.physical = physical;
    this.R = R;
    this.M = M;
    this.inMemTime = inMemTime;
    this.lastTouchTime = lastTouchTime;
    this.high = high;
    this.low = low;

  } 	

  public Page( int id, int physical, byte R, byte M, int inMemTime, int lastTouchTime, long high, long low, ArrayList<String> segmentos ) 
  {
    this.id = id;
    this.physical = physical;
    this.R = R;
    this.M = M;
    this.inMemTime = inMemTime;
    this.lastTouchTime = lastTouchTime;
    this.high = high;
    this.low = low;
    this.segmentos = segmentos;
  } 

}
