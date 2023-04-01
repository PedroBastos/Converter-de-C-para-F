import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Converter de C para F \n 2. Converter de F para C");//EXIBIR
        Scanner ler = new Scanner(System.in);
        int opcao = ler.nextInt();//ENTRADA DE DADOS

        switch (opcao){
            case 1: {
                System.out.println("Informe os Grau celsius:  ");
                double c = ler.nextInt();
                double f = (9 * c + 160) / 5;
                System.out.println("Em Fahrenheit é: 2" + f);
                break;
            }
            case 2: {
                System.out.println("Informe em Fahrenheit");
                double f = ler.nextDouble();
                double c = (5 * f - 160) / 9;
                System.out.println("Em Celsius é: " + c);
                break;
            }
            default:{
                System.out.println();
                break;
            }
        }
    }
}
