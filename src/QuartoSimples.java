public final class QuartoSimples extends Quarto{

    public QuartoSimples(){
        super(QuartoType.Simples);
    }
    public QuartoSimples(String numero, Integer capacidade, Hospede hospede) {
        super(numero, QuartoType.Simples, capacidade, hospede);
    }
}
