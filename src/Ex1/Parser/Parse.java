package Ex1.Parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;

public class Parse {
    public static void parse(File file) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;

            dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            XPath xpath =  XPathFactory.newInstance().newXPath();
            NodeList nodes = (NodeList) xpath.compile("//periodical").evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                System.out.println("\n" + node.getNodeName() + " " + (i + 1));
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Title : " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Type : " + element.getElementsByTagName("type").item(0).getTextContent());
                    String yesno = element.getElementsByTagName("isColor").item(0).getTextContent().equals("true") ? "yes" : "no";
                    System.out.println("Color : " + yesno);
                    yesno = element.getElementsByTagName("isGloss").item(0).getTextContent().equals("true") ? "yes" : "no";
                    System.out.println("Gloss : " + yesno);
                    System.out.println("Pages : " + element.getElementsByTagName("pages").item(0).getTextContent());
                    System.out.println("Index : " + element.getElementsByTagName("index").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
