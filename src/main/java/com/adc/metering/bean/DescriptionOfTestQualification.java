package com.adc.metering.bean;

public class DescriptionOfTestQualification {

    private String recognitionOfUnitTestProject;
    private String recognitionOfUnit;
    private String recognitionOfProject;
    private String recognitionOfParameters;
    private String relatedUnitOfProject;
    private String relatedUnitOfInternational;
    private String otherTestDes;

    public DescriptionOfTestQualification(String recognitionOfUnitTestProject, String recognitionOfUnit, String recognitionOfProject, String recognitionOfParameters, String relatedUnitOfProject, String relatedUnitOfInternational, String otherTestDes) {
        this.recognitionOfUnitTestProject = recognitionOfUnitTestProject;
        this.recognitionOfUnit = recognitionOfUnit;
        this.recognitionOfProject = recognitionOfProject;
        this.recognitionOfParameters = recognitionOfParameters;
        this.relatedUnitOfProject = relatedUnitOfProject;
        this.relatedUnitOfInternational = relatedUnitOfInternational;
        this.otherTestDes = otherTestDes;
    }

    public String getRecognitionOfUnitTestProject() {
        return recognitionOfUnitTestProject;
    }

    public void setRecognitionOfUnitTestProject(String recognitionOfUnitTestProject) {
        this.recognitionOfUnitTestProject = recognitionOfUnitTestProject;
    }

    public String getRecognitionOfUnit() {
        return recognitionOfUnit;
    }

    public void setRecognitionOfUnit(String recognitionOfUnit) {
        this.recognitionOfUnit = recognitionOfUnit;
    }

    public String getRecognitionOfProject() {
        return recognitionOfProject;
    }

    public void setRecognitionOfProject(String recognitionOfProject) {
        this.recognitionOfProject = recognitionOfProject;
    }

    public String getRecognitionOfParameters() {
        return recognitionOfParameters;
    }

    public void setRecognitionOfParameters(String recognitionOfParameters) {
        this.recognitionOfParameters = recognitionOfParameters;
    }

    public String getRelatedUnitOfProject() {
        return relatedUnitOfProject;
    }

    public void setRelatedUnitOfProject(String relatedUnitOfProject) {
        this.relatedUnitOfProject = relatedUnitOfProject;
    }

    public String getRelatedUnitOfInternational() {
        return relatedUnitOfInternational;
    }

    public void setRelatedUnitOfInternational(String relatedUnitOfInternational) {
        this.relatedUnitOfInternational = relatedUnitOfInternational;
    }

    public String getOtherTestDes() {
        return otherTestDes;
    }

    public void setOtherTestDes(String otherTestDes) {
        this.otherTestDes = otherTestDes;
    }
}

