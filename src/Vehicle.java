public class Vehicle {
    protected String matricula;
    protected int velocitat = 0;

    public Vehicle(){

    }

    public Vehicle(String matricula, int velocitat) throws DemasiadoRapidoException {
        this.matricula = matricula;
        accelerar(velocitat);

    }

    public void accelerar(int velocitatAc) throws DemasiadoRapidoException{
        velocitat += velocitatAc;
    }

    public String toString(){
        return "La matricula es "+matricula+ " y la velocidad "+velocitat+" km/h";
    }
}
