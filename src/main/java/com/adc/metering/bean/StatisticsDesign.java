package com.adc.metering.bean;

public class StatisticsDesign {

    private String qualitative;
    private String difference;
    private String relativePercentageDifference;
    private String ratioScoreOfZ;
    private String ratioScoreOfZT;
    private String ratioScoreOfE;
    private String en;
    private String otherStatisticsDesign;

    public StatisticsDesign(String qualitative, String difference, String relativePercentageDifference, String ratioScoreOfZ, String ratioScoreOfZT, String ratioScoreOfE, String en, String otherStatisticsDesign) {
        this.qualitative = qualitative;
        this.difference = difference;
        this.relativePercentageDifference = relativePercentageDifference;
        this.ratioScoreOfZ = ratioScoreOfZ;
        this.ratioScoreOfZT = ratioScoreOfZT;
        this.ratioScoreOfE = ratioScoreOfE;
        this.en = en;
        this.otherStatisticsDesign = otherStatisticsDesign;
    }

    public String getQualitative() {
        return qualitative;
    }

    public void setQualitative(String qualitative) {
        this.qualitative = qualitative;
    }

    public String getDifference() {
        return difference;
    }

    public void setDifference(String difference) {
        this.difference = difference;
    }

    public String getRelativePercentageDifference() {
        return relativePercentageDifference;
    }

    public void setRelativePercentageDifference(String relativePercentageDifference) {
        this.relativePercentageDifference = relativePercentageDifference;
    }

    public String getRatioScoreOfZ() {
        return ratioScoreOfZ;
    }

    public void setRatioScoreOfZ(String ratioScoreOfZ) {
        this.ratioScoreOfZ = ratioScoreOfZ;
    }

    public String getRatioScoreOfZT() {
        return ratioScoreOfZT;
    }

    public void setRatioScoreOfZT(String ratioScoreOfZT) {
        this.ratioScoreOfZT = ratioScoreOfZT;
    }

    public String getRatioScoreOfE() {
        return ratioScoreOfE;
    }

    public void setRatioScoreOfE(String ratioScoreOfE) {
        this.ratioScoreOfE = ratioScoreOfE;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getOtherStatisticsDesign() {
        return otherStatisticsDesign;
    }

    public void setOtherStatisticsDesign(String otherStatisticsDesign) {
        this.otherStatisticsDesign = otherStatisticsDesign;
    }

}

