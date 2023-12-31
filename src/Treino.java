import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double numeroUsuario;
        int limiteTabuada;

        System.out.println("Digite o número que você quer saber a tabuada: ");
        numeroUsuario = leitura.nextDouble();

        System.out.println("Até qual multiplicador você quer que vá a tabuada?");
        limiteTabuada = leitura.nextInt();

        for( int i = 0; i <= limiteTabuada; i++){
            System.out.println(numeroUsuario + " x " + i + " = " + numeroUsuario * i);
        }
        }
    }

