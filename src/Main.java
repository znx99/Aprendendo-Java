import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        //Atividade 1
        double primeiraNota = 4.5;
        double segundaNota = 3.6;
        double mediaDasNotas = (primeiraNota + segundaNota) / 2;
        //Demosntrando resultados no output
        System.out.println("Media das notas: " + mediaDasNotas);
        //Atividade 2
        //Declarando Variaveis

        int variavelDeNumero1 = 12;
        double variavelDeNumero2 = 12.5;
        //DEmonstrando resultado no output
        System.out.println("Variavel 1:" + variavelDeNumero1 + ", Variavel 2:" + variavelDeNumero2);

        //Atividade 3
        char letraUnica = 'o';
        String noemCompleto = "Guilherme";
        String outputMessage = "A char é:" + letraUnica + "A palavra á:" + noemCompleto;
        //Concatenação das variaveis e demonstrando as no output
        System.out.println(outputMessage);

        //Atividade 4
        //Declarando variaveis:
        double valorProduto = 12.5;
        int quantidadeDeProdutos = 124;
        double patrimonioAcumulado = valorProduto * quantidadeDeProdutos;
        //Output
        System.out.println("Valor do produto: " + valorProduto +"\nQuantidade de unidades: " + quantidadeDeProdutos + "\nPatrimonio Acumulado: " + patrimonioAcumulado);
    }
}