import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Reajuste Salarial");

        Scanner tela8 = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = tela8.next();
        System.out.println("Qual é o salário do " + nome + "? R$:");
        double salario = tela8.nextDouble();

        if(salario >= 280 && salario < 700){
            double conta1 =  salario + (salario * 20 / 100);

            System.out.println("O funcionário(a):  " + nome + " que ganhava" + salario + " ,com 20% de aumento, passa receber R$" + conta1);
        } else if(salario >= 700 && salario < 15000 ){
            double  conta2 = salario + (salario * 15 / 100);

            System.out.println("O funcionário(a): " + nome + "que ganhava " + salario + " com 15% de aumento, passa receber R$" + conta2);
        }else{
            double conta3 = salario + (salario * 5 / 100);

            System.out.println("O funcionário(a): " + nome + "que ganhava " + salario + " com 5% de aumento, passa receber R$" + conta3);
        }

    }
}
