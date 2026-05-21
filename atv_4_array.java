
import static java.lang.IO.*;

void main() {
    List<Double> celsiusList = new ArrayList<>();
    List<Double> fahrenheitList = new ArrayList<>();

    double somaCelsius = 0;
    double somaFahrenheit = 0;

    while (true) {
        String entrada = readln("Digite a temperatura em Celsius (ou 'sair'): ");

        if (entrada.trim().equalsIgnoreCase("sair")) {
            break;
        }

        try {
            double c = Double.parseDouble(entrada);
            celsiusList.add(c);
            somaCelsius += c;

            double f = (c * 9 / 5) + 32;
            fahrenheitList.add(f);
            somaFahrenheit += f;

        } catch (NumberFormatException e) {
            println("Entrada inválida! Digite um número válido ou 'sair'.");
        }
    }

    if (!celsiusList.isEmpty()) {
        double mediaCelsius = somaCelsius / celsiusList.size();
        double mediaFahrenheit = somaFahrenheit / fahrenheitList.size();

        println("\n--- Resultados ---");
        println("Lista Celsius: " + celsiusList);
        println("Lista Fahrenheit: " + fahrenheitList);
        println("Média em Celsius: " + String.format("%.2f", mediaCelsius) + " °C");
        println("Média em Fahrenheit: " + String.format("%.2f", mediaFahrenheit) + " °F");
    } else {
        println("Nenhuma temperatura foi inserida.");
    }
}
