import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um numero:");
        float a = sc.nextFloat();
        System.out.println("Digite outro numero:");
        float b = sc.nextFloat();
        System.out.println("Digite a operaÃ§Ã£o desejada:(*,+,- ou /");
        String op = sc.next();
        switch (op){
            case "-":
                if (op.equals("-")) {
                    float subt = a - b;
                    System.out.println("O resultado da subtracao e: " + subt);
                    break;
                }
            case "*":
                if (op.equals("*")) {
                    float multip = a * b;
                    System.out.println("O resultado da multiplicacao e: " + multip);
                    break;
                }
            case "/":
                if (op.equals("/")) {
                    float div = a / b;
                    System.out.println("O resultado da divisao e: " + div);
                    break;
                }
            case "+":
                if (op.equals("+")) {
                    float soma = a + b;
                    System.out.println("O resultado da soma e: " + soma);
                    break;
                }
        }


    }
}
