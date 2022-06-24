public class PredatoryCreditCard extends CreditCard{
    //Agregagar variable de instancia 
    private double apr;

    //Constructor de esta clase
    public PredatoryCreditCard(String cust, String bk, String acnt, int lim,
                                double initialBal,double rate){
        super(cust,bk,acnt,lim,initialBal);
            apr = rate;
    }

    //Un nuevo metodo para asignar interese mensuales
    public void processMonth(){
        if(balance >0){ // only charge interest on a positive balance
            double monthlyFactor = Math.pow(1+apr,1.0/12); // compute monthly rate
            balance *=monthlyFactor;                        // assess interest
        }
    }

    //Sobreescribir el metodo definido en la supe clase
    public boolean charge(double price){
        boolean isSuccess = super.charge(price);
        if(!isSuccess)
            balance +=5;
        return isSuccess;
    }   
}