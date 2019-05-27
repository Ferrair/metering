package com.adc.metering.bean;

public class DescriptionOfTestCapacity {
    private String standardRevision;
    private String research;
    private String otherDes;

    public DescriptionOfTestCapacity(String standardRevision, String research, String otherDes) {
        this.standardRevision = standardRevision;
        this.research = research;
        this.otherDes = otherDes;
    }

    public String getStandardRevision() {
        return standardRevision;
    }

    public void setStandardRevision(String standardRevision) {
        this.standardRevision = standardRevision;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    public String getOtherDes() {
        return otherDes;
    }

    public void setOtherDes(String otherDes) {
        this.otherDes = otherDes;
    }
}
