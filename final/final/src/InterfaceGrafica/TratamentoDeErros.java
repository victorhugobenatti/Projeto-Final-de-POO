package InterfaceGrafica;

public class TratamentoDeErros {
    public static int parseInteger(String input) throws NumberFormatException {
        if (!input.matches("\\d+")) {
            throw new NumberFormatException("Formato inválido, use números inteiros");
        }
        return Integer.parseInt(input);
    }

    public static double parseDouble(String input) throws NumberFormatException {
        if (!input.matches("-?\\d+(\\.\\d+)?")) {
            throw new NumberFormatException("Formato inválido, use números reais");
        }
        return Double.parseDouble(input);
    }
}
