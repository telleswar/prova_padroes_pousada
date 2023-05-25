public class HospedeBuilder {
    private Hospede hospede;
    public HospedeBuilder(){
        this.hospede = new Hospede();
    }

    public HospedeBuilder addNome(String nome){
        hospede.setNome(nome);
        return this;
    }

    public HospedeBuilder addCpf(String cpf){
        hospede.setCpf(cpf);
        return this;
    }
    public HospedeBuilder addContato(String contato){
        hospede.setContato(contato);
        return this;
    }

    public Hospede build() throws Exception{
        if (hospede.getNome().isEmpty() || hospede.getCpf().isEmpty()){
            throw new Exception("Nome ou cpf em branco");
        }
        return this.hospede;
    }

}
