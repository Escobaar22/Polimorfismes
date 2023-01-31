public class Coche extends Vehicle{
    protected int numeroPuertas;

    public Coche(){

    }

    public Coche(String matricula, int velocitat, int numeroPuertas){
        super(matricula, velocitat);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

}
