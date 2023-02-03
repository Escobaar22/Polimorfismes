/**
 * @author Poly Angel Escobar Sánchez
 */
public abstract class Vehicle {
    protected String matricula;
    protected int velocitat = 0;

    //Creamos los dos atributos comunes de todos los vehiculos, la matricula y la velocidad

    public Vehicle(){

    }

    public Vehicle(String matricula, int velocitat){
        this.matricula = matricula;
        this.velocitat = velocitat;

    } //Pedimos que sean introducidos por parametros tanto matricula como velocidad

    public void accelerar(int velocitatAc) throws DemasiadoRapidoException{
        this.velocitat += velocitatAc;
    } //Creamos el metodo 'accelerar' el cual sumara la cantidad dada por parametro de este a la velocidad que ya se haya introducido

    public String toString(){
        return "El vehiculo con matricula "+matricula+ " va a "+velocitat+" km/h";
    } //Creamos el motodo toString que nos devolvera la matricula y la velocidad de cualquier vehiculo, ya sea camion o coche

}
