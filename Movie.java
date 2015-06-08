package productcatalogdemo;

/**
 * @author emilychen
 */

public class Movie extends Product{
    
    private int Runlength;

    public Movie(String name, double price, int Runlength) {
        super(name, price);
        this.Runlength= Runlength;
        
    }


    public int getRunlength() {
        return Runlength;
    }

    public void setRunlength(int Runlength) {
        this.Runlength = Runlength;
    }
    
     @Override
    public String getType() {
        return "Movie";
    }
    
    
}
