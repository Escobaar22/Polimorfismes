public class Camion extends Vehicle{

    protected Remolc remolqui;
    
    public Camion(){

    }

    public Camion(String matricula, int velocitat) throws DemasiadoRapidoException {
        super(matricula,velocitat);
    }

    public void ponRemolque(Remolc remolqui){
        this.remolqui = remolqui;
    }

    public void quitarRemolque(Remolc remolqui){
        this.remolqui = null;
    }

    public void accelerar(int velocitatAc) throws DemasiadoRapidoException{
        velocitat += velocitatAc;
        if(remolqui != null && velocitat <= 100){

        }
    }

    public String toString(){
        return matricula + velocitat + remolqui;
    }
}

