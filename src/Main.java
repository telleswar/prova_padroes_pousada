// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Pousada pousada = Pousada.getInstance();
        pousada.setNome("Pousada do São João");
        pousada.setEndereco("Rua teste, 123");

        //Inicialização
        SetupQuartos(pousada);
        CadastrandoHospedes(pousada);

        //Listando Quartos e Hospedes
        System.out.println("[*]Quartos\n");
        for (Quarto q: pousada.getQuartos()) {
            System.out.println(q.toString());
        }

        System.out.println("[*]Hospedes\n");
        for (Hospede h: pousada.getHospedes()) {
            System.out.println(h.toString());
        }
        System.out.println("A pousada tem " + pousada.getQuatidadeQuartos() + " quartos.");

        pousada.checkIn("103.444.555-88", "L1");

        pousada.checkIn("103.444.555-77", "S1");

        pousada.checkIn("103.444.555-99", "S1");

        pousada.checkIn("103.444.555-99", "L3");

        //Listando Quartos
        System.out.println("\n[*]Quartos\n");
        for (Quarto q: pousada.getQuartos()) {
            System.out.println(q.toString());
        }


    }

    private static void CadastrandoHospedes(Pousada pousada) throws Exception {
        //Criando os hospedes
        pousada.adicionarHospede(new HospedeBuilder().
                addNome("Eduardo").
                addContato("(47) 9 9224-0039").
                addCpf("103.444.555-77").
                build()
        );

        pousada.adicionarHospede(new HospedeBuilder().
                addNome("Antony").
                addContato("(47) 9 9762-2050").
                addCpf("103.444.555-88").
                build()
        );

        pousada.adicionarHospede(new HospedeBuilder().
                addNome("Leandro").
                addContato("(47) 9 9977-4475").
                addCpf("103.444.555-99").
                build()
        );
    }

    private static void SetupQuartos(Pousada pousada) {
        //Criando os Quartos
        pousada.adicionarQuarto(QuartoBuilderFactory.create(QuartoType.Simples).
                addNumero("S1").
                addCapacidade(1).
                build()
        );

        pousada.adicionarQuarto(QuartoBuilderFactory.create(QuartoType.Simples).
                addNumero("S2").
                addCapacidade(2).
                build()
        );

        pousada.adicionarQuarto(QuartoBuilderFactory.create(QuartoType.Luxo).
                addNumero("L1").
                addCapacidade(6).
                build()
        );

        pousada.adicionarQuarto(QuartoBuilderFactory.create(QuartoType.Luxo).
                addNumero("L2").
                addCapacidade(8).
                build()
        );
    }

}