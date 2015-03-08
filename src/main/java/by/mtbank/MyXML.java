package by.mtbank;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyXML {
    public int id;
    public String name;

    public MyXML() {
    }

    public MyXML(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
