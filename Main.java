import java.util.ArrayList;
public class Main 
{
  public static void main(String[] args)
  {
    double[] temps = {
      99.1, 142, 85, 86.1, 84.6,
      94.3, 124.9, 98, 101, 102.5};
    ArrayList<Double> t = new ArrayList<Double>(); //<> is for the type
    for(double n : temps) t.add(n);   //converts to doubles
    WeatherData w = new WeatherData(t);

    System.out.print("Initial list: ");
    System.out.println(w);
    w.cleanData(85.0, 120.0);
    w.toString();
    System.out.print("Cleaned list: ");
    System.out.println(w);

    t.add(1,121.0);
    System.out.print("Added 120.0: ");
    System.out.println(w);
    t.add(1,84.0);
    System.out.print("Added 84.0: ");
    System.out.println(w);
    w.cleanData(85.0, 120.0);
    System.out.print("Cleaned list: ");
    System.out.println(w);

    double[] newTemps = {
        100.5, 98.5, 102, 103.9, 87.5, 105.2, 
        90.3, 94.8, 109.1, 102.1, 107.4, 93.2};
    ArrayList<Double> newList = new ArrayList<Double>();
    for(double n : newTemps) newList.add(n);
    w = new WeatherData(newList);
    System.out.println("Longest heatwave: ");
    System.out.println(w.longestHeatWave(100.5)); //prints 3
    System.out.println(w.longestHeatWave(95.2)); //prints 4
    }
  }

