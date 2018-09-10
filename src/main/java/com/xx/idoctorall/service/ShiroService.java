package com.xx.idoctorall.service;

import org.springframework.stereotype.Service;

@Service
public class ShiroService {

    public String getPasswordByUsername(String username){
        switch (username){
            case "liming":
                return "123";
            case "hanli":
                return "456";
            default:
                return null;
        }
    }
}