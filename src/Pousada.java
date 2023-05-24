import java.util.ArrayList;
import java.util.List;

public class Pousada {
    private String nome;
    private String endereco;
    private List<Quarto> quartos;
    private List<Hospede> hospedes;

    public Pousada(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void removerQuarto(Quarto quarto) {
        quartos.remove(quarto);
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void adicionarHospede(Hospede hospede) {
        hospedes.add(hospede);
    }




}
