import java.util.Scanner;

public class ProdutoTeste {

    public Produto item1 = new Produto();
    Scanner prd = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner prd = new Scanner(System.in);
        ProdutoTeste teste = new ProdutoTeste();
        int opcao = 0;
        do{
            System.out.println("Menu");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Registrar Entrada");
            System.out.println("4. Registrar Saida");
            System.out.println("5. Valor em Reais");
            System.out.println("9. Exit");
            System.out.println("Escolha sua opcao:");
            opcao = Integer.parseInt(prd.nextLine());
            switch(opcao){
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execConsultar();
                    break;
                case 3:
                    teste.execRegistrarEntrada();
                    break;
                case 4:
                    teste.execRegistrarSaida();
                    break;
                case 5:
                    teste.execValorEmReais();
                    break;
                case 9:
                    System.out.println("Fim do Programa!!!");
                    break;
                default:
                    System.out.println("Opcao Invalida!!!");
            }
        }while(opcao!=9);
    }

    public void execValorEmReais(){
        System.out.println("a quantidade em estoque e: " + item1.getQuantidadeestoque());
        System.out.println("o valor unitario e: " + item1.getValor());
        System.out.println("o Valor total e: " + item1.getQuantidadeestoque() * item1.getValor());
    }

    public void execCadastrar(){
        if(item1.getDescricao()!=null){
            System.out.println("Produto ja foi cadastrado");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do produto");
        item1.setCodigo(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a descricao do produto");
        item1.setDescricao(sc.nextLine());
        System.out.println("Digite o valor do produto");
        item1.setValor(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a quantidade em estoque");
        item1.setQuantidadeestoque(Integer.parseInt(sc.nextLine()));

    }

    public void execConsultar(){
        item1.imprimir();
    }

    public void execRegistrarEntrada(){
        int quantidadeEntrada;
        System.out.println("Digite a quantidade de entrada do produto: ");
        quantidadeEntrada = Integer.parseInt(prd.nextLine());
        item1.darEntrada(quantidadeEntrada);
        System.out.println("quantidade atualizada!!!");
    }

    public void execRegistrarSaida(){
        int quantidadeSaida;
        System.out.println("Digite a quantidade a ser retirada do produto: ");
        quantidadeSaida = Integer.parseInt(prd.nextLine());
        if(item1.darSaida(quantidadeSaida)) {
            System.out.println("Quantidade retirada!!!");
        }else {
            System.out.println("Quantidade indisponivel para retirada!!!");
        }
    }


}