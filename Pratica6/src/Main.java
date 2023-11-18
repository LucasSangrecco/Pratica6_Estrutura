import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        Scanner ler = new Scanner(System.in);

        arvore.inserir(7);
        arvore.inserir(8);
        arvore.inserir(2);
        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(10);
        arvore.inserir(4);

        System.out.println("Arvore Binaria");
        arvore.imprimir();

        System.out.println("Digite o valor que deseja excluir: ");
        boolean numCerto = false;
        int val = 0;
        while (!numCerto){
            int num = ler.nextInt();
            if(!arvore.pesquisar(num)) {
                System.out.print("Insira um elemento valido: ");
            }else{
                numCerto = true;
                val = num;
                arvore.excluir(val);
            }
        }
        System.out.println(String.format("\nElemento %d deletado", val));
        arvore.imprimir();

        System.out.println("Arvore In-Ordem:");
        arvore.inOrdem();

        System.out.println("\nArvore Pre-Ordem:");
        arvore.preOrdem();

        System.out.println("\nArvore Pos-Ordem");
        arvore.posOrdem();
    }
}