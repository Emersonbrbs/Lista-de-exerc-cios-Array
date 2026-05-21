import static java.lang.IO.*;

void main() {
    List<String> listaCompras = new ArrayList<>();
    boolean rodando = true;

    while (rodando) {
        println("\n--- MENU LISTA DE COMPRAS ---");
        println("1 - Adicionar à lista");
        println("2 - Pesquisar item");
        println("3 - Remover item");
        println("4 - Alterar item");
        println("5 - Listar produtos");
        println("6 - Sair");

        String opcao = readln("Escolha uma opção: ").trim();

        switch (opcao) {
            case "1" -> {
                while (true) {
                    String produto = readln("Digite o produto para adicionar (ou 'sair'): ").trim();
                    if (produto.equalsIgnoreCase("sair")) {
                        break;
                    }
                    if (!produto.isEmpty()) {
                        listaCompras.add(produto);
                        println(produto + " adicionado!");
                    }
                }
            }
            case "2" -> {
                String pesquisa = readln("Digite o produto para pesquisar: ").trim();
                boolean encontrado = false;

                for (String item : listaCompras) {
                    if (item.equalsIgnoreCase(pesquisa)) {
                        println("Produto encontrado: " + item);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    println("Produto não encontrado");
                }
            }
            case "3" -> {
                String remover = readln("Digite o produto para remover: ").trim();
                boolean removido = false;

                for (int i = 0; i < listaCompras.size(); i++) {
                    if (listaCompras.get(i).equalsIgnoreCase(remover)) {
                        listaCompras.remove(i);
                        println("produto removido");
                        removido = true;
                        break;
                    }
                }
                if (!removido) {
                    println("produto não encontrado");
                }
            }
        }
    }
}
