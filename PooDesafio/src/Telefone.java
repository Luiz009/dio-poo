public interface Telefone {
        public void ligar(String nome);
        public void atender();
        public void iniciarCorreioVoz();

    void tocar(String musica);

    void pausar(String musica);

    String selecionarMusica();

    void exibirPagina(String nomeDaPagina);

    void adicionarNovaAba();

    void atualizarPagina(String nomeDaPagina);
}
