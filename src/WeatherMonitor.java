import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {

    LinkedList<IWeatherData> reports;

    public WeatherMonitor(LinkedList reports) {
        this.reports = reports;
    }

    public WeatherMonitor() {
        this.reports = new LinkedList();
    }

    /**
     * A method to calculate and return the average temperature for each month in a given year
     * @param month
     * @param year
     * @return average temperature
     */
    public double averageTempForMonth(int month, int year){
        double totalTemp=0;
        int i=0;
        for(IWeatherData m: reportsForMonth(month, year)){
            totalTemp += m.getTemperature();
            i++;
        }
        return totalTemp/i;
    }

    /**
     * a method to calculate the total amount of rainfall per each month in a given year
     * @param month
     * @param year
     * @return sum of all rainfall per month (total rainfall)
     */
    public double totalRainfallForMonth(int month, int year){
        double totalRainfall=0;
        for(IWeatherData m: reportsForMonth(month, year)){
            totalRainfall += m.getRainfall();
        }
        return totalRainfall;
    }


    /**
     * adds a date and a reading to the list of reports
     * @param date
     * @param readings
     */

    public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings){
            reports.add(createReport(date,readings));
    }


    private DailyWeatherReport createReport(GregorianCalendar date, LinkedList<Reading> readings){
        LinkedList temperature= new LinkedList();
        LinkedList rainfall = new LinkedList();
        for(Reading r : readings){
            temperature.add(r.getTemperature());
            rainfall.add(r.getRainfall());
        }

        return new DailyWeatherReport(date, temperature, rainfall);
    }


    /**
     * makes sure that the month, an year are correct, and if so will return the report for each month
     * @param month
     * @param year
     * @return monthsReport (consisting of the avg temp, total rainfall for each month)
     */
    private LinkedList<IWeatherData> reportsForMonth(int month, int year){
        LinkedList<IWeatherData> monthsReports = new LinkedList<>();

        for(IWeatherData d: this.reports){
            if((d.getDate().get((GregorianCalendar.MONTH)) == month) && (d.getDate().get((GregorianCalendar.YEAR)) == year)){
                monthsReports.add(d);
            }
        }
        return monthsReports;
    }


}
