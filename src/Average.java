import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Preguntar cuantas clases lleva el alumno
        System.out.print("Cuántas clases llevas?: ");
        int clases = Integer.parseInt(teclado.nextLine());

        if (clases < 1) {
            System.out.println("Error!");
            System.exit(0);
        }

        // instanciar arreglo
        double[] calificaciones = new double[clases];
        String[] materia = new String[clases];

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Captura el nombre de la materia: ");
            materia[i] = teclado.nextLine();
            System.out.print("Cual es tu calificacion de " + materia[i] + ": ");
            calificaciones[i] = teclado.nextDouble();
            teclado.nextLine();
        }

        double acum = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            acum += calificaciones[i];
            // acum = acum + calificaciones[i];
        }

        System.out.println("Tu promedio es: " + acum / calificaciones.length);

        teclado.close();

        peoresMaterias(acum / calificaciones.length, materia, calificaciones);

    }

    // Imprime en consola el nombre de las materias en donde obtuviste
    // una calificacion menor al promedio
    public static void peoresMaterias(double promedio, String[] materias, double[] calificaciones) {

        if (materias.length == calificaciones.length) {
            // recorrer todo el arreglo
            for (int i = 0; i < materias.length; i++) {
                // revisar si la calificacion fue menor que el promedio
                if (promedio > calificaciones[i]) {
                    System.out.println(materias[i]);
                }
            }
        }
    }

    // Regresa el indice de la calificacion mas alta obtenida. Si hay dos
    // calificaciones iguales, regresa la primera ocurrencia

    public static int bestGrade(double[] calificaciones) {

        //empty array!!
        if (calificaciones.length == 0){
            return -1;
        }

        //Begin by assuming the first position is the best grade
        int index = 0;
        double bestGrade = calificaciones[0];

        // iterate on array, if you find a new bestGrade reeplace existing grade
        for (int i = 1; i < calificaciones.length; i++){
            if (calificaciones[i] > bestGrade){
                bestGrade = calificaciones[i];
                index = i;
            }
        }
        
        return index;
    }

}