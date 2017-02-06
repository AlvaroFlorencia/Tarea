
package execisesfirst;


public class Employee {
    private int id;
    private String firstName;                                //Se pone la instrucción get y set  para cada variable
                                                            //Se pone un constructor solamente
    private String lastName;
private int salary;  
public Employee(int id, int salary) {
        this.id = id;
       
        this.salary = salary;
    }
    public Employee(int id,String firstName,String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

public int getId()
        {
           return this.id; 
        }
public String  getFisrtName()
        {
           return this.firstName;
        }
public String  getLastName()
        {
           return this.lastName;
        }
public String  getName()
        {
           return (this.firstName+ " " + this.lastName); 
        }

    public String getFirstName() {
        return firstName;
    }

    public int getSalary() {
        return salary;
    }

public void SetSalry(int salary)
        {
           this.salary=salary;
        }
public double getAnnualSalary()
{
    return this.salary *12;               //Para sacar el Salario anual se multiplica salario por 12
}
public int raiseSalary(int percentage)
{
 this.salary=this.salary+((percentage/100)*this.salary);         //Para aumentar el salario se introduce el porcentaje 
                                                                  // y se suma el salario más salario por porcentaje entre 100
 return this.salary;
}
@Override
public String toString()
{
    return "Employee[id="+this.id+",name="+this.firstName+" "+this.lastName+",salary="+this.salary+"]"; //Se implementa un toString pata pasar los valores a String
}
}
