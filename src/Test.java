import java.util.Scanner;

public class Test{
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Cuantas materias llevas?: ");
        int materias = Integer.parseInt(keyboard.nextLine());

        double clases[] = new double[materias];
        for(int i = 0; i < clases.length; i++){
            System.out.print("Ingresa tu materia " + (i+1) + ": ");            
            clases[i] = Double.parseDouble(keyboard.nextLine());
        }

        double acum = 0;
        for(double calif: clases){
            acum+= calif;
        }

        double promedio = 0;
        if (materias > 0){
            promedio = acum / materias;
        }

        System.out.println("Tu promedio es: " + promedio);

        keyboard.close();

    }

}