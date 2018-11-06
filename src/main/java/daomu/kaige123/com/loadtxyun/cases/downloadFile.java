package daomu.kaige123.com.loadtxyun.cases;

import com.qcloud.cos.model.GetObjectRequest;
import com.qcloud.cos.model.ObjectMetadata;

import java.io.File;
import daomu.kaige123.com.loadtxyun.config.config;

public class downloadFile {

    public void download(){
        // 指定要下载到的本地路径
        File downFile = new File("/iscreamVideo.mp4");
        // 指定要下载的文件所在的 bucket 和对象键
        GetObjectRequest getObjectRequest = new GetObjectRequest(config.bucketName,"iscreamVideo.mp4");
        ObjectMetadata downObjectMeta = config.cosClient.getObject(getObjectRequest, downFile);
    }

}
