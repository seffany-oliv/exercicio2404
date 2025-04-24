import java.util.Scanner;

public class ValidadorTriangulo {
    public static void main(String[] args) {
        //Declaração de variáveis
        int a, b, c; //lado do trângulo

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t -- Valiador de Triângulo --\n");

        //Entradas
        System.out.print("Informe lado a: ");
        a = entrada.nextInt();
        System.out.print("Informe b: ");
        b = entrada.nextInt();
        System.out.print("Informe c: ");
        c = entrada.nextInt();

        //Processamento
        if ((a < (b+c))&&(b < (a+c))&&(c < (a+b))){
            //É triângulo
            System.out.printf("\n%d, %d e %d ormam triângulos\n", a, b, c);
        } else {
            //Não é triângulo
            System.out.printf("\n%d, %d e %d NÃO formam triângulo!\n", a, b, c);
        }

    }
    
}