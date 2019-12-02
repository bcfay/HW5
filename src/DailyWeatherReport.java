import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport {
    private GregorianCalendar date;
    private LinkedList temperature;
    private LinkedList rainfall;


    public DailyWeatherReport(GregorianCalendar date, LinkedList temperature, LinkedList rainfall) {
        this.date = date;
        this.temperature = temperature;
        this.rainfall = rainfall;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public LinkedList getTemperatureList() {
        return temperature;
    }

    public LinkedList getRainfallList() {
        return rainfall;
    }

    public double getTemperature(){
        return sumList(this.temperature);
    }

    public double getRainfall(){
        return sumList(this.rainfall);
    }

    private double sumList(LinkedList<Double> readings){
        double sum=0;
        for(double i :readings){
            sum+=i;
        }
        return sum;
    }
}
