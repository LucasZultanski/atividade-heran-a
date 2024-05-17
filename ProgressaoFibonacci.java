public class ProgressaoFibonacci {
    public static long proximo(long atual, long anterior) {
        return atual + anterior;
    }
    public static void imprimir(int n) {
        long anterior = 0;
        long atual = 1;
        System.out.print("Os primeiros " + n + " termos da sequência Fibonacci são: ");
        for (int i = 0; i < n; i++) {
            System.out.print(atual + " ");
            long proximo = proximo(atual, anterior);
            anterior = atual;
            atual = proximo;
        }
        System.out.println();
    }
}
