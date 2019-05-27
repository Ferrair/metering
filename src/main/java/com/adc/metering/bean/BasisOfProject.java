package com.adc.metering.bean;

public class BasisOfProject {
    private String importanceOfProject;
    private String feasibilityOfProject;

    public BasisOfProject(String importanceOfProject, String feasibilityOfProject) {
        this.importanceOfProject = importanceOfProject;
        this.feasibilityOfProject = feasibilityOfProject;
    }

    public String getImportanceOfProject() {
        return importanceOfProject;
    }

    public void setImportanceOfProject(String importanceOfProject) {
        this.importanceOfProject = importanceOfProject;
    }

    public String getFeasibilityOfProject() {
        return feasibilityOfProject;
    }

    public void setFeasibilityOfProject(String feasibilityOfProject) {
        this.feasibilityOfProject = feasibilityOfProject;
    }
}
