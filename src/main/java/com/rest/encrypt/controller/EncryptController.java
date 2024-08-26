package com.rest.encrypt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.encrypt.model.EncryptModel;
import com.rest.encrypt.service.EncryptJSON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/")
public class EncryptController {

    @Autowired
    EncryptJSON encryptJSON;

    @PostMapping("encrypt")
    public EncryptModel encryptController(@RequestBody EncryptModel model) {

        EncryptJSON encryptJSON = new EncryptJSON();

        return encryptJSON.encrypt(model);
    }
    
}
