import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.io.*;
import static org.junit.Assert.*;

//names of all students for whom the assignment is submitted : Brian Fay, Stephen Chavez

public class Examples{
    /**
     * create data for time
     */
    Time time1 = new Time(13, 22);
    Time time2 = new Time(14, 30);
    Time time3 = new Time(15, 38);
    Time time4 = new Time(17, 20);
    Time time5 = new Time(3, 33);
    Time time6 = new Time(4, 45);
    Time time7 = new Time(5, 15);
    Time time8 = new Time(7, 33);
    Time time9 = new Time(9, 1);
    Time time10 = new Time(10, 52);
    Time time11 = new Time(11, 17);
    Time time12 = new Time(12, 42);

    /**
     * creates sets of readings to use in tests
     */

    Reading reading1 = new Reading(time1, 33.0, 1.0);
    Reading reading2 = new Reading(time2, 34.0, 0.0);
    Reading reading3 = new Reading(time3, 36.0, 0.0);
    Reading reading4 = new Reading(time4, 32.0, 2.0);
    Reading reading5 = new Reading(time5, 27.0, 0.0);
    Reading reading6 = new Reading(time6, 29.0, 1.0);
    Reading reading7 = new Reading(time7, 31.0, 3.0);
    Reading reading8 = new Reading(time8, 32.0, 2.0);
    Reading reading9 = new Reading(time9, 35.0, 1.0);
    Reading reading10 = new Reading(time10, 38.0, 1.0);
    Reading reading11 = new Reading(time11, 43.0, 0.0);
    Reading reading12 = new Reading(time12, 56.0, 3.0);

    LinkedList<DailyWeatherReport>list1 = new LinkedList<>();

