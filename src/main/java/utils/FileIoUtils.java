package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import webserver.RequestHandler;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIoUtils {
    private static final Logger logger = LoggerFactory.getLogger(FileIoUtils.class);
    public static byte[] loadFileFromClasspath(String filePath) {
        try {
            logger.debug("FILEPATH:"+filePath);
            Path path = Paths.get(FileIoUtils.class.getClassLoader().getResource(filePath).toURI());
            return Files.readAllBytes(path);
        }catch (Exception e){
            return new byte[0];
        }

    }
}
