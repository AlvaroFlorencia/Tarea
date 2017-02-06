
package execisesfirst;

public class Circle1 {
    private double radius=1;
    private String color="red";
    
    public Circle1()
            {
             radius=1;                                  //Se pone la instrucción get y set  para cada variable
             color="red";                               //Se pone un constructor y un inicializador
            }
    public Circle1(double radius)
    {
        this.radius=radius;
        color="red";
        
    }
    public Circle1(String color)
        {
        this.radius=1;
        this.color=color;
        
    }
    
    public Circle1(double radius,String color)
    {
       this.radius=radius;
       this.color=color;
    }
   public double  getradius()
   {
      return this.radius; 
   }
      
   public String  getColor()
   {
      return this.color; 
   }
   public void setRadius(double radius)
   {
       this.radius=radius;
   }

    public void setColor(String color) {
        this.color = color;
    }
   
   @Override
   public String toString()
   {
       return  "Cirle1[radius="+this.radius+",color="+this.color+"]"; //Se implementa un toString pata pasar los valores a String
}
public double getArea()
{
    return ((this.radius * this.radius) * Math.PI);          //Se multiplica dos veces el radio por PI 
    
}

   
    
}