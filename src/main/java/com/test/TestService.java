package com.example;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class TestService {
    public String toUpperCase(String value){
        return value.toUpperCase();
    }
}
