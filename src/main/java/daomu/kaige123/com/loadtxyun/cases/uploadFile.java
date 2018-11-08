package daomu.kaige123.com.loadtxyun.cases;

import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import daomu.kaige123.com.loadtxyun.config.config;

import java.io.File;
import java.util.Date;

public class uploadFile {

    public void load() {
        // 简单文件上传, 最大支持 5 GB, 适用于小文件上传, 建议 20M以下的文件使用该接口
        // 大文件上传请参照 API 文档高级 API 上传
        File localFile = new File("C:\\Users\\Administrator\\Desktop\\video.mp4");
        // 指定要上传到 COS 上对象键
        // 对象键（Key）是对象在存储桶中的唯一标识。例如，在对象的访问域名 `bucket1-1250000000.cos.ap-guangzhou.myqcloud.com/doc1/pic1.jpg` 中，对象键为 doc1/pic1.jpg, 详情参考 [对象键](https://cloud.tencent.com/document/product/436/13324)
        // key在桶中的唯一标识,这里直接是文件名
        String key = "iscreamVideo.mp4";

        //文件桶,桶中的要定的key,文件
        PutObjectRequest putObjectRequest = new PutObjectRequest(config.bucketName, key, localFile);
        PutObjectResult putObjectResult = config.cosClient.putObject(putObjectRequest);

        //文件上传到云服务器后，获得文件的URL
        Date expiration = new Date(new Date().getTime() + 3600l * 1000 * 24 * 365 * 10);
        String url = config.cosClient.generatePresignedUrl(config.bucketName, key, expiration).toString();
        System.out.println(url);
        
        //最后得到URL(可下载)：http://iscream-1255662981.cos.ap-chengdu.myqcloud.com/iscreamVideo.mp4?sign=q
        //-sign-algorithm%3Dsha1%26q-ak%3DAKIDvERSIwC6OVTGtKFomYuRofxFNJZlZdIm%26q-sign-time%3D1541658398%3B1857018398%26q-
        //key-time%3D1541658398%3B1857018398%26q-
        //header-list%3D%26q-url-param-list%3D%26q-signature%3D0982cc709c108cd99d074404f8c2c645410b6afb
    }

}
