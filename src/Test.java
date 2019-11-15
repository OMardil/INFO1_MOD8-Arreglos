import java.util.Scanner;

public class Test{
    public static void main(String[] args){

        int a[] = {1,5,7};
        System.out.println("Before:");
        for(int i1: a){
            System.out.println(i1);
        }

        doSomething(a);

        System.out.println("After:");
        for(int i1: a){
            System.out.println(i1);
        }        

    }

    public static void doSomething(int[] arr1){
        for(int i = 0; i<arr1.length; i++){
            arr1[i]++;
        }
    }

}