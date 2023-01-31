public class Vehicle {
    protected String matricula;
    protected int velocitat = 0;

    public Vehicle(){

    }

    public Vehicle(String matricula, int velocitat){
        this.matricula = matricula;
        accelerar(velocitat);

    }

    public int accelerar(int velocitatAc){
        velocitat += velocitatAc;
        return velocitat;
    }

    public String toString(){
        return matricula + velocitat;
    }
}
