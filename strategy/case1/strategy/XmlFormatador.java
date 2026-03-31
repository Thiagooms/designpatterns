package case1.strategy;

import java.util.List;

public class XmlFormatador implements FormatadorDados {

    @Override
    public String formatar(List<String> dados) {
        StringBuilder payload = new StringBuilder("<dados>");
        for (String d : dados) {
            payload.append("<item>").append(d).append("</item>");
        }
        payload.append("</dados>");
        return payload.toString();
    }
}
