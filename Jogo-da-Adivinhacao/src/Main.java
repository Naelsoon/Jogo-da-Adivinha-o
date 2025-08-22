import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa = 0;
        int chute = 0;
        System.out.println("========================================");
        System.out.println("|  Bem vindo ao jogo de adivinhação    |");
        System.out.println("| Tente adivinhar um numero de 0 a 100 |");
        System.out.println("========================================");
        while (chute != numeroSecreto){
            System.out.println("Digite o seu palpite");
            tentativa++;
            chute = scanner.nextInt();
            if (chute < numeroSecreto){
                System.out.println("Hmm....");
                System.out.println("Muito baixo");
            }
            else if  (chute > numeroSecreto){
                System.out.println("Hmm....");
                System.out.println("Muito alto");
            }
            else{
                System.out.println("Parabéns! você acertou em: " + tentativa + " Tentativas");
            }


        }
    }
}