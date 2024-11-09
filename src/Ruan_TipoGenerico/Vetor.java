package seuNome_TipoGenerico;

public class Vetor<T> {
    private T[] vetor;
    private int tamanho;

    public Vetor(T[] vetor, int tamanho) {
        this.vetor = vetor;
        this.tamanho = tamanho;
    }

    public T[] getVetor() {
        return vetor;
    }

    public void setVetor(T[] vetor) {
        this.vetor = vetor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
