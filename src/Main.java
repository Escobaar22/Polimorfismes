public class Main {
    public static void main(String[] args) {
        Vehicle [] v =new Vehicle[4];
        v[0] = new Coche("5508XLM", 80, 5);
        v[1] = new Coche("4361DDF", 55, 4);
        v[2] = new Camion("2356QWE", 65);
        v[3] = new Camion("9106FCV", 45);

        for(Vehicle vehicle : v){
            if(vehicle instanceof Camion camion){
                camion.ponRemolque(new Remolc(5000));
            }
        }
        for(Vehicle vehicle : v){
            try{
                vehicle.accelerar(50);
                System.out.println(vehicle);
            }catch(DemasiadoRapidoException dre){
                System.out.println("El vehiculo va demasiado rápido");
            }
        }

    }

}