
package execisesfirst;


public class Rectangle {
private float lenght;
private float width;
 public Rectangle() {
        this.lenght =1.0f;
        this.width = 1.0f;
    }
    public Rectangle(float lenght, float width) {              //Se pone la instrucción get y set  para cada variable
                                                               //Se pone un constructur y un incializador
        this.lenght = lenght;
        this.width = width;
    }

public float getlenght()
{
    return this.lenght;
}

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

 public double getArea() {                                 //Para sacar el area del rectángulo se multplica width por lenght
        return  ((this.width)*(this.lenght));
    }
public double getPerimeter() {
        return  ((this.width*2)+(2*this.lenght));          //Para sacar su perimetro  se suma dos veces width y dos veces lenght
    }
    @Override
    public String toString() {
      return "Rectangle[length="+ this.lenght + ",width="+this.width+"]"; //Se implementa un toString pata pasar los valores a String
    }

}