public class Main {
    public static void main(String[] args) {
        /*Uso de IF*/
        int numeroIf = 0;
        System.out.println("Condicional IF");
        if (numeroIf > 0){
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es cero");
        }

        /*Uso de WHILE y DOWHILE*/
        int numeroWhile = 0;
        System.out.println("Bucle While");
        while (numeroWhile < 3){
            numeroWhile += 1;
            System.out.println(numeroWhile);
        }

        System.out.println("Bucle DoWhile");
        do {
            numeroWhile += 1;
            System.out.println(numeroWhile);
        }while (numeroWhile < 3);

        /*Bucle FOR*/
        int numeroFor;
        System.out.println("Bucle For");
        for (numeroFor = 0; numeroFor <= 3; numeroFor += 1){
            System.out.println(numeroFor);
        }

        /*Uso de SWITCH CASE*/
        var estacion = "primavera";
        System.out.println("Uso de Switch Case");
        switch (estacion){
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Ingresa el nombre de una estacion del año valida");
        }

    }
}