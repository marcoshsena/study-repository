
public class Contador {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Por favor, forneça dois números inteiros como argumentos.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        try {
            contarNumeros(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contarNumeros(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 >= num2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int diff = num2 - num1;
        for (int i = 1; i <= diff; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}