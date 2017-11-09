package demo;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

import java.io.File;

/**
 * Created by 54472 on 2017/10/19.
 */
public class AddFileToZip {
    public AddFileToZip(String sourceFile, String zipPath) {
        try {
            ZipFile zipFile = new ZipFile(zipPath);
            File file = new File(sourceFile);
            ZipParameters parameters = new ZipParameters();
            parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
            parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
            zipFile.addFile(file, parameters);

        } catch (ZipException e) {
            e.printStackTrace();
        }
    }
}
