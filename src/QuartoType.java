public enum QuartoType {
    Simples("Simples","Cama de solteiro, televisao de tubo"),
    Luxo("Luxo","Cama luxosa, televisao de tela plana, banheira de hidromassagem");

    private String descricao;
    private String adicionais;

    private QuartoType(String descricao, String adicionais)
    {
        this.descricao = descricao;
        this.adicionais = adicionais;
    }

    public String getAdicionais(){
        return this.adicionais;
    }
    public String toString() {
        return this.descricao;
    }
}
