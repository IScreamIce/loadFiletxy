package daomu.kaige123.com.loadtxyun.cases;

import com.qcloud.cos.model.GetObjectRequest;
import com.qcloud.cos.model.ObjectMetadata;
import daomu.kaige123.com.loadtxyun.config.config;

import java.io.File;

public class deleteFile {

    public void delete() {
        // 指定要下载到的本地路径
        File downFile = new File("/iscreamVideo.mp4");
        // 指定要删除的 bucket(桶) 和对象键(桶中key)
        config.cosClient.deleteObject(config.bucketName, "iscreamVideo.mp4");
    }

}
