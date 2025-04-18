package GerenciamentoDoEstoque;

import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);
    int quantidade;
    double valor;
    double valorEstoque;

    int camisa;
    int calca;
    int vestido;

    public static void main(String[] args) {
        Main estoque = new Main();
        estoque.menu();
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("\n----- MENU ESTOQUE -----");
            System.out.println("1 - Informar estoque");
            System.out.println("2 - Adicionar peças");
            System.out.println("3 - Remover peças");
            System.out.println("4 - Ver valor total em estoque");
            System.out.println("5 - Ver tipos de roupas");
            System.out.println("6 - Ver marcas");
            System.out.println("7 - Ver tamanhos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: informarEstoque(); break;
                case 2: adicionarAoEstoque(); break;
                case 3: removerDoEstoque(); break;
                case 4: mostrarValorTotal(); break;
                case 5: editarTiposDeRoupas(); break;
                case 6: mostrarMarcas(); break;
                case 7: mostrarTamanhos(); break;
                case 0: System.out.println("Saindo do sistema..."); break;
                default: System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public void informarEstoque() {
        System.out.print("Quantidade em estoque: ");
        quantidade = sc.nextInt();

        System.out.print("Valor de cada peça: ");
        valor = sc.nextDouble();

        valorEstoque = quantidade * valor;

        System.out.println("Estoque registrado com sucesso.");
    }

    public void mostrarValorTotal() {
        valorEstoque = quantidade * valor;
        System.out.println("Valor total do estoque: R$" + valorEstoque);
    }

    public void adicionarAoEstoque() {
        System.out.print("Quantidade a adicionar: ");
        int qtd = sc.nextInt();
        quantidade += qtd;
        System.out.println("Nova quantidade em estoque: " + quantidade);
    }

    public void removerDoEstoque() {
        System.out.print("Quantidade a remover: ");
        int remover = sc.nextInt();

        if (remover > quantidade) {
            System.out.println("Erro: quantidade excede o estoque disponível.");
        } else {
            quantidade -= remover;
            System.out.println("Estoque atualizado. Quantidade restante: " + quantidade);
        }
    }

    public void mostrarMarcas() {
        System.out.println("Marcas disponíveis: Nick, Zara, Lacoste");
    }

    public void editarTiposDeRoupas() {
        System.out.print("Quantas camisas? ");
        camisa = sc.nextInt();

        System.out.print("Quantas calças? ");
        calca = sc.nextInt();

        System.out.print("Quantos vestidos? ");
        vestido = sc.nextInt();

        int total = camisa + calca + vestido;

        if (total > quantidade) {
            System.out.println("Erro: quantidade excede o total em estoque.");
        } else {
            System.out.println("Tipos registrados com sucesso.");
        }
    }

    public void mostrarTamanhos() {
        System.out.println("Tamanhos disponíveis: P, M, G");
    }
}
