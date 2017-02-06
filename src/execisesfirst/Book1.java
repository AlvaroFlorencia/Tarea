
package execisesfirst;


public class Book1 {
    private String name;                    //Se incluye un autor de la clase autor para poder herdar sus datos
    private Author author;                  //Se pone la instrucción get y set  para cada variable
                                                          //Se ponen 2 constructores uno sin qty
    private double price;
    private int qty;

    public Book1(String name, Author autor, double price) {
        this.name = name;
        this.author = autor;
        this.price = price;
        this.qty=0;
    }

    public Book1(String name, Author autor, double price, int qty) {
        this.name = name;
        this.author = autor;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAutor() {
        return author;
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
    return "Book[name="+this.name+","+this.author.toString()+",price="+this.price+",qty="+this.qty+"]"; //Se implementa un toString pata pasar los valores a String
    }
    
    
    
}
