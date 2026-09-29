package factory;

public class SMS implements Notificacao {
    @Override
    public void EnviarMensagem() {
        System.out.println("Enviando SMS");
    }
}
