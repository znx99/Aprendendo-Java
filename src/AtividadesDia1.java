import javax.imageio.plugins.tiff.FaxTIFFTagSet;
import java.util.Scanner;

public class AtividadesDia1 {
    public static void main(String[] args) {
        //Atividade 1
        for (int i = 0; i < 0; i++) {
            //Atividade 1
            //Crie um programa que solicite ao usuário digitar
            // um número. Se o número for positivo, exiba "Número positivo"
            // caso contrário, exiba "Número negativo".
            //Declarando variaveis:
            int numeroDoUsuario = 0;
            //Coletando dados do input
            Scanner leituraDeIput = new Scanner(System.in);
            //Iniciando output
            System.out.println("Digite um numero:");
            numeroDoUsuario = leituraDeIput.nextInt();
            System.out.println("Nuemro coletado: " + numeroDoUsuario);
            if (numeroDoUsuario >= 0){
                System.out.println("Numero Positivo|||");
            }else{
                System.out.println("Numero Negativo!!!");
            }

        }
        //Atividade 2
        for (int i = 0; i < 0; i++) {
            //Atividade 2
            //Peça ao usuário para inserir dois números inteiros.
            // Compare os números e imprima uma mensagem indicando se são iguais,
            // diferentes, o primeiro é maior ou o segundo é maior.
            //Declarando Variaveis
            int numero1 = 0;
            int numero2 = 0;
            boolean saoIguais = false;
            //Coletando dados do output
            Scanner leituraDeDados = new Scanner(System.in);
            //Coletando dados init
            System.out.println("Digite o primeiro nuemro inteiro:");
            numero1 = leituraDeDados.nextInt();
            System.out.println("Digite o segundo numero inteiro:");
            numero2 = leituraDeDados.nextInt();
            //Iniciando o data cience
            System.out.println("Informações");
            if (numero1 == numero2){
                System.out.println("Os numeros são iguais!!!");
                saoIguais = true;
            }else {
                System.out.println("Os numeros são diferentes!!!");

            }
            if (saoIguais == false){
                if(numero1 > numero2){
                    System.out.println("O numero1("+numero1 + ") é maior que o numero2("+numero2+")");
                }else{
                    System.out.println("O numero2("+numero2 + ") é maior que o numero1("+numero1+")");
                }
            }



        }
        //Atividade 3
        for (int i = 0; i < 0; i++) {
            //Atividade 3
            //Crie um menu que oferece duas opções ao usuário:
            //"1. Calcular área do quadrado" e "2. Calcular área do círculo".
            //Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
            //Declarando variaveis
            int respostaDoUsuario = 0;
            int areaDigitada = 0;
            double respostaUser = 0;
            //criando o input
            Scanner coletarRespUser = new Scanner(System.in);
            //Iniciando coleta de dados
            System.out.println("Digite 1 para calcular a area do circulo\nDigite 2 para calcular a area do quadrado");
            respostaDoUsuario = coletarRespUser.nextInt();
            System.out.println("Resposta coletada:" + respostaDoUsuario);
            if (respostaDoUsuario == 1){
                System.out.println("Digite o raio do circulo:");
                areaDigitada = coletarRespUser.nextInt();
                respostaUser = 3.14 * (areaDigitada*areaDigitada);
                System.out.println("A area do circulo é:"+respostaUser);
                break;
            }else{
                System.out.println("Digite a base do quadrado:");
                areaDigitada = coletarRespUser.nextInt();
                respostaUser = areaDigitada * areaDigitada;
                System.out.println("A area do quadrado é:"+respostaUser);
            }
        }
        //Atividade 4
        for (int i = 0; i < 0; i++) {
            //Atividade 4
            //Crie um programa que solicite ao usuário um número
            // e exiba a tabuada desse número de 1 a 10.]
            //Definindo Variaveis:
            int numeroColetado = 0;
            int numeroRespUser = 0;
            //Preparando para coleta input
            Scanner coletaResp = new Scanner(System.in);
            //Iniciando coleta
            System.out.println("Digite um numero inteiro para calcular a tabuada:");
            numeroColetado = coletaResp.nextInt();
            System.out.println("1x"+numeroColetado + " = " + (numeroColetado * 1));
            System.out.println("2x"+numeroColetado + " = " + (numeroColetado * 2));
            System.out.println("3x"+numeroColetado + " = " + (numeroColetado * 3));
            System.out.println("4x"+numeroColetado + " = " + (numeroColetado * 4));
            System.out.println("5x"+numeroColetado + " = " + (numeroColetado * 5));
            System.out.println("6x"+numeroColetado + " = " + (numeroColetado * 6));
            System.out.println("7x"+numeroColetado + " = " + (numeroColetado * 7));
            System.out.println("8x"+numeroColetado + " = " + (numeroColetado * 8));
            System.out.println("9x"+numeroColetado + " = " + (numeroColetado * 9));
            System.out.println("10x"+numeroColetado + " = " + (numeroColetado * 10));
        }
    }

}
