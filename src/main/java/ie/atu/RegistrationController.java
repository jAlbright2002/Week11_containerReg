package ie.atu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RegistrationController {


    private RegistrationServiceClient registrationServiceClient;

    @Autowired
    public RegistrationController(RegistrationServiceClient registrationServiceClient) {
        this.registrationServiceClient = registrationServiceClient;
    }

    @PostMapping("/confirm")
    public String registerUser (@RequestBody UserDetails userDetails) {
        String register = registrationServiceClient.moreDetails(userDetails);
        return register;

    }

}