   public Examples() {
       /**
        * Create linked lists for temperatures measured
        */
       LinkedList<Double> temp1 = new LinkedList<>();
       temp1.add(31.0);
       temp1.add(32.0);
       temp1.add(29.0);
       temp1.add(35.0);



       LinkedList<Double> temp2 = new LinkedList<>();
       temp2.add(41.0);
       temp2.add(42.0);
       temp2.add(39.0);
       temp2.add(35.0);

       LinkedList<Double> temp3 = new LinkedList<>();
       temp3.add(36.0);
       temp3.add(33.0);
       temp3.add(32.0);
       temp3.add(34.0);

       LinkedList<Double> temp4 = new LinkedList<>();
       temp4.add(42.0);
       temp4.add(42.0);
       temp4.add(44.0);
       temp4.add(44.0);

       LinkedList<Double> temp5 = new LinkedList<>();
       temp5.add(41.0);
       temp5.add(41.0);
       temp5.add(41.0);
       temp5.add(41.0);


       /**
        * Create linked lists for rainfall measured
        */

       LinkedList<Double> rain1 = new LinkedList<Double>();
       rain1.add(2.0);
       rain1.add(0.0);
       rain1.add(1.0);

       LinkedList<Double> rain2 = new LinkedList<Double>();
       rain2.add(1.0);
       rain2.add(0.0);
       rain2.add(0.0);

       LinkedList<Double> rain3 = new LinkedList<Double>();
       rain3.add(0.0);
       rain3.add(0.0);
       rain3.add(0.0);

       LinkedList<Double> rain4 = new LinkedList<Double>();
       rain4.add(3.0);
       rain4.add(4.0);
       rain4.add(2.0);

       LinkedList<Double> rain5 = new LinkedList<Double>();
       rain5.add(6.0);
       rain5.add(3.0);
       rain5.add(1.0);

/**
 * Create dates for data
 */
       GregorianCalendar date1 = new GregorianCalendar(2019, 12, 1);
       GregorianCalendar date2 = new GregorianCalendar(2019, 12, 2);
       GregorianCalendar date3 = new GregorianCalendar(2019, 12, 3);
       GregorianCalendar date4 = new GregorianCalendar(2019, 12, 4);
       GregorianCalendar date5 = new GregorianCalendar(2019, 12, 5);
       GregorianCalendar date6 = new GregorianCalendar(2019,11,30);
       GregorianCalendar date7 = new GregorianCalendar(2019,11,29);





       LinkedList monitorRead1 = new LinkedList();
            monitorRead1.add(reading1);
            monitorRead1.add(reading2);
            monitorRead1.add(reading3);

       LinkedList monitorRead2 = new LinkedList();
            monitorRead1.add(reading4);
            monitorRead1.add(reading5);
            monitorRead1.add(reading6);

       LinkedList monitorRead3 = new LinkedList();
            monitorRead1.add(reading7);
            monitorRead1.add(reading8);
            monitorRead1.add(reading9);
       LinkedList monitorRead4 = new LinkedList();
            monitorRead1.add(reading10);
            monitorRead1.add(reading11);
            monitorRead1.add(reading12);

       /**
        * adds daily reports using the method within WeatherMonitor
        */




   }
       /**
        * Tests for methods for the readings
        */
       @Test //tests getter method for rain
       public void testRead1(){
           assertTrue(1.0 == reading1.getRainfall());
       }
    @Test //tests getter method for temperature
    public void testRead2(){
        assertTrue(33 == reading1.getTemperature());
    }
    @Test //tests getter method for rain
    public void testRead3(){
        assertFalse(1.0 == reading2.getRainfall());
    }
    @Test //tests getter method for temperature
    public void testRead4(){
        assertTrue(33 == reading1.getTemperature());
    }
    @Test //tests getter method for time
    public void testRead5(){
        assertTrue(time1 == reading1.getTime());
    }
    @Test //tests getter method for time
    public void testRead6(){
        assertFalse(time1 == reading2.getTime());
    }
    @Test //tests setter method for rain
    public void testRead7(){
           reading1.setRainfall(10);
        assertTrue(10.0 == reading1.getRainfall());
    }
    @Test //tests setter method for rain
    public void testRead8(){
           reading1.setRainfall(10);
           assertFalse(1.0 == reading1.getRainfall());
    }
    @Test //tests setter method for temperature
    public void testRead9(){
        reading1.setTemperature(90);
        assertTrue(90 == reading1.getTemperature());
    }
    @Test //tests setter method for temperature
    public void testRead10(){
        reading1.setTemperature(90);
        assertFalse(33 == reading1.getTemperature());
    }

