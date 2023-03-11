import java.util.Scanner;

public class BeeCrowdEx0102 {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      System.out.print("Digite o valor A : ");
      int A = input.nextInt();
      System.out.print("Digite o valor B : ");
      int B = input.nextInt();
      int X = A + B;
        
      System.out.println("A soma dos valore A e B é = " + X);
      
      exercicio02();
    }
    public static void exercicio02() {
      Scanner input= new Scanner(System.in);
      double pi = 3.14159;
      System.out.print("Digite o valor do raio da circunferência: ");
      double raio = input.nextDouble();
      double area = pi *  Math.pow(raio, 2);
                
      System.out.println("A área do ciírculo é: " + area);
      
    }
}
