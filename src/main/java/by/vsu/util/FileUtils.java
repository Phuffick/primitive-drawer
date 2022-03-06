package by.vsu.util;

import by.vsu.exception.ExtensionNotFoundException;

public class FileUtils {

    private FileUtils() {
    }

    public static String getExtension(String filename) {
        if (filename == null) {
            throw new ExtensionNotFoundException("Filename if empty");
        }

        int extensionPoint = filename.lastIndexOf('.');

        if (extensionPoint == -1 || extensionPoint + 1 >= filename.length()) {
            throw new ExtensionNotFoundException(String.format("Extension isn't found in filename: %s", filename));
        }

        return filename.substring(extensionPoint + 1);
    }

}
