public class Door{
    private String close;
    private String open;

    public void setClose(String c){
        close = c;
    }

    public String getClose(){
        return close;
    }

    public void setOpen(String o){
        open = o;
    }

    public String getOpen(){
        return open;
    }

    public void isClosed(){
        System.out.println("PUERTA CERRADA");
    }

    public void isOpen(){
        System.out.println("PUESTA ABIERTA");
    }
    public void open(){
        System.out.println("ABIERTA");
    }
    public void isLocked(){
        System.out.println("Desbloqueada");
    }
    public void unlock(){
        System.out.println("Desbloqueada");
    }

    public void advance(){
        System.out.println("Avanza");
    }
}