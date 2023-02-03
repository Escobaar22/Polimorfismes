/**
 * @author Poly Angel Escobar Sánchez
 */
public class Main {
    public static void main(String[] args) {
        Vehicle [] v =new Vehicle[4]; //Creamos un array con cuatro posiciones que contendra los dos tipos de vehiculos
        v[0] = new Coche("5508XLM", 80, 5);
        v[1] = new Coche("4361DDF", 55, 4);
        v[2] = new Camion("2356QWE", 65);
        v[3] = new Camion("9106FCV", 45);

        //Añadidos los cuatro vehiculos que componen el array procedemos a crear los for

        for(Vehicle vehicle : v){
            if(vehicle instanceof Camion camion){
                camion.ponRemolque(new Remolc(5000));
            }
        }

        /*
        En este for tendremos en cuenta los vehiculos del array que sean de la clase camion. En este primer for lo que haremos sera
        añadir .poRemolque para añadir un remolque a los camiones del array, este remolque tendra un peso de 5000Kg
         */

        for(Vehicle vehicle : v){
            try{
                vehicle.accelerar(50);
                System.out.println(vehicle);
            }catch(DemasiadoRapidoException dre){
                System.out.println("El vehiculo va demasiado rápido");
            }
        }

        /*
        En este segundo for tendremos en cuenta el array completo y lo que haremos sera acelerar los vehiculos en una velocidad
        x. Creamos un try-catch ya que tendremos que tener en cuenta la excepcion de los camiones con remolque.
        En caso de que haya camiones que cumplan la excepcion DemasiadoRapidoException (tener remolque y superar los 100 km/h)
        se mostrara un mensaje que nos dira que el vehiculo va demasiado rápido.

        En ningun momento se nos dira exactamente si el vehiculo es un coche o un camion, solo se nos dara la información de la matricula y la velocidad.
        En caso de tener remolque también se nos mostrara el peso de este.
         */

    }

}