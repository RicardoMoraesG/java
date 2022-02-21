package notas.aluno;
import java.util.Scanner;
public class NOTASALUNO {
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Solicite ao usuário que informe as três Notas (de 0 a 10) de um aluno,
        e calcule a média e teste as condições;
        1) se a média for menor ou igual a 5.0(Reprovado)
        2) se a média for menor ou igual a 7.0(Aprovado)
        3) se a média for menor ou igual a 9.0 (Muito Bom)
        4) se a média for maior do que 9.0 (Excelente)
        */
        Scanner entrada = new Scanner (System.in);
        
        int nota1, nota2, nota3;
        System.out.println("Digite as três notas do aluno: ");
        nota1 = entrada.nextInt();
        nota2 = entrada.nextInt();
        nota3 = entrada.nextInt();
        float media = (nota1 + nota2 + nota3)/3;
        if (media <= 5){
            System.out.println("Reprovado");
        }
        else {
            if (media <= 7){
                System.out.println("Aprovado");
            }
            else{
                if (media <= 9){
                    System.out.println("Muito Bom");
                }
                else {
                    if (media > 9){
                        System.out.println("Excelente");
                    }
                }
            }
        }

    }
}
