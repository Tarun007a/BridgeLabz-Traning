package com.functionalinterfaces.passwordstrengthvalidator;

public class PasswordValidator {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrong("password123"));
        System.out.println(SecurityUtils.isStrong("pass"));
    }
}

