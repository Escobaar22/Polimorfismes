public class Camion extends Vehicle{

    protected Remolc remolqui;
    
    public Camion(){

    }

    public Camion(String matricula, int velocitat){
        super(matricula,velocitat);
        this.remolqui = null;
    }

    public void ponRemolque(Remolc remolqui){
        this.remolqui = remolqui;
    }

    public void quitarRemolque(Remolc remolqui){
        this.remolqui = null;
    }

    public void accelerar(int velocitatAc) throws DemasiadoRapidoException{
        if(remolqui != null && velocitat+velocitatAc >= 100){
            throw new DemasiadoRapidoException();
        }
        super.accelerar(velocitatAc);
        }

    public String toString(){
        if(remolqui != null){
            return super.toString() + " y lleva un remolque que " + remolqui.toString();
        }else{
            return super.toString();
        }
    }
}

