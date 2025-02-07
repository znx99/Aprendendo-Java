import java.util.Scanner;

public class Input {
    public static void main(String[] args){
    //Para leitura de dados ultilize o escanner como no exemplo abaixo
        Scanner leituraDeInput = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String filme = leituraDeInput.nextLine();
        System.out.println(filme);
        System.out.println("Escrava a sua idade em forma de um int:");
        int idadeDoUser = leituraDeInput.nextInt();
        System.out.println(idadeDoUser);
    }
}
