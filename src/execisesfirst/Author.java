
package execisesfirst;


public class Author {
    
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {   //Se pone la instrucción get y set  para cada variable
                                                          //Se pone un constructor solamente.
        
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
             return "Author[name="+this.name+",email="+",gender="+this.gender+"]"; //Se implementa un toString pata pasar los valores a String
    }
    
    
}
