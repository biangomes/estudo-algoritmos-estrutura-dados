import java.util.ArrayList;
import java.util.List;

public class Ordenacao {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);   // posicao 0
        lista.add(2);   // posicao 1
        lista.add(0);   // posicao 2
        lista.add(10);  // posicao 3
        lista.add(6);   // posicao 4

        System.out.println("Vetor ordenado: " + ordenacaoPorSelecao(lista).toString());

        for (Integer elemento : ordenacaoPorSelecao(lista)) {
            System.out.print(elemento);
        }
    }

    public static int buscaMenorElementoDaLista(List<Integer> lista) {
        int menor = lista.get(0);
        int menorIndice = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < menor) {
                menor = lista.get(i);
                menorIndice = i;
            }
        }
        return menorIndice;
    }

    public static List<Integer> ordenacaoPorSelecao(List<Integer> listaParaOrdenar) {
        List<Integer> listaOrdenada = new ArrayList<>();
        
        while(!listaParaOrdenar.isEmpty()) {
            int indiceMenor = buscaMenorElementoDaLista(listaParaOrdenar);
            listaOrdenada.add(listaParaOrdenar.remove(indiceMenor));
        }

        return listaOrdenada;
    } 
}
