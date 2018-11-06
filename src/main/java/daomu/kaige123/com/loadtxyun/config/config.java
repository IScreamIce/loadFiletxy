package daomu.kaige123.com.loadtxyun.config;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.region.Region;

public class config {

    // 1 初始化用户身份信息(secretId, secretKey)
    public static COSCredentials cred = new BasicCOSCredentials("AKIDvERSIwC6OVTGtKFomYuRofxFNJZl****", "Mf0Oj0LVfsGT9i7KMJ4hBWsDwZCy****");

    // 2 设置bucket的区域, COS地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
    // clientConfig中包含了设置region, https(默认http), 超时, 代理等set方法, 使用可参见源码或者接口文档FAQ中说明
    public static ClientConfig clientConfig = new ClientConfig(new Region("ap-chengdu"));

    // 3 生成cos客户端,(对外提供的实现类)
    public static COSClient cosClient = new COSClient(cred, clientConfig);

    // bucket的命名规则为{name}-{appid} ，此处填写的存储桶名称必须为此格式
    // appid为API的分配,name是对象存储中创建的存储桶,比如创建存储桶名称iscream,得到iscream-1255662981(编号)
    public static String bucketName = "iscream-125566****";

}
