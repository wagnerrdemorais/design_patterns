package creational.factory_method.message;


public abstract class Message {

    StringBuilder content = new StringBuilder();

    public abstract String getContent();

    public void addDefaultHeaders() {
        content.append("{Default header}");
    }

    public void encrypt() {
        content.append("{Default Encryption}");
    }
}
