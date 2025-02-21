import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {

        int x = 1;
        int repetir;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Informe o nome da pessoa");
            String nome = sc.nextLine();
            System.out.println("Nome: " + nome);


            System.out.println("Informe a altura da pessoa");
            double altura = sc.nextDouble();
            System.out.println("Altura: " + altura);

            System.out.print("Para cadastrar outra pessoa, digite 0 \n");
            repetir=sc.nextInt();
        }while(repetir==0);
        }
}
