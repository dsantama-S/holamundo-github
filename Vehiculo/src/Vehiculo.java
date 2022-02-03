class Vehiculo {
    int pasajeros;  //números de pasajeros
    int capacidad;  //capacidad del combustible en galones
    int mpg;        //combustible consumido en millas por galon

    //Mostrando el rango
    void rango (){
        System.out.println("Con rango de "+ capacidad*mpg);
    }
}

class MetodoAdicional {

    public static void main(String[] args) {
        Vehiculo minivan = new Vehiculo();
        Vehiculo sportscar = new Vehiculo();


        //Asigando valores a los campos en minivan
        minivan.pasajeros=9;
        minivan.capacidad=15;
        minivan.mpg=20;

        //Asigando valores a los campos en minivan
        sportscar.pasajeros=10;
        sportscar.capacidad=25;
        sportscar.mpg=30;

        System.out.print("La Minivan puede llevar " +minivan.pasajeros +". ");
        minivan.rango();

        System.out.print("El Sportscar puede llevar " +minivan.pasajeros +". ");
        sportscar.rango();
    }
}
