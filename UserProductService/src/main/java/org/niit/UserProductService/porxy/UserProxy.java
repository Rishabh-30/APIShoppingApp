package org.niit.UserProductService.porxy;

import org.niit.UserProductService.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "UserAuthService", url = "localhost:8081")
public interface UserProxy {

    @PostMapping("/api/v1/register")
    ResponseEntity<?> addUser(@RequestBody User user);
}
