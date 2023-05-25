public abstract class Quarto {
    private String numero;
    private QuartoType tipo;
    private Integer capacidade;
    private Hospede hospede;

    protected Quarto(QuartoType tipo){
        this.tipo = tipo;
    }

    public Quarto(String numero, QuartoType tipo, Integer capacidade, Hospede hospede) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.hospede = hospede;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public QuartoType getTipo() {
        return tipo;
    }

    public void setTipo(QuartoType tipo) {
        this.tipo = tipo;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    @Override
    public String toString() {
        return this.tipo.toString() + " | " + this.numero +
                "\n > Capacidade: " + this.capacidade +
                "\n > Adicionais: " + this.tipo.getAdicionais() +
                "\n > Hospede: " + (this.hospede == null ? "*livre": this.hospede.getNome()) +
                "\n";
    }
}
