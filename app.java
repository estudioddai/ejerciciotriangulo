package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner lector = new Scanner (System.in);

        double a, b, c;

        System.out.println("Ingrese el primer lado del triangulo");

        a= lector.nextDouble();

        System.out.println("Ingrese el segundo lado del triangulo");

        b= lector.nextDouble();

        System.out.println("Ingrese el tercer lado del triangulo");

        c= lector.nextDouble();

if (a==b && a==c && b==c){
    System.out.println("el triangulo es equilatero");
}        
else if (a==b || a==c || b==c){
    System.out.println("el triangosulo es isosceles");

}
else {
    System.out.println("el triangulo es escaleno");
}




    }
}