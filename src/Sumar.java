import java.util.Scanner;
public class Suma{
    public class Sumar(double num1, double num2, double num3){
        double resultado;
        resultado = num1 + num2 + num3;
        return resultado;
    }


    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);
        double valor1, valor2, valor3, resultado;

        System.out.println("Introduce un Primer Valor");
        valor1 = teclado.nextDouble();
        System.out.println("Introduce un Segundo Valor");
        valor2 = teclado.nextDouble();
        System.out.println("Introduce un Tercer Valor");
        valor3 = teclado.nextDouble();

        resultado = sumar(valor1, valor2, valor3);

        System.out.print("El resultado es:" + resultado);
    }

}
