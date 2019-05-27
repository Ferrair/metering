package com.adc.metering.bean;

public class TypeOfTestProgram {
    private String sequantialParticipate;
    private String synchronousParticipate;
    private String otherType;

    public TypeOfTestProgram(String sequantialParticipate, String synchronousParticipate, String otherType) {
        this.sequantialParticipate = sequantialParticipate;
        this.synchronousParticipate = synchronousParticipate;
        this.otherType = otherType;
    }

    public String getSequantialParticipate() {
        return sequantialParticipate;
    }

    public void setSequantialParticipate(String sequantialParticipate) {
        this.sequantialParticipate = sequantialParticipate;
    }

    public String getSynchronousParticipate() {
        return synchronousParticipate;
    }

    public void setSynchronousParticipate(String synchronousParticipate) {
        this.synchronousParticipate = synchronousParticipate;
    }

    public String getOtherType() {
        return otherType;
    }

    public void setOtherType(String otherType) {
        this.otherType = otherType;
    }
}
