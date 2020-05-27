package com.emersysrd.emerduty;

import com.ruoyi.common.security.annotation.EnableCustomConfig;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import com.ruoyi.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 应急值守
 *
 * @auther kim
 * @create 2020-05-25 16:10
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class EmerDutyApplication {

    public static void main(String[] args) {
        SpringApplication.run( EmerDutyApplication.class,args);

        System.out.println("(♥◠‿◠)ﾉﾞ  应急值守模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  ____   _____   ___________        \n" +
                "_/ __ \\ /     \\_/ __ \\_  __ \\   \n" +
                "\\  ___/|  Y Y  \\  ___/|  | \\/    \n" +
                " \\___  >__|_|  /\\___  >__|        \n" +
                "     \\/      \\/     \\/          ");
    }
}
