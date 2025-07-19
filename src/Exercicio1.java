import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Exercício: Gerar a tabuada do número que o usuário inputa\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual tabuada você gostaria de saber: ");
        var tabuada = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
                System.out.print(i * tabuada + " ");
            }
        System.out.println();
    }
}
