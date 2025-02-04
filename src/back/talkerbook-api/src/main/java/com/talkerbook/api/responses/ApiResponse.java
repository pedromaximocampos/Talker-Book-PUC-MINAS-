package com.talkerbook.api.responses;

import java.util.List;

public class ApiResponse<T> {
    private boolean error;
    private String message;
    private List<T> data;

    public ApiResponse(boolean error, String message, List<T> data) {
        this.error = error;
        this.message = message;
        this.data = data;
    }

    public boolean isError() { return error; }

    public void setError(boolean error) { this.error = error; }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
