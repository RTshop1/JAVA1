import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {

        int x = 1;
        int repetir;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Informe a Matricula do funcionario");
            String Matricula = sc.nextLine();
            System.out.println("Matricula: " + Matricula);


            System.out.println("Informe o nome do funcionario");
            String nome = sc.nextLine();
            System.out.println("Nome: " + nome);


            System.out.println("Informe o salario bruto do funcionario");
            double salario = sc.nextDouble();
            System.out.println("Salario: " + salario);





            System.out.print("Para cadastrar outra pessoa, digite 0 \n");
            repetir=sc.nextInt();
        }while(repetir==0);
    }
}