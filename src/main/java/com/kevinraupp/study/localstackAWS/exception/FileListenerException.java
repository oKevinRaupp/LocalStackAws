package com.kevinraupp.study.localstackAWS.exception;

public class FileListenerException extends Exception {

    public FileListenerException() {
    }

    public FileListenerException(String message) {
        super(message);
    }

    public FileListenerException(Throwable cause) {
        super(cause);
    }

    public FileListenerException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileListenerException(String message, Throwable cause, boolean enableSuppression,
                                 boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}