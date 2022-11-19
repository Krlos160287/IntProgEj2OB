public class Main {
    public static void main(String[] args) {

        //Ejercicio IF
        int numero = -30;
        var numeroIf = "";

        if(numero > 0){
           numeroIf = "positivo";
        } else if (numero < 0) {
            numeroIf="negativo";
        } else {
           numeroIf = "0";
        }
        System.out.println(numeroIf);

        //Ejercicio While

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile = numeroWhile +1;
            System.out.println(numeroWhile);
        }
        ;

        // Ejericicio DoWhile
        int numerodoWhile = 2;
        do {
            numerodoWhile = numerodoWhile +1;
            System.out.println(numerodoWhile);
        }while (
                (numerodoWhile < 3)
        );

        //Ejercicio For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Ejercicio switch

        var estacion = "Otoño";

        switch (estacion) {
            case("Primavera"):
                System.out.println("Estamos en primavera");
                break;
            case("Verano"):
                System.out.println("Estamos en verano");
                break;
            case("Otoño"):
                System.out.println("Estamos en otoño");
                break;
            case("Invierno"):
                System.out.println("Estamos en invierno");
                break;
            default: System.out.println("Ingresa bien la estación, primera letra en mayúsculas y el resto en minúsculas");
        }
    }
}