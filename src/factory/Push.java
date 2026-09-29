package factory;

public class Push implements Notificacao {
    @Override
    public void EnviarMensagem() {
        System.out.println("Enviando push");
    }
}
