import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
  {
    //var
        int op;
        String continua = "";
        int count = 0;
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (!continua.equals("fim")) {
            if (count >= 1) {
                System.out.print("\n\tDeseja continuar? (Digite 'sim' ou 'fim' para sair) ");
                continua = sc.nextLine();
            }

            op = Produto.Menu();
            Produto produto = new Produto();
            switch (op) {
                case 1:
                    produto = Produto.Incluir_Produto();
                    produtos.add(produto);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    Produto.Listar_Produtos(produtos);
                    break;
                case 5:
                    Produto.Listar_Produto(produtos);
                    break;
                case 0:
                    System.out.println("\nPrograma finalizado com sucesso!");
                    continua = "fim";
                    break;
            }
            count++;
        }
    }
}
