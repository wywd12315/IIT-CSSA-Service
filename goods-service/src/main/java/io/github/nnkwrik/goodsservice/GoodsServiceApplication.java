package io.github.nnkwrik.goodsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"io.github.nnkwrik", "fangxianyu.innerApi.user", "fangxianyu.innerApi.im"})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"fangxianyu.innerApi.user", "fangxianyu.innerApi.im"})
public class GoodsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsServiceApplication.class, args);
    }
}
