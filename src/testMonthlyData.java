import java.util.GregorianCalendar;
import java.util.LinkedList;

public class testMonthlyData {

    LinkedList<IWeatherData> reports;

    public void WeatherMonitor1(LinkedList reports) {
        this.reports = reports;
    }

    public void WeatherMonitor1() {
        this.reports = new LinkedList();
    }
    public double averageTempForMonth(int month, int year){
        double totalTemp=0;
        int i=0;
        System.out.print(this.reports);
        for(IWeatherData m: reportsForMonth(month, year)){
            totalTemp += m.getTemperature();
            i++;
        }
        return totalTemp/i;
    }

    private LinkedList<IWeatherData> reportsForMonth(int month, int year){
        LinkedList<IWeatherData> monthsReports = new LinkedList<>();

        for(IWeatherData d: this.reports){
            int m = d.getDate().get((GregorianCalendar.MONTH));

            if((m== month) && (d.getDate().get((GregorianCalendar.YEAR)) == year)){
                monthsReports.add(d);
            }
        }
        return monthsReports;
    }
}
