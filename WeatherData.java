import java.util.ArrayList;
public class WeatherData
{
    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> temps) 
    {
        temperatures = temps;
    }

    public String toString()
    {
        return temperatures.toString();
    }

    public void cleanData(double lower, double upper) 
    {
        for(int i = 0; i < temperatures.size(); i++)
        {
            double temp = temperatures.get(i);
            if(temp < lower || temp > upper)
            {
                temperatures.remove(i);
                i--;
            }
        }
    } //cleans list to include only temps from the range
   
    public int longestHeatWave(double threshold)
    {
        int heatWave = 0;
        int max = 0;
        for(double t : temperatures)
        {
            if(t > threshold)
            {
                heatWave ++; 
                if(heatWave > max) max = heatWave; //checks if heatwave is > than last recorded heatwave, sets the longest to max
            }
            else heatWave = 0; //if temp is not above the threshold, it breaks the heatwave
        }
        return max;
    }
   
}
