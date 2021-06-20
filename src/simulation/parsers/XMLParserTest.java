package simulation.parsers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XMLParserTest {

    private static final String CONFIG_FILE_PATH = "/Users/anthonykarabian/Desktop/ETS/LOG121/Log121 Labo1/src/ressources/configuration.xml";
    private static final String CONFIG_FILE = "configuration.xml";

    private File selectedFile;

    private XMLParser xmlParser;

    private Path configPath;

    @BeforeEach
    public void setup(@TempDir Path tempDir) {

            //configPath = tempDir.resolve(CONFIG_FILE_PATH);

            selectedFile = new File(CONFIG_FILE_PATH);

            xmlParser = new XMLParser(selectedFile);
    }

    @Test
    public void testInputFile(){

        String expectedFileInput = configPath.toString();

        assertEquals(expectedFileInput, xmlParser.getInputFile());
    }

    @Test
    public void deserializeFile(){

        xmlParser.parseFile();
    }

    public void testJbRainsbergerUsingEntireDocument()
            throws Exception {

        String expectedXmlDocument =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                        + "<configuration>"
                        + "<metadonnees>"
                        + "<usine type=\"usine-matiere\">"
                        + "<icones>"
                        + "<icone type=\"vide\" path=\"src/ressources/UMP0%.png\"/>"
                        + "<icone type=\"un-tiers\" path=\"src/ressources/UMP33%.png\"/>"
                        + "<icone type=\"deux-tiers\" path=\"src/ressources/UMP66%.png\"/>"
                        + "<icone type=\"plein\" path=\"src/ressources/UMP100%.png\"/>"
                        + "</icones>"
                        + "<sortie type = \"metal\" />"
                        + "<interval-production>100</interval-production>"
                        + "</usine>"
                        + "</metadonnees>"
                        + "<simulation>"
                        + "</simulation>"
                        + "</configuration>";

    }

}