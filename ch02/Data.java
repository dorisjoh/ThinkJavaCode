/**
 * Examples from Chapter 2.
 */
public class TimeFromMidnight {

    public static void main(String[] args) {
        
        //Variables Declared for public class "Time"
        double sHour, sMinute, sSecond, mid;
        double eHour, eMinute, eSecond;
        double timeCalc1, timeCalc2, timeCalc3, perPassed1;
        double y, hr, min, sec;
        
        //Constant Variables
        hr = 3600;
        min = 60;
        sec = 1;
        
        //Data assigned to Variables
        sHour = 16 * hr;
        sMinute = 00 * min;
        sSecond = 12 * sec;
        mid = 24 *3600;
        
        //Secondary Variables
        eHour = 16 * hr;
        eMinute = 38 * min;
        eSecond = 29 * sec;
       
        //Time Calculations...Time Since Midnight
        timeCalc1 = (sHour + sMinute + sSecond);
        System.out.println("Time Since Midnight: " + timeCalc1);   
                     
         //Time Calculations...Time Until Midnight
        timeCalc2 = (mid - timeCalc1);
        System.out.println("Time Until Midnight: " + timeCalc2);
                     
        //Percentage of time since Midnight
        perPassed1 = ((timeCalc1/mid) * 100);
        System.out.printf("Percentage of time passed: %.2f", perPassed1);
        System.out.println("%");
        
        //Elapsed Time...Since Beginning
        timeCalc3 = ((eHour + eMinute + eSecond) - timeCalc1);
        System.out.println("Time Elapsed Since Beginning this Assignment: " + timeCalc3);
        
        
        //Calucation To Check Math
        y = (timeCalc1 + timeCalc2);
        
        if (mid == y) {
            System.out.println("The Math is Correct!");
        }
        else System.out.println ("Check the Math!");
    }

}

                  
