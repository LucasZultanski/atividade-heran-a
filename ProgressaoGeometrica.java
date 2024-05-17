public class ProgressaoGeometrica {protected double primeiroElemento;
    protected double razao;
    private final double primeiroInicial;
    public ProgressaoGeometrica(double primeiro, double razao) {
        this.primeiroElemento = primeiro;
        this.razao = razao;
        this.primeiroInicial = primeiro;

    }

    public double proximo() {
        primeiroElemento *= razao;
        return primeiroElemento;
    }
    public long obterProximo() {
        long proximo = (long) (primeiroElemento + razao);
        return proximo;
    }

    public void reiniciar() {
        primeiroElemento = primeiroInicial;
    }


    public double termo(int n) {
        return primeiroElemento * Math.pow(razao, n - 1);
    }

    public void imprimir(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(termo(i + 1) + " ");
        }
        System.out.println();
    }
}

