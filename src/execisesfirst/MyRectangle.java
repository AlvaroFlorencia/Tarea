
package execisesfirst;


public class MyRectangle {
    private MyPoint point1 = new MyPoint();
    private MyPoint point2 = new MyPoint();
    
     public MyRectangle(int x1, int y1,int x2,int y2)       
                                                               //Se pone un constructur y un incializador
     {
        this.point1.setXY(x1,y1);
        this.point2.setXY(x2,y2);
         
        
    }

    public MyRectangle(MyPoint point1, MyPoint  point2 ) {
        this.point1 = point1;
        this.point2 = point2;
       
    }
    public double getPerimeter()
    {
        int ld1=point1.getX()-point2.getX(); //Para sacar el perimetro  reste los valores de x  llamando al metodo de get x de Mypoint, así mismo lo s de y. 
        if(ld1 <0)                           //Si la resta sale negativa los multiplique por -1 para que saliera positiva
        {
         ld1=(ld1*-1);   
        }
        
        int ld2=point1.getY()-point2.getY();
        if(ld2 <0)
        {
         ld2=(ld2*-1);   
        }
        
        return((ld2*2)+(ld1*2)); //Se multiplica por dos ld1 y ld2 , y después se suman
    }
     public double getArea()
    {
        int ld1=point1.getX()-point2.getX();   //Para sacar el área  reste los valores de x  llamando al metodo de get x de Mypoint, así mismo los de y
        if(ld1 <0)                             //Si la resta sale negativa los multiplique por -1 para que saliera positiva
        {
         ld1=(ld1*-1);   
        }
        
        int ld2=point1.getY()-point2.getY(); 
        if(ld2 <0)
        {
         ld2=(ld2*-1);   
        }
        
        return(ld2*ld1);                //Se multiplica ld1 y ld2
    }
    
    @Override
    public String toString() {
       return "MyRectangle[Point 1="+point1.toString()+"Point 2="+point2.toString()+"]";//Se implementa un toString pata pasar los valores a String
    }
    
}
