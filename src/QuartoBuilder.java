public abstract class QuartoBuilder {
    private Quarto quarto;
    public QuartoBuilder(Quarto quarto){
        this.quarto = quarto;
    }
    public QuartoBuilder addNumero(String numero){
        this.quarto.setNumero(numero);
        return this;
    }
    public QuartoBuilder addCapacidade(Integer capacidade){
        this.quarto.setCapacidade(capacidade);
        return this;
    }
    public QuartoBuilder addHospede(Hospede hospede){
        this.quarto.setHospede(hospede);
        return this;
    }
    public Quarto build(){
        return this.quarto;
    }
}
