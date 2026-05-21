import static java.lang.IO.*;

void main() {
    double[] precos = new double[5];

    for (int i = 0; i < precos.length; i++) {
        String entrada = readln("Digite o " + (i + 1) + "° preço: ");
        precos[i] = Double.parseDouble(entrada);
    }

    double maior = precos[0];
    double menor = precos[0];

    for (int i = 1; i < precos.length; i++) {
        if (precos[i] > maior) {
            maior = precos[i];
        }
        if (precos[i] < menor) {
            menor = precos[i];
        }
    }
    println("Lista dos preços: " + Arrays.toString(precos));
    println("Maior preço: R$ " + maior);
    println("Menor preço: R$ " + menor);
}
