import factory.*;

public class Main {
    public static void main(String[] args){
        Notificacao notificacao = new FactoryEmail().create();

        notificacao.EnviarMensagem();
    }
}
