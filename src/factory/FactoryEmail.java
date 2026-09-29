package factory;

public class FactoryEmail extends FactoryNotificacao{
    @Override
    public Notificacao create(){
        return new Email();
    }
}
