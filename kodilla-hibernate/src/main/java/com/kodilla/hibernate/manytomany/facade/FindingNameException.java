package com.kodilla.hibernate.manytomany.facade;

public class FindingNameException extends Exception {

    public static String ERR_FIND = "Cannot find this name";

    public FindingNameException(String message) {
        super(message);
    }
}
