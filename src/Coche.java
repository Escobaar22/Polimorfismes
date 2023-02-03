/**
 * @author Poly Angel Escobar Sánchez
 */
public class Coche extends Vehicle{
    protected int numeroPuertas;

    //Creamos la subclase coche y le añadimos el atributo numeroPuertas
    public Coche(){

    }

    public Coche(String matricula, int velocitat, int numeroPuertas){
        super(matricula, velocitat);
        this.numeroPuertas = numeroPuertas;
    } //Llamamos a matricula y velocidad de la clase vehiculo mediante el super() y añadimos que el atributo numeroPuertas sea introducido por parametros

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    //Creamos un getter para NumeroPuertas

}
