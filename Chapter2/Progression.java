/**  Generates a simple progression. By default: 0, 1, 2, ... */
public class Progression{

    //Variable de instancia
    protected long current;

    /**Inicial constructor en cero */
    public Progression(){this(0); }

    /**Constructor de progresion con en valor de inicio */
    public Progression(long start){current = start; }

    /**retornar el siguiente valor de progresion */
    public long nextValue(){
        long answer = current;
        advanced();
        return answer;
    }


    protected void advanced(){
        current++;
    }

    /** Prints the next n values of the progression, separated by spaces. */
    public void printProgression(int n){
        System.out.print(nextValue());
        for(int j=1; j<n; j++)
            System.out.print(" " + nextValue() );
        System.out.println();
    }
}