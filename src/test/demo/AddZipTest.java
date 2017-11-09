package test.demo; 

import demo.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* AddFileToZip Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®ÔÂ 19, 2017</pre> 
* @version 1.0 
*/ 
public class AddZipTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: AddFileZip() 
* 
*/ 
@Test
public void testAddFileZip() throws Exception { 
//TODO: Test goes here...
    AddFileToZip addFileToZip = new AddFileToZip("src\\testfile.txt", "src\\testfilezip.zip");
}

@Test
public void testAddFolderZip() throws Exception {
    AddFolderToZip addFolderToZip = new AddFolderToZip("src\\testfolder", "src\\tesfoldertzip.zip");
}

@Test
public void testAddFileToZipWithKey() throws Exception {
    AddFileToZipWithKey addFileToZipWithKey = new AddFileToZipWithKey("src\\testfile.txt", "src\\testzipwithkey.zip", "123456");
}

@Test
public void testAddSplitZip() throws Exception {
    AddSplitZip addSplitZip = new AddSplitZip("src\\image.png", "src\\splitzip.zip");
}

@Test
public void testUnZip() throws Exception {
    UnZip unZip = new UnZip("src\\testzipwithkey.zip", "src\\UnZip", "123456");
}
} 
