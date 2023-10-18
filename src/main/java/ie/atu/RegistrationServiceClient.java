package ie.atu;

import org.apache.catalina.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="registration-service", url="http://localhost:8083")
public interface RegistrationServiceClient {
    @PostMapping("/register")
    String moreDetails(@RequestBody UserDetails userDetails);
}
