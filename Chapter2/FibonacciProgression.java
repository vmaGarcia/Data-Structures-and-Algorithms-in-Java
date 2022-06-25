public class FibonacciProgression extends Progression{

    protected long prev;

    /** Contructor tradicional de fibonachi 0,1,1,2,3, ... */
    public FibonacciProgression(){this(0,1); }

    /**Constructor genrado con el primer y segundo valor */
    public FibonacciProgression(long first, long second){
        super(first);
        prev = second - first;
    }

    /**Remplace el prev, current con current, current + prev  */
    protected void advance(){
        long temp = prev;
        prev = current;
        current +=temp;
    }
}