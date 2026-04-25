public static void hanoi(int n, char origem, char destino, char auxiliar)
{
    if(n > 0){
        hanoi(n-1, origem, auxiliar, destino);

        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
        hanoi(n-1, auxiliar, destino, origem);
        }

}

public static void main(String[] args) {
    hanoi(3, 'A', 'C', 'B');
}