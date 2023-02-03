/**
 * @author Poly Angel Escobar Sánchez
 */
public class Camion extends Vehicle{

    protected Remolc remolqui;

    //Un camion puede llevar un remolque porque creamos el atributo remolqui de tipo Remolc
    public Camion(){

    }

    public Camion(String matricula, int velocitat){
        super(matricula,velocitat);
        this.remolqui = null;
    } //Llamamos a matricula y velocidad mediante el super() y añadimos el parametro remolqui iniciado en null de forma que no lleve remolque de inicio

    public void ponRemolque(Remolc remolqui){
        this.remolqui = remolqui;
    } //Creamos el metodo ponRemolque para añadir remolque a los camiones

    public void quitarRemolque(Remolc remolqui){
        this.remolqui = null;
    } //Creamos quitarRemolque en caso de no querer remolque en el camion

    public void accelerar(int velocitatAc) throws DemasiadoRapidoException{
        if(remolqui != null && velocitat+velocitatAc >= 100){
            throw new DemasiadoRapidoException();
        }
        super.accelerar(velocitatAc);
        }
        /*
        Creamos el metodo accelerar con la excepcion DemasiadoRapidoException ya que en caso de que el camión lleve remolque y la suma de velocidad + velocidad de aceleración supere los 100 km/h salte un aviso.
        Sobreescribimos el metodo acelerar para que en caso de no superar esos 100 km/h con remolque o no llevar remolque se muestre la velocidad total (normal + aceleracion)
         */

    public String toString(){
        if(remolqui != null){
            return super.toString() + " y lleva un remolque que " + remolqui.toString();
        }else{
            return super.toString();
        }
    } /*
    Creamos el metodo toString de camion, en este tendremos en cuenta si el camión lleva remolque. En caso de llevar remolque se mostrara también el peso de este junto a la matricula y la velocidad.
    Utilizamos el metodo super.toString() para llamar al metodo toString creado en la superclase Vehicle (matricula y velocidad), también llamaremos al toString de remolqui para indicar el peso del remolque.
    En caso de que el camión no lleve remolque solo se nos mostrara el metodo toString de la superclase Vehicle (matricula y velocidad)
    */
}

