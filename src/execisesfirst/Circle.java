

package execisesfirst;


public class Circle {
    private double radius;
    
    public Circle(){
        this(1.0);
    }
    public Circle(double radius)                                         
    {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;                                 //Se pone la instrucción get y set  para la variable radio
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return (Math.PI*(this.radius*this.radius));      //Se multiplica dos veces el radio por PI
    
    }
    public double getCircumference() {                    //Se multiplica PI por el  radio por 2
        return (Math.PI*(this.radius*2));
    
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + "]"; //Se implementa un toString pata pasar los valores a String
    }
    
    
}
