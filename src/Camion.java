public class Camion extends Vehicle{

    protected Remolc remolqui = null;
    
    public Camion(){

    }

    public Camion(String matricula, int velocitat){
        super(matricula,velocitat);
    }

    public void ponRemolque(Remolc remolqui){
        this.remolqui = remolqui;
    }

    public void quitarRemolque(){

    }

    public String toString(){
        return matricula + velocitat + remolqui;
    }
}

