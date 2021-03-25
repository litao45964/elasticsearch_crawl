package com.fenbeitong;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version V1.0
 * @Description: es客户端创建实例，交给spring 容器管理
 * @Auther: litao
 * @Date: 2021/3/24 14:57
 */
@Configuration
public class ElasticSearchClientConfig {

    @Bean
    public RestHighLevelClient restHighLevelClient() {
        RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(
                new HttpHost("127.0.0.1", 9200, "http")));
        return client;
    }
}