import java.util.Scanner;

public class AvaliandoFilmesapp {
    public static void main(String[] args){
        //Declarando input
        double avaliacao1 = 0;
        double mediaAvalicoes = 0;
        Scanner leituraDeDados = new Scanner(System.in);
        //Colentando dados e os armazenando
        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a sua avaliação para o filme?");
            avaliacao1 = leituraDeDados.nextDouble();
            mediaAvalicoes += avaliacao1;
        }
        System.out.println(mediaAvalicoes / 3);

    }
}
