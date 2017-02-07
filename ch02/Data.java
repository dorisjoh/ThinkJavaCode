/**
 * Examples from Chapter 2.
 */
public class Data {

    public static void main(String[] args) {
        
        //Variables Declard for public class "Data"
        String day, month, amer, euro;
        int date, year;
        
        //Data assigned to Variables
        day = "Tuesday"
        date = 7
        month = "February"
        year = 2017
        
        //Date formations
        amer = day + ", " + month + " " + date + ", " + year;
        euro = day + " " + date + " " + month + " " + year;
        
        System.out.println(amer);
        System.out.println(euro);
      
    }

}
