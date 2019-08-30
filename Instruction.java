public class Instruction 
{
  public String inst;
  public long addr;
  public long low;
  public long high;

  public Instruction( String inst, long addr ) 
  {
    // System.out.println("Primera forma");
    this.inst = inst;
    this.addr = addr;
    // System.out.println("inst " + inst);
    // System.out.println("addr " + addr);
  }

  public Instruction(String inst, long addr, long low, long high) {
    // System.out.println("Segunda forma");
    this.inst = inst;
    this.addr = addr;
    this.low = low;
    this.high = high;
    // System.out.println("inst " + inst);
    // System.out.println("addr " + addr);
    // System.out.println("low " + low);
    // System.out.println("high " + high);
    // System.out.println("");
  }

}
