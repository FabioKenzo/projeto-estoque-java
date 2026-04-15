package userinterface;

import java.util.Scanner;
import br.com.produtos.TipoProduto;
import br.com.produtos.Produto;

// Classe principal que gerencia a interface de usuário e a lógica do estoque.
public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Array de armazenamento 
        Produto[] estoque = new Produto[100];

        //Contador de itens para saber quantos espaços foram preenchidos no array
        int totalProdutos = 0;

        int opcao;
        //Criando menu 
        //Loop principal do sistema de inventário

        do {
            System.out.println("\n=========== ESTOQUE ==========");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma das opções: ");

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer do menu

            //Crinado opcoes
            switch (opcao) {
                case 1: {
                    if (totalProdutos >= estoque.length) { //Verificação de segurança para evitar estouro de memória
                        System.out.println("Estoque lotado!");
                        break;
                    }

                    System.out.println("Nome do produto: ");
                    String nome = teclado.nextLine();

                    System.out.println("Marca do produto: ");
                    String marca = teclado.nextLine();

                    System.out.println("Preço do produto: R$");
                    double preco = teclado.nextDouble();

                    System.out.println("Quantidade do produto: ");
                    int quantidade = teclado.nextInt();

                     //Menu categoria
                    System.out.println("=== CATEGORIA ===");
                    System.out.println("1-Periférico 2-Hardware 3-Monitor 4-Acessório 5-Armazenamento");
                    int catego = teclado.nextInt();
                    teclado.nextLine(); // Limpa o buffer 

                    TipoProduto categoria = null;
                    //Mapeia a escolha do usuário para o TipoProduto (Enum)
                    switch (catego) {
                        case 1:
                            categoria = TipoProduto.PERIFERICO;
                            break;
                        case 2:
                            categoria = TipoProduto.HARDWARE;
                            break;
                        case 3:
                            categoria = TipoProduto.MONITOR;
                            break;
                        case 4:
                            categoria = TipoProduto.ACESSORIO;
                            break;
                        case 5:
                            categoria = TipoProduto.ARMAZENAMENTO;
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }

                    //Instanciação e armazenamento do objeto no array
                    if (categoria != null) {
                        Produto p = new Produto(nome, categoria, preco, quantidade, marca);
                        estoque[totalProdutos] = p;
                        totalProdutos++;
                        System.out.println("Produto cadastrado com sucesso!");
                    }
                    break;
                }

                // caso 2 do principal
                case 2: {
                    //Verifica se existem dados para exibição
                    if (totalProdutos == 0) { 
                        System.out.println("Nenhum produto cadastrado!");
                    } else {
                        //Listando Produtos
                        System.out.println("=== Lista de Produtos ===");
                        for (int i = 0; i < totalProdutos; i++) {
                            Produto p = estoque[i];
                            System.out.println(
                                    "ID: " + p.getId() + " | Nome: " + p.getNome() + " | Marca: " + p.getMarca());
                        }
                    }
                    break;
                }

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        teclado.close();
    }
}