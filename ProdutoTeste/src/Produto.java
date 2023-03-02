public class Produto {
    private int codigo;
    private String descricao;
    private double valor;
    private int quantidadeEstoque;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeestoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeestoque(int quantidadeestoque) {
        this.quantidadeEstoque = quantidadeestoque;
    }

    public void imprimir(){
        System.out.println("codigo = " + codigo);
        System.out.println("descricao = " + descricao);
        System.out.println("valor = " + valor);
        System.out.println("quantidadeEstoque = " + quantidadeEstoque);
        System.out.println();
    }

    public void darEntrada(int qtd){
        quantidadeEstoque += qtd;

    }

    public boolean darSaida(int qtd){
        if(qtd <= quantidadeEstoque) {
            quantidadeEstoque -= qtd;
            return true;
        }return false;
    }


}
