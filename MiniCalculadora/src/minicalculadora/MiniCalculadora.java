
package minicalculadora;

import java.util.Scanner;

public class MiniCalculadora {

    
    public static void main(String[] args) {
        //declarando as variaveis
        double n1,n2;
        double soma,sub,multi,divi;
        //Biblioteca que irá permitir a interação do usuário
        Scanner entrada=new Scanner(System.in);
        //Solicitar ao usuário os dois números
        System.out.println("--Mini Calculadora--");
        System.out.println("Digite um número: ");
        n1=entrada.nextDouble();
        System.out.println("Digite outro número: ");
        n2=entrada.nextDouble();
        
        //especificar o que cada variavel faz
        soma = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        divi = n1 / n2;
        // imprimir (mostrar) na tela os resultados
        System.out.println("A soma dos números "+ n1 + " e " + n2 + " é " +soma);
        System.out.println("A Subtração dos números "+ n1 +" e "+ n2 + " é "+sub);
        System.out.println("A Multiplicação dos números "+ n1 +" e "+ n2 + " é "+multi);
        System.out.println("A Divisão dos números "+ n1 +" e "+ n2 + " é "+divi);
        
        
    }
    
}
