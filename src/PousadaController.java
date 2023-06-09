import java.util.ArrayList;

public class PousadaController {

    private static PousadaController instance;
    private ArrayList<Quarto> quartos;
    private ArrayList<Hospede> hospedes;


    private Integer idFornecedor = 1;

    private PousadaController() {
        System.out.println("Iniciando check-in de quarto");
        quartos = new ArrayList<>();
    }

    public static PousadaController getInstance() {
        if (instance == null) {
            instance = new PousadaController();
        }
        return instance;
    }

    public Hospede buscarPorCPF(String cpf) {
        for (Hospede h : hospedes) {
            if (h.getCpf().equals(cpf)) {
                return h;
            } else {
                return null;
            }
        }
        return null;
    }
}
