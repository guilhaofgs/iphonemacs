public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Reprodutor Musical
    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada");
    }

    // Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void finalizarChamada() {
        System.out.println("Chamada finalizada");
    }

    // Navegador de Internet
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Página fechada");
    }

    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        // Testando músicas
        meuIPhone.tocarMusica("Shape of You");
        meuIPhone.pausarMusica();
        meuIPhone.pararMusica();

        // Testando chamadas
        meuIPhone.ligar("11999999999");
        meuIPhone.atender();
        meuIPhone.finalizarChamada();

        // Testando navegador
        meuIPhone.abrirPagina("https://www.apple.com");
        meuIPhone.atualizarPagina();
        meuIPhone.fecharPagina();
    }
}
