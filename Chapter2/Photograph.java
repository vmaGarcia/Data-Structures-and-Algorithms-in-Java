/**Class para las fotografias para vender */
public class Photograph implements Sellable{
    private String descript;
    private int price;
    private boolean color;

    public Photograph(String desc, int p, boolean c){
        descript = desc;
        price = p;
        color = c;
    }

    public String description(){ return descript }
    public int listPrice() {return price; }
    public int lowestprice(){ return price/2; }
    public boolean isColor() { return color; }
}