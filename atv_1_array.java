import static java.lang.IO.*;

void main() {
  String[] nomes = new String[5];
  for (int i = 0; i < nomes.length; i++) {
    nomes[i] = readln("Digite o nome do " + (i + 1) + "° convidado: ");
  }

  println("Lista dos convidados: " + Arrays.toString(nomes));

}
