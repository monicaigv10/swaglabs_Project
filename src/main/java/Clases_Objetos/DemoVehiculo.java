package Clases_Objetos;

public class DemoVehiculo {
    public static void main(String[] args) {
        Vehiculo minivan = new Vehiculo();

        int rango;

        minivan.pasajeros = 9;
        minivan.capacidad = 15;
        minivan.kmh =20;

        //calcularr el rango asumiendo un tanque lleno
        /*
        calcular el rango asumiendo un tanque lleno
         */
        rango = minivan.capacidad * minivan.kmh;

        System.out.println("la minivan puede llevar" + minivan.pasajeros + "pasajeros con un rango de " + rango + "kilometros");

        Vehiculo carro = new Vehiculo();
        carro.pasajeros = 5;
        System.out.println("Numero en pasajeros en carro es: " + carro.pasajeros);


    }

}
