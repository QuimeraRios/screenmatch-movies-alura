import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota=0;
        double mediaDeEvaluaciones=0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darias a la pelicula Matrix? ");
            nota = teclado.nextDouble();
            mediaDeEvaluaciones = mediaDeEvaluaciones + nota;
        }
        System.out.println("la media de evaluaciones para Matrix es "+ mediaDeEvaluaciones/3);
    }
}
