package creational.factory_method.message;

public class TextMessage extends Message {

    @Override
    public String getContent() {
        return content.append(" SomeText ").toString();
    }

    @Override
    public void encrypt() {
        content.append(" - Text encrypted");
    }
}
