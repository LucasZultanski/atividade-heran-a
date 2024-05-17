public class Main {public static void main(String[] args) {
    ProgressaoAritmetica pa = new ProgressaoAritmetica(2, 3);
    System.out.println("Os primeiros 5 termos da progressão aritmética são:");
    pa.imprimir(5);
    ProgressaoGeometrica pg = new ProgressaoGeometrica(2, 3);
    System.out.println("Os primeiros 5 termos da progressão geométrica são:");
    pg.imprimir(5);
    ProgressaoFibonacci.imprimir(10);
    }
}