    /**
     * Testing methods for Weather Monitor (avgTempForMonth/avgRainfallForMonth)
     */
    @Test
    public void testMon1(){
        GregorianCalendar date1 = new GregorianCalendar(2019, 12, 1);
        GregorianCalendar date2 = new GregorianCalendar(2019, 12, 2);
        GregorianCalendar date3 = new GregorianCalendar(2019, 12, 3);
        GregorianCalendar date4 = new GregorianCalendar(2019, 12, 4);
        GregorianCalendar date5 = new GregorianCalendar(2019, 12, 5);
        GregorianCalendar date6 = new GregorianCalendar(2019,11,30);
        GregorianCalendar date7 = new GregorianCalendar(2019,11,29);





        LinkedList monitorRead1 = new LinkedList();
        monitorRead1.add(reading1);
        monitorRead1.add(reading2);
        monitorRead1.add(reading3);

        LinkedList monitorRead2 = new LinkedList();
        monitorRead1.add(reading4);
        monitorRead1.add(reading5);
        monitorRead1.add(reading6);

        LinkedList monitorRead3 = new LinkedList();
        monitorRead1.add(reading7);
        monitorRead1.add(reading8);
        monitorRead1.add(reading9);
        LinkedList monitorRead4 = new LinkedList();
        monitorRead1.add(reading10);
        monitorRead1.add(reading11);
        monitorRead1.add(reading12);
        WeatherMonitor monitor1 = new WeatherMonitor(list1);


        monitor1.addDailyReport(date3, monitorRead1);
        monitor1.addDailyReport(date4, monitorRead2);
        monitor1.addDailyReport(date5, monitorRead3);
        monitor1.addDailyReport(date5, monitorRead4);
        assertTrue(424/12 == monitor1.averageTempForMonth(12,2019));
    }
    @Test
    public void testMon2(){
        GregorianCalendar date1 = new GregorianCalendar(2019, 12, 1);
        GregorianCalendar date2 = new GregorianCalendar(2019, 12, 2);
        GregorianCalendar date3 = new GregorianCalendar(2019, 12, 3);
        GregorianCalendar date4 = new GregorianCalendar(2019, 12, 4);
        GregorianCalendar date5 = new GregorianCalendar(2019, 12, 5);
        GregorianCalendar date6 = new GregorianCalendar(2019,11,30);
        GregorianCalendar date7 = new GregorianCalendar(2019,11,29);





        LinkedList monitorRead1 = new LinkedList();
        monitorRead1.add(reading1);
        monitorRead1.add(reading2);
        monitorRead1.add(reading3);

        LinkedList monitorRead2 = new LinkedList();
        monitorRead1.add(reading4);
        monitorRead1.add(reading5);
        monitorRead1.add(reading6);

        LinkedList monitorRead3 = new LinkedList();
        monitorRead1.add(reading7);
        monitorRead1.add(reading8);
        monitorRead1.add(reading9);
        LinkedList monitorRead4 = new LinkedList();
        monitorRead1.add(reading10);
        monitorRead1.add(reading11);
        monitorRead1.add(reading12);
        WeatherMonitor monitor1 = new WeatherMonitor(list1);


        monitor1.addDailyReport(date3, monitorRead1);
        monitor1.addDailyReport(date4, monitorRead2);
        monitor1.addDailyReport(date5, monitorRead3);
        monitor1.addDailyReport(date5, monitorRead4);

        assertTrue(18 == monitor1.totalRainfallForMonth(12,2019));
    }

    @Test
    public void testCalendar(){
        GregorianCalendar date1 = new GregorianCalendar(2019, 12, 1);
        GregorianCalendar date2 = new GregorianCalendar(2019, 12, 2);
        GregorianCalendar date3 = new GregorianCalendar(2019, 12, 3);
        GregorianCalendar date4 = new GregorianCalendar(2019, 12, 4);
        GregorianCalendar date5 = new GregorianCalendar(2019, 12, 5);
        GregorianCalendar date6 = new GregorianCalendar(2019,11,30);
        GregorianCalendar date7 = new GregorianCalendar(2019,11,29);





        LinkedList monitorRead1 = new LinkedList();
        monitorRead1.add(reading1);
        monitorRead1.add(reading2);
        monitorRead1.add(reading3);

        LinkedList monitorRead2 = new LinkedList();
        monitorRead1.add(reading4);
        monitorRead1.add(reading5);
        monitorRead1.add(reading6);

        LinkedList monitorRead3 = new LinkedList();
        monitorRead1.add(reading7);
        monitorRead1.add(reading8);
        monitorRead1.add(reading9);
        LinkedList monitorRead4 = new LinkedList();
        monitorRead1.add(reading10);
        monitorRead1.add(reading11);
        monitorRead1.add(reading12);

        LinkedList<Double> temp1 = new LinkedList<>();
        temp1.add(31.0);
        temp1.add(32.0);
        temp1.add(29.0);
        temp1.add(35.0);

        LinkedList<Double> rain1 = new LinkedList<Double>();
        rain1.add(2.0);
        rain1.add(0.0);
        rain1.add(1.0);
        WeatherMonitor monitor1 = new WeatherMonitor(list1);
        DailyWeatherReport daily1 = new DailyWeatherReport(date1,temp1, rain1);
        list1.add(daily1);


        monitor1.addDailyReport(date3, monitorRead1);
        monitor1.addDailyReport(date4, monitorRead2);
        monitor1.addDailyReport(date5, monitorRead3);
        monitor1.addDailyReport(date5, monitorRead4);
        assertTrue(12.0 == (daily1.getDate().get(GregorianCalendar.MONTH)));
    }

}


