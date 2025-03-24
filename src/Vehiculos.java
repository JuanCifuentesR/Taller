import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehiculos {
    protected String Marca;
    protected String Modelo;
    protected String Anio;
    protected int PrecioDia;
    protected boolean Disponobilidad;

    List<Vehiculos> LsVehiculos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);



    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo, String anio, int precioDia, boolean disponobilidad) {
        Marca = marca;
        Modelo = modelo;
        Anio = anio;
        PrecioDia = precioDia;
        Disponobilidad = disponobilidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String anio) {
        Anio = anio;
    }

    public int getPrecioDia() {
        return PrecioDia;
    }

    public void setPrecioDia(int precioDia) {
        PrecioDia = precioDia;
    }

    public boolean isDisponobilidad() {
        return Disponobilidad;
    }

    public void setDisponobilidad(boolean disponobilidad) {
        Disponobilidad = disponobilidad;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Anio='" + Anio + '\'' +
                ", PrecioDia=" + PrecioDia +
                ", Disponobilidad=" + Disponobilidad +
                '}';
    }

    public void RegistrarVehiculos(){
        boolean ok=true;

        do {
            System.out.println("el vehiculo es auto(1) o camioneta(2) ");
            int pregunta = scanner.nextInt();


            switch (pregunta) {
                case 1 -> {
                    Automovil automovil = new Automovil();

                    System.out.println("ingrese la marca del vehiculo");
                    automovil.setMarca(scanner.next());
                    System.out.println("ingrese el modelo del vehiculo");
                    automovil.setModelo(scanner.next());
                    System.out.println("ingrese el año");
                    automovil.setAnio(scanner.next());
                    System.out.println("ingrese el precio por dia arrendado");
                    automovil.setPrecioDia(scanner.nextInt());
                    System.out.println("ingrese el numero de puertas del automovil");
                    automovil.setNumPuertas(scanner.nextInt());
                    System.out.println("ingrese disponibilidad (si/no)");
                    String disponibilidad = scanner.next();

                    if (disponibilidad.equals("si")) {
                        automovil.setDisponobilidad(true);
                    } else if (disponibilidad.equals("no")) {
                        automovil.setDisponobilidad(false);
                    } else System.out.println("ingrese si o no");

                    LsVehiculos.add(automovil);

                    System.out.println("Automovil registrado con exito");

                }
                case 2 -> {
                    Camioneta camioneta = new Camioneta();

                    System.out.println("ingrese la marca del vehiculo");
                    camioneta.setMarca(scanner.next());
                    System.out.println("ingrese el modelo del vehiculo");
                    camioneta.setModelo(scanner.next());
                    System.out.println("ingrese el año");
                    camioneta.setAnio(scanner.next());
                    System.out.println("ingrese el precio por dia arrendado");
                    camioneta.setPrecioDia(scanner.nextInt());
                    System.out.println("ingrese la capacidad de carga de la camioneta");
                    camioneta.setCapacidadCarga(scanner.nextInt());
                    System.out.println("ingrese disponibilidad (si/no)");
                    String disponibilidad = scanner.next();

                    if (disponibilidad.equals("si")) {
                        camioneta.setDisponobilidad(true);
                    } else if (disponibilidad.equals("no")) {
                        camioneta.setDisponobilidad(false);
                    } else System.out.println("ingrese si o no");

                    LsVehiculos.add(camioneta);

                    System.out.println("camioneta registrado con exito");

                }
                default -> {

                    System.out.println("ingrese 1 para automovil o 2 para camioneta");
                    continue;
                }
            }
            System.out.println("¿Desea agregar otro vehículo? (si/no)");
            String respuesta = scanner.next();
            if (!respuesta.equals("si")) {
                ok = false;
            }
        } while (ok);

    }

    public void buscarCarro (String modelocarro){

        for (Vehiculos vehiculos : LsVehiculos){
            if (vehiculos.getModelo().equals(modelocarro)){
                if (vehiculos.isDisponobilidad()){
                    System.out.println("el vehiculo ya esta disponible");
                }else {
                    vehiculos.setDisponobilidad(true);
                    System.out.println("vehiculo devuelto correctamente");
                }






            }

        }

    }

    public void mostrarVehiculos (){
        boolean disponibles = false;

        for (Vehiculos vehiculo : LsVehiculos) {
            if (vehiculo.isDisponobilidad()) {
                System.out.println(vehiculo);
                disponibles = true;
            }
        }

        if (disponibles==false) {
            System.out.println("No hay vehículos disponibles en este momento.");
        }

    }


}
