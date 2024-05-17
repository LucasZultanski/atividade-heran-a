public class ProgressaoAritmetica {
    protected long primeiroElemento;
    protected long razao;
    private final long primeiroInicial;

    public ProgressaoAritmetica(long primeiro, long razao) {
        this.primeiroElemento = primeiro;
        this.razao = razao;
        this.primeiroInicial = primeiro;
    }
    public long obterProximo() {
        long proximo = primeiroElemento + razao;
        return proximo;
    }

    // Método para reiniciar a progressão aritmética com o primeiro termo inicial e a razão inicial
    public void reiniciar() {
        primeiroElemento = primeiroInicial;
    }

    public long proximo() {
        primeiroElemento += razao;
        return primeiroElemento;
    }
    public long termo(int n) {
        return primeiroElemento + (n - 1) * razao;
    }
    public void imprimir(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(termo(i + 1) + " ");
        }
        System.out.println();
    }
}