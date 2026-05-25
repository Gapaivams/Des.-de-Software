public class Email implements Notificacao {
    @Override
    public void enviarMensagem(){
        System.out.printf("Mensagem de E-Mail enviada!");
    }
}
