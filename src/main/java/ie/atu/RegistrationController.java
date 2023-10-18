package ie.atu;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("/confirm")
    public String regsiterUser(@RequestBody UserDetails uD) {
        return String.format("Name: %s, Email: %s", uD.getName(), uD.getEmail());
    }

}
