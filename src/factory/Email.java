package factory;

public class Email implements Notificacao {

    @Override
    public void EnviarMensagem() {
        System.out.println("Enviando email");
    }
}
