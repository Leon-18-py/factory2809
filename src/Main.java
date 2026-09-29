import factory.*;

public class Main {
    public static void main(String[] args){
        Notificacao email = new FactoryEmail().create();
        Notificacao push = new FactoryPush().create();
        Notificacao sms = new FactorySMS().create();


        email.EnviarMensagem();
        push.EnviarMensagem();
        sms.EnviarMensagem();
    }
}
