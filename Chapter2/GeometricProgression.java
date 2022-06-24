public class GeometricProgression{

    protected long base;

    /**Constructor progresivo 1,2,4,8,18,... */
    public GeometricProgression(){this(2,1); }

    /**Contructor de profrseion 1,b,b^2,b^3 */
    public GeometricProgression(long b){this(b,1); }

    /**Contructor geometrico con progesion arbitrario y base */
    public GeometricProgression(long b, long start){
        super(start);
        base = b;
    }

    /**Multiples los valores por la base geometrica */
    protected void advance(){
        current *=base;
    }
}