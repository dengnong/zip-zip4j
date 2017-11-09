package demo;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

/**
 * Created by 54472 on 2017/10/19.
 */
public class UnZip {
    public UnZip(String sourceZip, String filePath, String zipKey) {
        try {
            ZipFile zipFile = new ZipFile(sourceZip);
            if(zipFile.isEncrypted()) {
                zipFile.setPassword(zipKey);
            }
            zipFile.extractAll(filePath);


        } catch (ZipException e) {
            e.printStackTrace();
        }
    }
}
