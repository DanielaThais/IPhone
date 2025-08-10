public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    public static void main(String[] args) {

        IPhone iphone = new IPhone();
        iphone.ligar("11 11111-1111");
        iphone.selecionarMusica("War Pigs - Black Sabbath");
        iphone.fazerBackup("IPhone 15 Pro", "IOS 18");
        iphone.instalarApp();

    }

    String modelo;
    String versaoIOS;

    @Override
    public boolean ligar(String numero){
        System.out.println("\n\n******FAZENDO LIGAÇÃO*****\n" +
                "Ligando para: " + numero);
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
        System.out.println("\n\n******ESCOLHENDO MÚSICA*****\n" +
                "Selecionando a música: " + musica);
    }

    @Override
    public boolean adicionarNovaAba(){
        return false;
    }

    @Override
    public boolean atualizarPagina(){
        return false;
    }

    public void fazerBackup(String modelo, String versaoIOS){
        System.out.println("\n\n******FAZENDO BACKUP*****\n" +
                "Fazendo backup do " + modelo
                + ", com o IOS: " + versaoIOS);
    }

    public void instalarApp(){
        System.out.println("\n\n******INSTALANDO APP*****\n" +
                "Procurando opções...\n" +
                "Selecionando...\n"+
                "Baixando...\n"+
                "Instalado e pronto para usar!");
    }
}
