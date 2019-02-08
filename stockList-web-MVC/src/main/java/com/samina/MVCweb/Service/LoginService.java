package com.samina.MVCweb.Service;
import org.springframework.stereotype.Component;

@Component
public class LoginService {
    public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("samina") && password.equals("samina");
    }
}
