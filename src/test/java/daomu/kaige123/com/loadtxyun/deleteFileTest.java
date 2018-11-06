package daomu.kaige123.com.loadtxyun;

import daomu.kaige123.com.loadtxyun.cases.deleteFile;
import daomu.kaige123.com.loadtxyun.cases.uploadFile;
import org.junit.Test;

public class deleteFileTest {

    @Test
    public void load(){
        deleteFile uploadFile=new deleteFile();
        uploadFile.delete();
    }

}
