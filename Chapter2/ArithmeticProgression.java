public class ArithmeticProgression extends Progression{

    protected long increment;

    /**Contructor de progression 0,1,2. */
    public ArithmeticProgression(){this(1,0);}

    /**Contructor de progresion 0, paso de tamano */
    public ArithmeticProgression(long stepsize){this(stepsize,0);}

    /**Constructos aritmetico progresivo con arbitrario de inicio y incrementado */
    public ArithmeticProgression(long stepsize, long start){
        super(start);
        increment = stepsize;
    }

    /**Anadir los incrementos aritmeticos con el valor */
    protected void advance(){
        current += increment;
        //current = increment;
    }
}