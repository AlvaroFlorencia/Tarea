

package execisesfirst;


public class MyCircle {                //Se pone la instrucción get y set  para cada variable
                                        //Se pone un constructor y un inicializador
   private MyPoint center;
   private int radius;

    public MyCircle() {
     this.center.setXY(0,0);
     this.radius=1;
    }

    public MyCircle(int x,int y, int radius) {
       this.center.setXY(x,y);
        this.radius=radius;
    }
     public MyCircle(MyPoint center, int radius) {
       this.center=center;
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return this.center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
   public int getCenterX() {
      return this.center.getX();
   
    }
   public void setCenterX(int x) {
      this.center.getX();
    
    }
    public int getCenterY() {
      return this.center.getY();
   
    }
   public void setCenterY(int y) {
      this.center.getY();
   }
   public int[] getXY (){
        int[] XY={this.center.getX(),this.center.getX()};
        return XY;
 }
      public void setXY(int x,int y) 
        {
       this.center.getX();
       this.center.getX();
    }

    @Override
    public String toString() {
        return "MyCircle[radius="+this.radius+",center="+this.center.toString()+"]"; //Se implementa un toString pata pasar los valores a String
    }
       public double getArea()
    {
        return (Math.PI*(this.radius*this.radius));
    }
    public double getCircumference()
    {
        return (Math.PI*(2*this.radius));
    }
    public double distance(MyCircle another)
    
    {
      return this.center.distance(another.getCenterX(),another.getCenterY());
              
    }
      
}
