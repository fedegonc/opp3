package objetos3;

import java.util.Scanner;

public class clase3poo {

    public static void main(String[] args) {

        Persona tipo = new Persona();
        ContaBancaria cuenta = new ContaBancaria();

        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = new Scanner(System.in).next();

        System.out.println("Ingrese la edad de la persona: ");
        int edad = new Scanner(System.in).nextInt();
        
        System.out.println("Ingrese el saldo actual: ");
        float saldo = new Scanner(System.in).nextFloat();
        
        
        cuenta.setSaldoActual(saldo);
        
        System.out.println("Ingrese un valor a retirar: ");
        float retirar = new Scanner(System.in).nextFloat();
        
        System.out.println(cuenta.setRetirar(retirar));
            
        System.out.println("su saldo actual es" + cuenta.getSaldoActual());
        
        

        if (tipo.setNome(nombre)) {
            System.out.println("Nombre ok: " + tipo.getNome());

        } else {
            System.out.println("Nombre vacio");
        }
        
        System.out.println(" su edad es: " +  tipo.getIdade(edad));
        
      
        System.out.println(" el individuo es un: " + tipo.setIdade(edad));

    }

}
