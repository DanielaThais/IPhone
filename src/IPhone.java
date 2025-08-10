public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    public static void main(String[] args) {

        IPhone iphone = new IPhone();
        iphone.ligar("11 11111-1111");
        iphone.selecionarMusica("War Pigs - Black Sabbath");

    }

    @Override
    public boolean ligar(String numero){
        System.out.println("Ligando para: " + numero);
        return true;
    }

    public boolean atender(){
        return true;
    }

    @Override
    public boolean iniciarCorreioVoz() {
        return false;
    }

    @Override
    public boolean tocar() {
        return true;
    }

    @Override
    public boolean pausar(){
        return false;
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Escolhendo a música: " + musica);
    }

    @Override
    public boolean adicionarNovaAba(){
        return false;
    }

    @Override
    public boolean atualizarPagina(){
        return false;
    }
}
