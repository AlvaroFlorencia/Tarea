
package execisesfirst;


public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {                 //Se pone la instrucción get y set  para cada variable
                                 //Se pone un constructur y un incializador
        this(id,name,0);
        
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId()
    {
       return this.id;
    }
     public String getName()
    {
        return this.name;
    }
      public int getBalance()
    {
        return this.balance;
    }
      public int credit(int amount)
      {
          this.balance+=amount;
          return this.balance;     //Para aumentar en credito se introduce amount y se le suma a balance
      }
      public int debit(int amount) //Para disminuir en debito se introduce amount y se le resta a balance
      {
          if(amount<= this.balance)
          {
              this.balance-=amount; //Se pone un if debido a que si la amount es menor que balance
                                    // se puede ejecutat  y se le ressta a balance el amount 
          }                         //y  si no es asi  no se puede ejecutar y manda un mensaje de error 
          else
          {
              System.out.println("Amount exceeded balance");
          }
          return balance;
      }
      public int transferTo(Account another,int amount)      
      {                                                         //Para transferir a otra cuenta se introduce otra cuenta del 
           if(amount<= this.balance)                            //tipo cuenta y amount 
          {
              another.credit(amount);                           //Se veirifica con if si amount es menor que blance para que se pueda
              balance-=amount;                                  //ejecutar y si es asi se lesta a balance elamount , si no se manda un mensaje de error            
          }
          else
          {
              System.out.println("Amount exceeded balance");
          }
          return balance;
          
      }
      @Override
   public String toString()
   {
       return "Account[id="+this.id+",name="+this.name+",balance="+this.balance+"]"; //Se implementa un toString pata pasar los valores a String
}

   
    }

