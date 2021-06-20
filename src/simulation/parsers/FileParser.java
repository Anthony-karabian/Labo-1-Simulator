package simulation.parsers;

import java.io.File;

public interface FileParser {

    public void serialize(String inputFilePath);

    public void deserialize(String outputFilePath);
}
