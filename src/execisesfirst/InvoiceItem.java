
package execisesfirst;


public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {    //Se pone la instrucción get y set  para cada variable
                                                                               //Se pone un constructor solamente
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
   public String getId()
   {
       return this.id;
   }
   public String getDesc()
   {
   return this.desc;
   }
   public void setQty(int qty)
   {
       this.qty=qty;
   }
   public double getUniprice()
   {
       return this.unitPrice;
       
   }

   public void setUniprice(double unitPrice)
   {
       this.unitPrice=unitPrice;
   }
   public double getTotal()
   {
       return (this.unitPrice * this.qty);  //Para sacar el total se multiplica unit price por qty
       
   }
   @Override
   public String toString()
           
   {
      return "InvoiceItem[id="+this.id+",desc="+this.desc+",qty="+this.qty+",unitPrice="+this.unitPrice+"]";   //Se implementa un toString pata pasar los valores a String
   }
}
