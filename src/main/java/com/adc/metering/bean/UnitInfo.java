package com.adc.metering.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class UnitInfo {
    @Id
    private String unitName;
    private String unitNature;
    private String unitRegistrationAddress;
    private String unitLabAddress;
    private String CMANumber;

    public UnitInfo(String unitName, String unitNature, String unitRegistrationAddress, String unitLabAddress, String CMANumber) {
        this.unitName = unitName;
        this.unitNature = unitNature;
        this.unitRegistrationAddress = unitRegistrationAddress;
        this.unitLabAddress = unitLabAddress;
        this.CMANumber = CMANumber;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitNature() {
        return unitNature;
    }

    public void setUnitNature(String unitNature) {
        this.unitNature = unitNature;
    }

    public String getUnitRegistrationAddress() {
        return unitRegistrationAddress;
    }

    public void setUnitRegistrationAddress(String unitRegistrationAddress) {
        this.unitRegistrationAddress = unitRegistrationAddress;
    }

    public String getUnitLabAddress() {
        return unitLabAddress;
    }

    public void setUnitLabAddress(String unitLabAddress) {
        this.unitLabAddress = unitLabAddress;
    }

    public String  getCMANumber() {
        return CMANumber;
    }

    public void setCMANumber(String CMANumber) {
        this.CMANumber = CMANumber;
    }
}
