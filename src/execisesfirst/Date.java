
package execisesfirst;


public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {         //Se pone la instrucción get y set  para cada variable
                                                        //Se pone un constructor solamente    
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(day < 1 || day > 31)               //Se pone un if para verificar si dia,mes año están detreno de los rangos estalecidos 
        {                                    // dia:entre 1 y  31 ,mes: entre 1 y 12,año entre 1990 y 9999.                           
               System.out.println("Enter another day between 1 and 31");
        }
        else
        {
            this.day = day;
        }
    }
    
    

    public void setMonth(int month) {
        if(month < 1 || month > 12)
        {
               System.out.println("Enter another month between 1 and 12");
        }
        else
        {
            this.month = month;
        }
    }

    public void setYear(int year) {
       if(year < 1900 || year > 9999)
        {
               System.out.println("Enter another year between 1900 and 9999");        }
        else
        {
            this.year = year;       }
    }

    public void  setDate(int day, int month, int year) {  //Se pone un set para todas la variables
        this.day = day;
        this.month = month;
        this.year = year;
    }
     @Override
   public String toString()
   {
       return String.format("%02d",this.day)+ "/" + String.format("%02d",this.month)+ "/"   //Se implementa un toString pata pasar los valores a String
               + String.format("%04d",this.year) ; 
    
}
}
