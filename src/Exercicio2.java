import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*Escreva um código onde o usuário entra com um primeiro número, um segundo número maior que o primeiro e
         * escolhe entre a opção de impar ou par, com isso o código deve informar todos os números pares ou ímpares
         * (de acordo com a seleção incial) no intervalo de números informados, incluindo os números informados*/

        //Declarando variáveis
        enum options {
            impar,
            par
        }
        int value1;
        int value2;
        Scanner scanner = new Scanner(System.in);

        //Código executado
        System.out.println("""
                Faça um escolha
                Par
                Impar
                """);

        System.out.print("Digite sua escolha: ");
        var escolha = scanner.next();

        switch (options.valueOf(escolha)){
            case par -> {
                System.out.print("Digite o primeiro número: ");
                value1 = scanner.nextInt();

                System.out.print("\nDigite o segundo número: ");
                value2 = scanner.nextInt();

                for (int i = value1; i <= value2; i++) {
                    if (!(i % 2 == 0)) continue;
                    System.out.println(i);
                }
            }
            case impar -> {
                System.out.print("Digite o primeiro número: ");
                value1 = scanner.nextInt();

                System.out.print("\nDigite o segundo número: ");
                value2 = scanner.nextInt();

                for (int i = value1; i <= value2; i++) {
                    if (i % 2 == 0) continue;
                    System.out.println(i);
                }
            }
        }
    }
}

