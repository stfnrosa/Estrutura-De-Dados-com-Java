public class Exercicios {

    public static int soma(int n) {
        if (n == 0)
            return 0;
        return n + soma(n - 1);
    }
    public static int potencia(int a, int b) {
        if (b == 0)
            return 1;
        return a * potencia(a, b - 1);
    }
    public static int somaDigitos(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + somaDigitos(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(soma(5));
        System.out.println(potencia(2, 3));
        System.out.println(somaDigitos(123));
    }
}
