import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //a variavel posicao mostra o resultado do case
        int posicao=1;


        switch(posicao){
            case 1:
                System.out.printf("%s%n","Medalha de Ouro");
                break;
            case 2:
                System.out.printf("%s%n","Medalha de Prata");
                break;
            case 3:
                System.out.printf("%s%n","Medalha de Bronze");
                break;
            default:
                System.out.printf("%s%n","Sem Medalha");
                break;
        }
    }
}