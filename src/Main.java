
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  // Create Scanner object
        //Declaracion de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion =4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre="Matrix";
        String sinopsis = """
                la mejor pelicula de fin de Milenio
                """;
        double mediaEvaluacionUsuario=0;

        System.out.println(" Pelicula: "+ nombre);
        System.out.println("Fecha de lanzamiento: "+ fechaDeLanzamiento);
        System.out.println("Evaluacion: "+ evaluacion);
        System.out.println(" Incluido en el plan: "+ incluidoEnElPlanBasico);

        double mediaEvaluacion= (4.5+4.8+3)/3;
        System.out.println("Media de la evaluacion de Matrix: "+mediaEvaluacion);

        if (fechaDeLanzamiento >=2023){
            System.out.println("Pelicula popular en el momneto");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i=0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.printf("Ingresa la nota que le darias a Matrix\n");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println(" La media de la pelicula calculada por el usuario es: "+ mediaEvaluacionUsuario/3);
    }
}