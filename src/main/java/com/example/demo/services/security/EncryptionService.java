package com.example.demo.services.security;

/**
 * Created by Cosmin on 12/10/2017.
 */
public interface EncryptionService {
    String encryptString(String input);
    boolean checkPassword(String plainPassword, String encryptedPassword);
}
