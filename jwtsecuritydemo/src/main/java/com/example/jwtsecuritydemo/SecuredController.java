package com.example.jwtsecuritydemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SecuredController {

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/secure-data")
    public String secureData() {
        return "Access granted to admin user!";
    }
}