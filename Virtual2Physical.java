import java.util.ArrayList;
import java.util.Vector;

public class Virtual2Physical {
  public static int pageNum(long memaddr, int numpages, long block) {
    int i = 0;
    long high = 0;
    long low = 0;

    for (i = 0; i <= numpages; i++) {
      low = block * i;
      high = block * (i + 1);
      if (low <= memaddr && memaddr < high) {
        return i;
      }
    }
    return -1;
  }

  public static ArrayList<String> segArray(int numpages, long block, long low, long high) {
    ArrayList<String> segmentos = new ArrayList<String>();
    int first = 4 * numpages;
    int last = first + 4;
    // System.out.println("Pag: " + numpages);
    long seg = block / 4;
    for (int i = first; i < last; i++) { 
      long tmpSeg = seg * i;
      // System.out.println( i + ": " +tmpSeg);
      if (tmpSeg >= low && tmpSeg < high) {
        String word = "S" + i%4;
        System.out.println(word);
        segmentos.add(word);
      }
    }
    return segmentos;
  }
}
