import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new SMS());
        notificacoes.add(new WhatsApp());

        for (Notificacao n : notificacoes) {
            System.out.println();
            n.enviarMensagem();
        }

    }
}
