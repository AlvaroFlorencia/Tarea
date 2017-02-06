
package execisesfirst;


public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {      //Se pone la instrucción get y set  para cada variable
                                                          //Se pone un constructor solamente.
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setTime(int hour,int minute,int second) {  //preguntar
        this.second = second;
         this.hour = hour;
        this.minute = minute;
        
      
    }

    @Override
    public String toString() {
       return String.format("%02d",this.hour)+":"+String.format("%02d",this.minute)+":"+String.format("%02d",this.second);//Se implementa un toString pata pasar los valores a String
    }
    
    public Time NextSecond() 
    {
        this.second++;
        if(second==60)
        {
            minute = minute+1;       //Se utiliza un if para verificar que cuando segundo llegue a 60 se convierta en 
            second=0;                //0 e incrementar un minuto
        }
        if (minute==60)              //Se utiliza un if para verificar que cuando minuto llegue a 60 se convierta en 
                                      //0 e incrementar una hora
        {
            hour=hour+1;
            minute=0;
            
        }
        if(hour==24)      //Se utiliza un if para verificar que cuando hora llegue a 24 se convierta en 
                          //
        {
            hour=0;
            
           
        }
        return this;
    }
     public Time PreviusSecond() 
    {
       if(second==0&&minute==0) //Se utiliza un if para verificar que cuando segundo y minuto lleguen a 0,
                     //restarle uno a hora
       {
           hour--;
       }
       if(second==0) //Se utiliza un if para verificar que cuando segundo sea 0 se convierta en 59 de lo
                      // contrario se le reste uno a segundo   
        {
           
            second=59;
            
        }
       else
       {
           second--;
       }
        if (minute==0) //Se utiliza un if para verificar que cuando minuto sea 0 se convierta en 59
        {
           
            minute=59;
            
        }
        
        if(hour==-1)  //Se utiliza un if para verificar que cuando hora sea -1 se convierta en 23
        {
            hour=23;
            
        
        }
        if(second==0) //Se utiliza un if para verificar que cuando segundo sea 0 se reste un minuto
        {
            minute--;
        }
       
        return this;
    }
    }
    
    

