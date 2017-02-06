
package execisesfirst;


public class MyTriangle {
    private MyPoint v1 = new MyPoint();        // Se utilizan instancias de Mypoint
                                        //Se pone un constructor y un inicializador
                                      
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    public MyTriangle(int x1, int y1,int x2,int y2,int x3,int y3 ) {
        this.v1.setXY(x1,y1);
        this.v2.setXY(x2,y2);
         this.v3.setXY(x3,y3);
         
        
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[v1="+v1.toString()+",v2="+v2.toString()+",v3="+v3.toString()+"]"; //Se implementa un toString pata pasar los valores a String
    }
    
    public double  getPerimeter()
            {
                  return (v1.distance(v2)+v1.distance(v3)+v2.distance(v3)); //Para sacar el perimetro se saca la dsitancia con las instrucción de distance de Mypoint
            }
    public String getType()
    {
        double lado1=v1.distance(v2);
        double lado2=v1.distance(v3);
        double lado3=v2.distance(v3);
        if(lado1==lado3&&lado1==lado2&&lado2==lado3)  //Se utiliza un if para reconocer el tipo , sin son iguales es equilatero
        {
           return"Equilatero";
        }
        else
        {
         
        
        if(lado1==lado2&&lado2!=lado3)      //Se utiliza un if para reconocer el tipo ,si dos son iguales es Isoceles
               {
                   return"Isoceles"; 
                }
        else
        {
           if(lado1==lado3&&lado3!=lado2)
               {
                   return"Isoceles"; 
                } 
           else
           {
           if(lado2==lado3&&lado3!=lado1)
           {
               return"Isoceles";
           }
           else
           {
               return"Escaleno";          //En el else debido a que ninguna condición se cumple,se establece como escaleno.
           }
           }
        }
        
    }
    }
    
}
