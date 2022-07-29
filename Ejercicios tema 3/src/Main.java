public class Main {
    public static void main(String[] args) {
        //Primera parte del ejercicio 3
        int valor1 = 90;
        int valor2 = 10;
        int valor3 = 90;

        var resultado = sumar(valor1, valor2, valor3);

        System.out.println(resultado);

        //Segunda parte del ejercicio 3
        coche miCoche = new coche();

        miCoche.agregarPuerta();

        System.out.println(miCoche.puertas);

    }

     public static int sumar(int a, int b, int c){
        return a + b + c;
    }
}

class coche {
    public int puertas = 3;

    public void agregarPuerta(){
        this.puertas++;
    }
}