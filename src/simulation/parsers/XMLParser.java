package simulation.parsers;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import simulation.usine.Usine;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class XMLParser implements FileParser {

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

            Element rootElement = doc.getDocumentElement();

            NodeList nodeList = rootElement.getChildNodes();

            for(int i=0;i<nodeList.getLength();i++){

                Node node = nodeList.item(i);

                if(node.getNodeType() == Node.ELEMENT_NODE){
                    if(node.getNodeName() == "metadonnees"){

                        Element element = (Element) node;

                        NodeList usineList = element.getElementsByTagName("usine");

                        for(int j=0; j<usineList.getLength(); j++){

                            Node usineNode = usineList.item(j);

                            if(usineNode.getNodeType() == Node.ELEMENT_NODE) {
                                
                                Element elementIcones = (Element) usineNode;
                                
                                NodeList iconesList = elementIcones.getElementsByTagName("icones");

                                for (int k= 0; k<iconesList.getLength();k++) {

                                    Node iconesNode = iconesList.item(k);

                                    if(iconesNode.getNodeType() == Node.ELEMENT_NODE) {

                                        Element elementIcone = (Element) iconesNode;

                                        NodeList iconeList = elementIcone.getElementsByTagName("icone");

                                        System.out.println(iconeList.getLength());


                                    }

                                }
                                
                            }
                        }

                    }
                }

            }


            NodeList nList = doc.getElementsByTagName("metadonnees");

            Node node = nList.item(0);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Usine> parseUsineList(){
        ArrayList<Usine> usineList = new ArrayList<>();

        return usineList;
    }

    public String getInputFile() {
        return inputFile.getAbsolutePath();
    }

    @Override
    public void serialize(String inputFilePath) {

    }

    @Override
    public void deserialize(String outputFilePath) {

    }
}
