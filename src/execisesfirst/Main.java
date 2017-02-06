
package execisesfirst;


public class Main {
    public static void main(String[] args) {
        
        
        
        
        
        
     //Circle1
    Circle1 circulod = new Circle1(2.0,"verde");
  System.out.println("El circulo de color es "+ circulod.getColor()+ "y su área es "+ circulod.getArea());
     //Circle
  Circle circulod2 = new Circle(3.0);
   System.out.println("El área del circulo es "+ circulod2.getArea()+"y  su Circuferencia es: "+circulod2.getCircumference());
   //Rectangle 
   Rectangle rectanguloco = new Rectangle(5.0f,3.0f);
   System.out.println("El área del rectangulo es "+ rectanguloco.getArea()+" y  su perimetro es: "+rectanguloco.getPerimeter());
  //Employee
   Employee Salario = new Employee(555,"Alvaro","Florencia",100);
   System.out.println("El área del rectangulo es "+ Salario.raiseSalary(20));
              System.out.println("Su ID es:"+ Salario.getId());
              System.out.println("Su nombre es:"+ Salario.getName());
                 
  //InvoiceItem
       InvoiceItem factura= new InvoiceItem("535","123",20,30.0);
     System.out.println("El total es: "+ factura.getTotal());  
     //Account
      Account cuenta= new Account("535","Alvaro",2500);
     System.out.println("Se tranfieren $500 y el nuevo balance de tu cuenta es: "+ cuenta.credit(500));
     System.out.println("Se desea retirar 2500 y el nuevo balance de tu cuenta es: "+ cuenta.debit(2500));
//Time
     
  Time b = new Time (1,0,0);
        
        b.PreviusSecond();
        System.out.println(b.toString());
        
           
   //Triangulo
        MyTriangle Trianguloc = new MyTriangle(4,4, 6,6,5,5);
          
    System.out.println("El perimetro del tringulo es :"+ Trianguloc.getPerimeter()+ "y su tipo es: "+ Trianguloc.getType());
    //MyRectangle
    MyRectangle mirec= new MyRectangle(8,8,5,5);
    System.out.println("El perimetro del rectangulo es :"+ mirec.getPerimeter()+ " y su area es: "+ mirec.getArea());
    
    }
    
}
    

