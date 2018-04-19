package com.melt.spring.boot.helloword.feign;

import com.melt.spring.boot.helloword.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author melt
 * @since 2018/4/11 16:04
 */
@FeignClient(name = "cloud-provider")
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/provider/getUserById/{userId}")
    User getUserById(@PathVariable("userId") Integer userId);

    @RequestMapping(value = "/provider/postUser", method = RequestMethod.POST)
    User postUser(@RequestBody User user);

}
