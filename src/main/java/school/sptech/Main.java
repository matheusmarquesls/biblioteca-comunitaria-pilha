package school.sptech;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ESTRUTURAS DE DADOS USADAS
        // Queue (Fila de Espera) → segue a regra FIFO (First In, First Out)
        Queue<String> filaEspera = new LinkedList<>();

        // Stack (Pilha de Devoluções) → segue a regra LIFO (Last In, First Out)
        Stack<String> pilhaDevolucoes = new Stack<>();

        // ArrayList (Catálogo de Livros)
        ArrayList<String> catalogoLivros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Menu interativo
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar usuário à fila de espera");
            System.out.println("2 - Atender próximo usuário da fila");
            System.out.println("3 - Registrar devolução de livro");
            System.out.println("4 - Retirar próximo livro da pilha de devoluções");
            System.out.println("5 - Cadastrar livro no catálogo");
            System.out.println("6 - Listar todos os livros do catálogo");
            System.out.println("7 - Buscar livro no catálogo pelo título");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    // ---------------------------
                    // Adiciona usuário à fila
                    // ---------------------------
                    System.out.print("Digite o nome do usuário: ");
                    String usuario = scanner.nextLine();
                    System.out.println("Fila ANTES: " + filaEspera);
                    filaEspera.add(usuario); // adiciona no final da fila
                    System.out.println("Usuário adicionado à fila.");
                    System.out.println("Fila APÓS: " + filaEspera);
                    break;

                case 2:

                    // Atende o próximo da fila (FIFO)

                    System.out.println("Fila ANTES: " + filaEspera);
                    if (filaEspera.isEmpty()) {
                        System.out.println("Nenhum usuário na fila.");
                    } else {
                        String atendido = filaEspera.poll(); // remove o primeiro da fila
                        System.out.println("Usuário atendido: " + atendido);
                        System.out.println("Fila APÓS: " + filaEspera);
                    }
                    break;

                case 3:

                    // Registra devolução (empilha)

                    System.out.print("Digite o título do livro devolvido: ");
                    String livroDevolvido = scanner.nextLine();
                    System.out.println("Pilha ANTES: " + pilhaDevolucoes);
                    pilhaDevolucoes.push(livroDevolvido); // adiciona no topo da pilha
                    System.out.println("Livro devolvido adicionado à pilha.");
                    System.out.println("Pilha APÓS: " + pilhaDevolucoes);
                    break;

                case 4:

                    // Retira livro da pilha (LIFO)

                    System.out.println("Pilha ANTES: " + pilhaDevolucoes);
                    if (pilhaDevolucoes.isEmpty()) {
                        System.out.println("Nenhum livro na pilha de devoluções.");
                    } else {
                        String livroOrganizar = pilhaDevolucoes.pop(); // remove o topo
                        System.out.println("Livro retirado para organização: " + livroOrganizar);
                        System.out.println("Pilha APÓS: " + pilhaDevolucoes);
                    }
                    break;

                case 5:

                    // Cadastra livro no catálogo

                    System.out.print("Digite o título do livro para cadastrar: ");
                    String novoLivro = scanner.nextLine();
                    catalogoLivros.add(novoLivro);
                    System.out.println("Livro cadastrado no catálogo.");
                    break;

                case 6:

                    // Lista todos os livros do catálogo

                    System.out.println("=== Catálogo de Livros ===");
                    if (catalogoLivros.isEmpty()) {
                        System.out.println("Catálogo vazio.");
                    } else {
                        for (int i = 0; i < catalogoLivros.size(); i++) {
                            System.out.println((i + 1) + ". " + catalogoLivros.get(i));
                        }
                    }
                    break;

                case 7:

                    // Busca livro no catálogo

                    System.out.print("Digite o título do livro para buscar: ");
                    String busca = scanner.nextLine();
                    if (catalogoLivros.contains(busca)) {
                        System.out.println("Livro '" + busca + "' está disponível no catálogo.");
                    } else {
                        System.out.println("Livro não encontrado no catálogo.");
                    }
                    break;

                case 8:

                    // Encerra o sistema

                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 8);

        scanner.close();
    }
}
