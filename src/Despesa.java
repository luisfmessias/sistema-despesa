public class Despesa {
    private String descricao;
    private double valor;
    private String dataVencimento;
    private String categoria;
    private boolean paga;

    public Despesa(String descricao, double valor, String dataVencimento, String categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.categoria = categoria;
        this.paga = false;
    }

    public void marcarComoPaga() {
        this.paga = true;
    }

    public boolean isPaga() {
        return paga;
    }

    @Override
    public String toString() {
        return descricao + " | R$ " + valor + " | " + dataVencimento + " | " + categoria + " | " + (paga ? "Paga" : "Em aberto");
    }
}
