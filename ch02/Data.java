/**
 * Examples from Chapter 2.
 */
public class TimeMidnight {

    public static void main(String[] args) {
        
        //Variables Declard for public class "Data"
        String timeCalc;
        double hour, minute, second, midnight;
        
        //Data assigned to Variables
        hour = 12;
        minute = 58;
        second = 30;
        midnight = 24;
        
        //Time Calculations
        timeCalc = (hour *3600 + minute *60 + second) - midnight;
        
        System.out.println(timeCalc);
 
      
    }

}

public class TimeRemaining {

    public static void main(String[] args) {
        
        //Variables Declard for public class "Data"
        String timeCalc;
        double hour, minute, second, midnight;
        
        //Data assigned to Variables
        hour = 12;
        minute = 58;
        second = 30;
        midnight = 24;
        
        //Time Calculations
        timeCalc = (hour *60 + minute *60 + second) - midnight;
        
        System.out.println(timeCalc);
 
      
    }

}
