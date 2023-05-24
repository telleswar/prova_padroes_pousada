public final class QuartoLuxo extends Quarto {

    public QuartoLuxo(){
        super(QuartoType.Luxo);
    }
    public  QuartoLuxo(String numero, Integer capacidade, Hospede hospede) {
        super(numero, QuartoType.Luxo, capacidade, hospede);
    }
}
