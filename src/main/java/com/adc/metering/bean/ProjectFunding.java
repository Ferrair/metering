package com.adc.metering.bean;

public class ProjectFunding {
    private String feeOfSample;
    private String feeOfTest;
    private String feeOfExpert;
    private String otherFee;

    public ProjectFunding(String feeOfSample, String feeOfTest, String feeOfExpert, String otherFee) {
        this.feeOfSample = feeOfSample;
        this.feeOfTest = feeOfTest;
        this.feeOfExpert = feeOfExpert;
        this.otherFee = otherFee;
    }

    public String getFeeOfSample() {
        return feeOfSample;
    }

    public void setFeeOfSample(String feeOfSample) {
        this.feeOfSample = feeOfSample;
    }

    public String getFeeOfTest() {
        return feeOfTest;
    }

    public void setFeeOfTest(String feeOfTest) {
        this.feeOfTest = feeOfTest;
    }

    public String getFeeOfExpert() {
        return feeOfExpert;
    }

    public void setFeeOfExpert(String feeOfExpert) {
        this.feeOfExpert = feeOfExpert;
    }

    public String getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(String otherFee) {
        this.otherFee = otherFee;
    }
}
