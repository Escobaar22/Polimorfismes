public class Vehicle {
    protected String matricula;
    protected int velocitat = 0;

    public Vehicle(){

    }

    public Vehicle(String matricula, int velocitat){
        this.matricula = matricula;
        accelerar(velocitat);

    }

    public void accelerar(int velocitatAc){
        velocitat += velocitatAc;
    }

    public String toString(){
        return "La matricula es "+matricula+ " y la velocidad "+velocitat+" km/h";
    }
}
