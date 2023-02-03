/**
 * @author Poly Angel Escobar Sánchez
 */
public class Remolc {
    protected int pes;

    //Creamos el atributo pes para Remolc
    public Remolc(){

    }

    public Remolc(int pes){
        this.pes = pes;
    }

    //Indicamos que dicho peso tendra que ser introducido por parametro

    public String toString(){
        return "pesa "+pes+" kg";
    }
    //Creamos el metodo toString del peso para poder visualizarlo y poder llamarlo junto a camión
}
