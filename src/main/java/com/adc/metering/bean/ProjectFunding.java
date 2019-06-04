package com.adc.metering.bean;

public class ProjectFunding {
    private int feeOfSample;
    private int feeOfTest;
    private int feeOfExpert;
    private String  otherFee;

    public ProjectFunding(int feeOfSample, int feeOfTest, int feeOfExpert, String  otherFee) {
        this.feeOfSample = feeOfSample;
        this.feeOfTest = feeOfTest;
        this.feeOfExpert = feeOfExpert;
        this.otherFee = otherFee;
    }

    public int getFeeOfSample() {
        return feeOfSample;
    }

    public void setFeeOfSample(int feeOfSample) {
        this.feeOfSample = feeOfSample;
    }

    public int getFeeOfTest() {
        return feeOfTest;
    }

    public void setFeeOfTest(int feeOfTest) {
        this.feeOfTest = feeOfTest;
    }

    public int getFeeOfExpert() {
        return feeOfExpert;
    }

    public void setFeeOfExpert(int feeOfExpert) {
        this.feeOfExpert = feeOfExpert;
    }

    public String getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(String  otherFee) {
        this.otherFee = otherFee;
    }
}
