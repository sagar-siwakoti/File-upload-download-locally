package com.file.upload.message;

/*
 * @created 05/12/2020-4:37 PM
 * @project file
 * @author Sagar Siwakoti
 */
public class ResponseMessage {
    private String message;

    public ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}