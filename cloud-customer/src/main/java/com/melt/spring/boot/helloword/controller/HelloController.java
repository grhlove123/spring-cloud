package com.melt.spring.boot.helloword.controller;

import com.melt.spring.boot.helloword.entity.User;
import com.melt.spring.boot.helloword.feign.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author melt
 * @create 2018/4/9 15:10
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient ;


    @GetMapping("/getUserById/{id}")
    @ResponseBody
    public User getUserById(@PathVariable Integer id){
        System.out.println(id);
        return userClient.getUserById(id) ;
//        return restTemplate.getForEntity("http://CLOUD-PROVIDER/provider/getUserById/" + id,User.class).getBody() ;
    }

    @GetMapping("/serviceUrl")
    @ResponseBody
    public List<ServiceInstance> serviceUrl(){
        List<ServiceInstance> localServiceInstance = this.discoveryClient.getInstances("CLOUD-PROVIDER") ;
        return localServiceInstance;
    }
}
