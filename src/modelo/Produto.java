package modelo;

/**
 * @author Bruno Ramos
 */
public class Produto {
    private String nome;
    private Integer quantidade = 0;
    private Float preco = 0.0f;
    private Float valorTotal;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
        valorTotal = preco * quantidade;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
        valorTotal = preco * quantidade;
    }

    public Float getValorTotal() {
        return valorTotal;
    }  
}