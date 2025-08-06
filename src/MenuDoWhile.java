import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int opcao;
            do {
                System.out.println("=== MENU ===");
                System.out.println("1 - Dizer olá");
                System.out.println("2 - Dizer Tchau");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();

                if (opcao == 1){
                    System.out.println("Olá!");
                } else if(opcao == 2) {
                        System.out.println("Tchau!");
                    } else if(opcao!= 0) {
                        System.out.println("Opção onválida.");
                    }
            }while (opcao != 0);
                System.out.println("Programa encerrado.");
                scanner.close();
        }
    }

