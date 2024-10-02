//Hecho por prof. José Chirú

package DBConexion;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class LeerXml {
    private String serverName, dbName, puerto, usuario, pass;

    public String getServerName() {
        return serverName;
    }

    public String getDbName() {
        return dbName;
    }

    public String getPuerto() {
        return puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPass() {
        return pass;
    }

    public void datosXML () throws ParserConfigurationException, IOException, SAXException {
        // Crear una instancia de DocumentBuilderFactory para obtener un DocumentBuilder
        DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
        // Crear un DocumentBuilder
        DocumentBuilder builder = factory.newDocumentBuilder();
        // Parsear el archivo XML "conexion.xml" y obtener un objeto Document
        Document documento = builder.parse(new File("Archivos/conexion.xml"));
        // Crear un decodificador Base64
        Base64.Decoder decoder= Base64.getUrlDecoder();
        // Obtener y decodificar el contenido del elemento <serverName> del XML
        serverName = new String(decoder.decode(documento.getElementsByTagName("serverName").item(0).getTextContent()));
        // Obtener y decodificar el contenido del elemento <dbName> del XML
        dbName = new String(decoder.decode(documento.getElementsByTagName("dbName").item(0).getTextContent()));
        // Obtener y decodificar el contenido del elemento <puerto> del XML
        puerto = new String(decoder.decode(documento.getElementsByTagName("puerto").item(0).getTextContent()));
        // Obtener y decodificar el contenido del elemento <usuario> del XML
        usuario = new String(decoder.decode(documento.getElementsByTagName("usuario").item(0).getTextContent()));
        // Obtener y decodificar el contenido del elemento <pass> del XML
        pass = new String(decoder.decode(documento.getElementsByTagName("pass").item(0).getTextContent()));
    }
}
