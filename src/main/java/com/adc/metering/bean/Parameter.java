package com.adc.metering.bean;

public class Parameter {
    private String parameterName;
    private String parameterDetectMethod;

    public Parameter(String parameterName, String parameterDetectMethod) {
        this.parameterName = parameterName;
        this.parameterDetectMethod = parameterDetectMethod;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterDetectMethod() {
        return parameterDetectMethod;
    }

    public void setParameterDetectMethod(String parameterDetectMethod) {
        this.parameterDetectMethod = parameterDetectMethod;
    }
}
