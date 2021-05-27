package simulation;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLParser {

    private File inputFile;

    public XMLParser(File inputFile) {

        this.inputFile = inputFile;
    }

    public void parseFile(){

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("configuration");
            System.out.println("----------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getInputFile() {
        return inputFile.getAbsolutePath();
    }
}
