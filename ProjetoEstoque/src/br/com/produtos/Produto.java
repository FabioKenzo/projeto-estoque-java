package br.com.produtos;

public class Produto {

//Contador estatico. Gerencia a geração automática de IDs únicos para cada instância
private static int contador = 0;

//Atributos de estancia(Encapsulamento)
private int id; 
private String nome; 
private TipoProduto categoria; 
private double preco; 
private int quantidade; 
private String marca;

//Contrutor 
//O id é o incrementado automaticamente a cada nova instancia
public Produto(String nome, TipoProduto categoria, double preco, int quantidade, String marca) {
    this.id = ++contador;
    this.nome = nome;
    this.categoria = categoria;
    this.preco = preco;
    this.quantidade = quantidade;
    this.marca = marca;
}

//Getters e Setters

public int getId() {
    return id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public TipoProduto getCategoria() {
    return categoria;
}

public void setCategoria(TipoProduto categoria) {
    this.categoria = categoria;
}

public double getPreco() {
    return preco;
}

public void setPreco(double preco) {
    this.preco = preco;
}

public int getQuantidade() {
    return quantidade;
}

public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}

public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
} 

}
