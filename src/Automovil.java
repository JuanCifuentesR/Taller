public class Automovil extends Vehiculos{
    protected int NumPuertas;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, String anio, int precioDia, boolean disponobilidad, int numPuertas) {
        super(marca, modelo, anio, precioDia, disponobilidad);
        NumPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return NumPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        NumPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + "Automovil{" +
                "NumPuertas=" + NumPuertas +
                '}';
    }


}
