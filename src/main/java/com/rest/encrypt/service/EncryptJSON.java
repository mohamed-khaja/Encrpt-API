package com.rest.encrypt.service;

import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rest.encrypt.model.EncryptModel;

@Service
public class EncryptJSON {

    EncryptModel encryptedModel;

    @Value("${jasypt.encryptor.password}")
    String secret;

    public EncryptModel encrypt(EncryptModel model) {

        BasicTextEncryptor textEncrypt = new BasicTextEncryptor();
        textEncrypt.setPassword("khaja-encrypt");
        model.setAddressLine1(textEncrypt.encrypt(model.getAddressLine1()));
        model.setAadhar(textEncrypt.encrypt(model.getAadhar()));
        model.setPan(textEncrypt.encrypt(model.getPan()));
        return model;
    }
}
