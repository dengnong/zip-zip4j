package demo;


import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

/**
 * Created by 54472 on 2017/10/19.
 */
public class AddFolderToZip {
    public AddFolderToZip(String sourceFolder, String zipPath) {
        try {
            ZipFile zipFile = new ZipFile(zipPath);
            String folder = sourceFolder;
            ZipParameters parameters = new ZipParameters();
            parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
            parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
            zipFile.addFolder(sourceFolder, parameters);

        } catch (ZipException e) {
            e.printStackTrace();
        }
    }
}
