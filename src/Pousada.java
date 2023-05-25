import java.util.ArrayList;
import java.util.List;

public class Pousada {
    private static Pousada instance;
    private String nome;
    private String endereco;
    private String contado;
    private List<Quarto> quartos;
    private List<Hospede> hospedes;

    private Pousada() {
        this.quartos = new ArrayList<>();
        this.hospedes = new ArrayList<>();
    }
    public static Pousada getInstance(){
        if (instance == null){
            instance = new Pousada();
        }
        return instance;
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

    public void removerHospede(Hospede hospede) {
        hospedes.add(hospede);
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }

    public String getContado() {
        return contado;
    }

    public Integer getQuatidadeQuartos(){
        return quartos.size();
    }

    public void setContado(String contado) {
        this.contado = contado;
    }

    public Hospede getHospedeByCpf(String cpf){
        for (Hospede h: this.hospedes) {
            if(h.getCpf().equals(cpf)){
                return h;
            }
        }
        return  null;
    }

    public Quarto getQuartoByNumero(String numero){
        for (Quarto q: this.quartos) {
            if(q.getNumero().equals(numero)){
                return q;
            }
        }
        return  null;
    }

    public Boolean checkIn (String cpf, String numero){
        Hospede hospede = getHospedeByCpf(cpf);
        Quarto quarto = getQuartoByNumero(numero);
        if (hospede == null || quarto ==  null){
            System.out.println("Hospede e/ou quarto invalidos.");
            return false;
        }

        if (quarto.getHospede() != null){
            System.out.println("Quarto "+quarto.getNumero()+" ocupado pelo hospede(cpf: " + quarto.getHospede().getCpf()+") e não esta disponivel no momento.");
            return false;
        }

        quarto.setHospede(hospede);
        System.out.println("O quarto numero: " + quarto.getNumero() + " foi registrado para o hospede cpf: " + hospede.getCpf());

        return true;
    }


}
