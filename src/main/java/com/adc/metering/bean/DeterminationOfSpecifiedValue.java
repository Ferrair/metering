package com.adc.metering.bean;

public class DeterminationOfSpecifiedValue {
    private String knownValue;
    private String referenceValueOfCertified;
    private String referenceValue;
    private String publicValueOfExpert;
    private String publicValueOfParticipant;
    private String otherValue;

    public DeterminationOfSpecifiedValue(String knownValue, String referenceValueOfCertified, String referenceValue, String publicValueOfExpert, String publicValueOfParticipant, String otherValue) {
        this.knownValue = knownValue;
        this.referenceValueOfCertified = referenceValueOfCertified;
        this.referenceValue = referenceValue;
        this.publicValueOfExpert = publicValueOfExpert;
        this.publicValueOfParticipant = publicValueOfParticipant;
        this.otherValue = otherValue;
    }

    public String getKnownValue() {
        return knownValue;
    }

    public void setKnownValue(String knownValue) {
        this.knownValue = knownValue;
    }

    public String getReferenceValueOfCertified() {
        return referenceValueOfCertified;
    }

    public void setReferenceValueOfCertified(String referenceValueOfCertified) {
        this.referenceValueOfCertified = referenceValueOfCertified;
    }

    public String getReferenceValue() {
        return referenceValue;
    }

    public void setReferenceValue(String referenceValue) {
        this.referenceValue = referenceValue;
    }

    public String getPublicValueOfExpert() {
        return publicValueOfExpert;
    }

    public void setPublicValueOfExpert(String publicValueOfExpert) {
        this.publicValueOfExpert = publicValueOfExpert;
    }

    public String getPublicValueOfParticipant() {
        return publicValueOfParticipant;
    }

    public void setPublicValueOfParticipant(String publicValueOfParticipant) {
        this.publicValueOfParticipant = publicValueOfParticipant;
    }

    public String getOtherValue() {
        return otherValue;
    }

    public void setOtherValue(String otherValue) {
        this.otherValue = otherValue;
    }
}
