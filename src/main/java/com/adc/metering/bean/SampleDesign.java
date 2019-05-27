package com.adc.metering.bean;

public class SampleDesign {
    private String sampleName;
    private String sampleTraits;
    private String samplePreparation;
    private String sampleConcentration;
    private String methodOfUniformity;
    private String methodOfStability;
    private String methodOfStorage;
    private String methodOfTransport;
    private String methodOfHandover;
    private String otherOfSample;

    public SampleDesign(String sampleName, String sampleTraits, String samplePreparation, String sampleConcentration, String methodOfUniformity, String methodOfStability, String methodOfStorage, String methodOfTransport, String methodOfHandover, String otherOfSample) {
        this.sampleName = sampleName;
        this.sampleTraits = sampleTraits;
        this.samplePreparation = samplePreparation;
        this.sampleConcentration = sampleConcentration;
        this.methodOfUniformity = methodOfUniformity;
        this.methodOfStability = methodOfStability;
        this.methodOfStorage = methodOfStorage;
        this.methodOfTransport = methodOfTransport;
        this.methodOfHandover = methodOfHandover;
        this.otherOfSample = otherOfSample;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public String getSampleTraits() {
        return sampleTraits;
    }

    public void setSampleTraits(String sampleTraits) {
        this.sampleTraits = sampleTraits;
    }

    public String getSamplePreparation() {
        return samplePreparation;
    }

    public void setSamplePreparation(String samplePreparation) {
        this.samplePreparation = samplePreparation;
    }

    public String getSampleConcentration() {
        return sampleConcentration;
    }

    public void setSampleConcentration(String sampleConcentration) {
        this.sampleConcentration = sampleConcentration;
    }

    public String getMethodOfUniformity() {
        return methodOfUniformity;
    }

    public void setMethodOfUniformity(String methodOfUniformity) {
        this.methodOfUniformity = methodOfUniformity;
    }

    public String getMethodOfStability() {
        return methodOfStability;
    }

    public void setMethodOfStability(String methodOfStability) {
        this.methodOfStability = methodOfStability;
    }

    public String getMethodOfStorage() {
        return methodOfStorage;
    }

    public void setMethodOfStorage(String methodOfStorage) {
        this.methodOfStorage = methodOfStorage;
    }

    public String getMethodOfTransport() {
        return methodOfTransport;
    }

    public void setMethodOfTransport(String methodOfTransport) {
        this.methodOfTransport = methodOfTransport;
    }

    public String getMethodOfHandover() {
        return methodOfHandover;
    }

    public void setMethodOfHandover(String methodOfHandover) {
        this.methodOfHandover = methodOfHandover;
    }

    public String getOtherOfSample() {
        return otherOfSample;
    }

    public void setOtherOfSample(String otherOfSample) {
        this.otherOfSample = otherOfSample;
    }
}
