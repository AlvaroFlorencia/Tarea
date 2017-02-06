

package execisesfirst;


public class MyPoint {
    private int x;                      //Se pone la instrucción get y set  para cada variable
                                        //Se pone un constructor y un inicializador
                                      
  
    private int y;

    public MyPoint() {
        int x=0;
     int y=0;
    }

    

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
 public int[] getXY (){
        int[] XY={this.x,this.y};   //Se utiliza un get y set para recibir los dos valores
        return XY;
 }
      public void setXY(int x,int y) 
        {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return "("+this.x+","+this.y+")"; //Se implementa un toString pata pasar los valores a String
    }
    public double distance(int x,int y)
    {
        return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2)); //Para sacar la distancia se intoduce un valor diferente de x y y
    }                                                                //Se saca la raíz cuadrada de las suma de las diferenciasde al cuadrado de x y y.
    public double distance(MyPoint otro)
    {
        return Math.sqrt(Math.pow(otro.getX()-this.x,2)+Math.pow(otro.getY()-this.y,2)); //Para sacar la distancia de un punto diferente y este, se introduce
    }                                                                                    //los valores de otro punto y se saca la raíz cuadrada de las suma de las diferenciasde al cuadrado de 
     public double distance()                                                            //los valores de x  y y de los dos puntos
    {
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));                     //Se realiza el mismo procedimiento solo que desde el punto 0,0 , pero se ignora 0 debido a que al momento de sacar el cuadrdo vuelve a positivo
    }
    
    }
    
   

    
    
    
    
    
    

