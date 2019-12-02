import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {

    LinkedList<DailyWeatherReport> reports;

    public WeatherMonitor(LinkedList reports) {
        this.reports = reports;
    }

    public WeatherMonitor() {
        this.reports = new LinkedList();
    }

    public double averageTempForMonth(int month, int year){
        double totalTemp=0;
        int i=0;
        for(DailyWeatherReport m: reportsForMonth(month, year)){
            totalTemp += m.getTemperature();
            i++;
        }
        return totalTemp/i;
    }

    public double totalRainfallForMonth(int month, int year){
        double totalRainfall=0;
        for(DailyWeatherReport m: reportsForMonth(month, year)){
            totalRainfall += m.getRainfall();
        }
        return totalRainfall;
    }

    public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings){
            reports.add(createReport(date,readings));
    }

    private DailyWeatherReport createReport(GregorianCalendar date, LinkedList<Reading> readings){
        LinkedList tempurature= new LinkedList();
        LinkedList rainfall = new LinkedList();
        for(Reading r : readings){
            tempurature.add(r.getTempurature());
            rainfall.add(r.getRainfall());
        }

        return new DailyWeatherReport(date, tempurature, rainfall);
    }

    private LinkedList<DailyWeatherReport> reportsForMonth(int month, int year){
        LinkedList<DailyWeatherReport> monthsReports = new LinkedList<>();

        for(DailyWeatherReport d: this.reports){
            if((d.getDate().get((GregorianCalendar.MONTH)) == month) && (d.getDate().get((GregorianCalendar.YEAR)) == year)){
                monthsReports.add(d);
            }
        }
        return monthsReports;
    }


}
