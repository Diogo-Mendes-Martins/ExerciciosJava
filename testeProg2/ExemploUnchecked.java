package testeProg2;

public class ExemploUnchecked {
    public static void main(String[] args) {
        try {
            // Tentando acessar um índice de array fora do limite
            int[] arr = new int[5];
            System.out.println(arr[10]); // Isso gera ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            // Tentando dividir por zero
            int resultado = 10 / 0; // Isso gera ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            // Tentando acessar um objeto nulo
            String str = null;
            System.out.println(str.length()); // Isso gera NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
