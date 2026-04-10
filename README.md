# 📦 Sistema de Gerenciamento de Estoque (Java POO)

Este é um sistema de inventário desenvolvido em Java para consolidar conceitos de **Programação Orientada a Objetos**. O projeto permite o cadastro de produtos eletrônicos e periféricos, organizando-os por categorias e gerenciando identificadores únicos automaticamente.

## 🎯 Objetivos do Projeto
O foco principal deste sistema foi aplicar conceitos avançados de Java, indo além da lógica básica e explorando a estruturação de classes e a segurança dos dados.

## 🛠️ Conceitos de POO Aplicados
- **Encapsulamento**: Atributos privados com métodos `getters` e `setters` para controle de acesso.
- **Membros Estáticos**: Uso de um `static int contador` para gerar IDs automáticos e incrementais, garantindo que cada produto seja único.
- **Enumerações (Enums)**: Utilização de `TipoProduto` para restringir as categorias, evitando erros de digitação e garantindo integridade no banco de dados em memória.
- **Composição e Arrays**: Armazenamento de instâncias da classe `Produto` dentro de um array de objetos na classe principal.

## 🚀 Funcionalidades
1.  **Cadastrar Produto**: 
    - Coleta de Nome, Marca, Preço e Quantidade.
    - Seleção de Categoria via Menu (Periférico, Hardware, Monitor, Acessório, Armazenamento).
    - Verificação de limite de estoque (máximo 100 itens).
2.  **Listar Produtos**: 
    - Exibição detalhada de todos os itens cadastrados.
    - Apresentação formatada com ID, Categoria e Preço.
3.  **Saída Segura**: Encerramento do programa com fechamento do recurso `Scanner`.

## 📁 Estrutura do Código
- `br.com.produtos.TipoProduto`: Enum que define as categorias permitidas.
- `br.com.produtos.Produto`: Classe modelo que representa o objeto no estoque.
- `userinterface.Principal`: Classe responsável pela interação com o usuário e controle do menu.

## 💻 Como executar
1. Clone o repositório.
2. Certifique-se de ter o JDK 17 ou superior instalado.
3. Compile e execute a classe `Principal.java`.

---
*Projeto desenvolvido por Fabio Kenzo Okamura como parte do aprofundamento em Java POO.*
