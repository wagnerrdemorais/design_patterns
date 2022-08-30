package creational.factory_method.message;

public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return content.append(" {\"JSON]\":[]} ").toString();
    }

    @Override
    public void addDefaultHeaders() {
        content.append("JSON Header - ");
    }
}
