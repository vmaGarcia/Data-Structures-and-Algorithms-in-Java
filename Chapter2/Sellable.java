/** Interfaces para objetos que se pueden vender*/
public interface Sellable{

    /**Desvuerve la descripcion del objeto */
    public String description();

    /**Devuelve el precio del objeto */
    public int listPrice();

    /**Devuelve el precio más bajo en centavos que aceptaremos */
    public int lowestPrice();
}