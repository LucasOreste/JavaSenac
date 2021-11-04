
package calculodemedia;

import java.util.Scanner;


public class CalculodeMedia {

    
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     String aluno;
     
     double n1,n2,n3,media;
 
        
     System.out.println("Digite seu nome: ");
        aluno=entrada.nextLine();
     System.out.println("Digite a primeira nota: ");
        n1=entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2=entrada.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3=entrada.nextDouble();
        
        media = (n1+n2+n3)/3;
        
        System.out.println(aluno + ", Sua média foi: "+ media);
     
     
    }
    
}
