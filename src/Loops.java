import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota=0;
        double mediaDeEvaluaciones=0;
        int contador=0;

        while (contador < 3) {
            System.out.println("Escribe la nota que le darías a la película Matrix: ");
            nota = teclado.nextDouble();
            mediaDeEvaluaciones += nota;
            contador++;
        }

        System.out.println("La media de evaluaciones para Matrix es " + (mediaDeEvaluaciones / 3));
    }
}
