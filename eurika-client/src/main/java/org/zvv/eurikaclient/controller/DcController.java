package org.zvv.eurikaclient.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Zvv ON 2019/4/26
 */
@RestController
public class DcController {

    @Resource
    EurekaDiscoveryClient discoveryClient;

    @GetMapping("/dc")
    String dc(){
        String str = "Service:" + discoveryClient.getServices().toString();
        return str;
    }
}
