public class Vehicle {
    protected String matricula;
    protected int velocitat = 0;

    public Vehicle(){

    }

    public Vehicle(String matricula, int velocitat){
        this.matricula = matricula;
        this.velocitat = velocitat;
    }

    public void accelerar(int velocitatAc) throws DemasiadoRapidoException{
        this.velocitat += velocitatAc;
    }

    public String toString(){
        return "El vehiculo con matricula "+matricula+ " va a "+velocitat+" km/h";
    }
}
