import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean play = true;

        Scanner scanner = new Scanner(System.in);
        Vehiculos vehiculos = new Vehiculos();
        Clientes clientes = new Clientes();


        do {


            System.out.println("""
                    
                    bienvenido a nuestro alquiler de vehiculos
                        que decea hacer el dia de hoy
                    
                        1. Registrar vehiculo
                        2. Mostrar lista de vehiculos
                        3. Registrar cliente
                        4. Mostrar lista de clientes 
                        5. Registrar devolucion de Vehiculo
                        6. Salir
                        
                    """);
            int caso = scanner.nextInt();

            switch (caso) {
                case 1 -> {
                    vehiculos.RegistrarVehiculos();
                }
                case 2 -> {
                    vehiculos.mostrarVehiculos();
                }
                case 3 -> {
                    clientes.RegistrarClientes(vehiculos);
                }

                case 4 -> {
                    clientes.mostrarCLientes();
                }
                case 5 -> {
                    clientes.eliminarCliente(vehiculos);
                }
                case  6 ->{

                    play=false;
                }
                default -> System.out.println("opcion invalida");

            }
        }while (play);

    }
}