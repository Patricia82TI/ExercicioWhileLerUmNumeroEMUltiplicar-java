import java.util.Scanner;

//Faça um programa que leia um número e multiplique o resultado por 2 até o número
//passar de 100
    public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;

        //Validação da entrada
        while(num < 1 || num > 100) {
            System.out.println("Digite um número de 1 a 100");
            num = sc.nextInt();
        }

        //Multiplicação até ser maior que 100
        while(num < 100){
            System.out.println(num);
            num = num * 2;
        }
    }
}