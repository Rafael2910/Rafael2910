import java.util.Scanner;
public class sistema_escolar3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media, soma, soma_m;
        soma=0;
        media = 0;
        System.out.print("Digite o numero de alunos que voce deseja registrar: ");
        int alunos = sc.nextInt()+1;
        System.out.print("Digite o numero de notas a serem registradas: ");
        int notas = sc.nextInt()+1;
        float ALunos[][] = new float[alunos][notas];
        for (int l = 1; l<alunos;l++) {
            for (int c = 1; c < notas; c++) {
                System.out.printf("Aluno " + l + " Nota " + c + ": ");
                ALunos[l][c] = sc.nextFloat();
                while (ALunos[l][c] <1 || ALunos[l][c]>10){
                    System.out.println("Nota invalida!");
                    System.out.printf("Digite novamente \tAluno " + l + " Nota " + c + ": ");
                    ALunos[l][c] = sc.nextFloat();
                }

                soma = soma + ALunos[l][c];
            }
            System.out.println();
            media = soma / (notas - 1);
            System.out.println("Media aluno" + l + " " + media);
            soma = 0;
            System.out.println();
        }
        for (int l = 1; l < notas; l++) {
            System.out.print("Aluno" + l);
            for (int c = 1; c < notas; c++) {
                System.out.print(" " + ALunos[l][c] + "\t");

            }
            System.out.println();
        }
    }
}