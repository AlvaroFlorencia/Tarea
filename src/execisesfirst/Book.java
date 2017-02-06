
package execisesfirst;


public class Book {
    private String name;
    private Author[] authors;     //Se incluye un autor de la clase con arreglo autor para poder herdar sus datos
                                  //Se pone la instrucción get y set  para cada variable
                                  //Se ponen 2 constructores uno sin qty
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty=0;
        
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
@Override
    public String toString() {
          String autores="";
        for(int i=0;this.authors.length<i;i++)
        {
            autores+=authors[i].toString();
        }
          return "Book[name="+this.name+",authors="+autores+",price="+this.price+",qty="+this.qty+"]";//Se implementa un toString pata pasar los valores a String
    }
    
    
    public String getAuthorNames()
    {
       String autores="";
       for(int i=0;this.authors.length<i;i++) //Se utiliza un for para poder ir almacenando los nobres de los autores.
       {
           autores+=authors[i].getName()+",";
           
       }
       return "Names of authors " +autores;
    }
    
    
}

