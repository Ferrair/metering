package com.adc.metering.bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "projects")
public class ProjectDTO {



    private Integer  number;

    private UnitInfo unitInfo;
    @Id
    private String projectName;
    private List<Parameter> parameterList;
    private List<Contact> contactList;
    private BasisOfProject basisOfProject;
    private DescriptionOfTestQualification descriptionOfTestQualification;
    private String capacityDescriptionOfUnitInField;
    private DescriptionOfTestCapacity descriptionOfTestCapacitie;
    private Integer numberOfRelatedUnit;
    private TypeOfTestProgram typeOfTestProgram;
    private SampleDesign sampleDesign;
    private StatisticsDesign statisticsDesign;
    private DeterminationOfSpecifiedValue determinationOfSpecifiedValue;
    private ProjectFunding projectFunding;
    private String others;

    public ProjectDTO() {
    }

    public ProjectDTO(Integer number, UnitInfo unitInfo, String projectName, List<Parameter> parameterList, List<Contact> contactList, BasisOfProject basisOfProject, DescriptionOfTestQualification descriptionOfTestQualification, String capacityDescriptionOfUnitInField, DescriptionOfTestCapacity descriptionOfTestCapacitie, Integer numberOfRelatedUnit, TypeOfTestProgram typeOfTestProgram, SampleDesign sampleDesign, StatisticsDesign statisticsDesign, DeterminationOfSpecifiedValue determinationOfSpecifiedValue, ProjectFunding projectFunding, String others) {
        this.number = number;
        this.unitInfo = unitInfo;

        this.projectName = projectName;
        this.parameterList = parameterList;
        this.contactList = contactList;
        this.basisOfProject = basisOfProject;
        this.descriptionOfTestQualification = descriptionOfTestQualification;
        this.capacityDescriptionOfUnitInField = capacityDescriptionOfUnitInField;
        this.descriptionOfTestCapacitie = descriptionOfTestCapacitie;
        this.numberOfRelatedUnit = numberOfRelatedUnit;
        this.typeOfTestProgram = typeOfTestProgram;
        this.sampleDesign = sampleDesign;
        this.statisticsDesign = statisticsDesign;
        this.determinationOfSpecifiedValue = determinationOfSpecifiedValue;
        this.projectFunding = projectFunding;
        this.others = others;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer  number) {
        this.number = number;
    }

    public UnitInfo getUnitInfo() {
        return unitInfo;
    }

    public void setUnitInfo(UnitInfo unitInfo) {
        this.unitInfo = unitInfo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Parameter> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<Parameter> parameterList) {
        this.parameterList = parameterList;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public BasisOfProject getBasisOfProject() {
        return basisOfProject;
    }

    public void setBasisOfProject(BasisOfProject basisOfProject) {
        this.basisOfProject = basisOfProject;
    }

    public DescriptionOfTestQualification getDescriptionOfTestQualification() {
        return descriptionOfTestQualification;
    }

    public void setDescriptionOfTestQualification(DescriptionOfTestQualification descriptionOfTestQualification) {
        this.descriptionOfTestQualification = descriptionOfTestQualification;
    }

    public String getCapacityDescriptionOfUnitInField() {
        return capacityDescriptionOfUnitInField;
    }

    public void setCapacityDescriptionOfUnitInField(String capacityDescriptionOfUnitInField) {
        this.capacityDescriptionOfUnitInField = capacityDescriptionOfUnitInField;
    }

    public DescriptionOfTestCapacity getDescriptionOfTestCapacitie() {
        return descriptionOfTestCapacitie;
    }

    public void setDescriptionOfTestCapacitie(DescriptionOfTestCapacity descriptionOfTestCapacitie) {
        this.descriptionOfTestCapacitie = descriptionOfTestCapacitie;
    }

    public Integer getNumberOfRelatedUnit() {
        return numberOfRelatedUnit;
    }

    public void setNumberOfRelatedUnit(Integer numberOfRelatedUnit) {
        this.numberOfRelatedUnit = numberOfRelatedUnit;
    }

    public TypeOfTestProgram getTypeOfTestProgram() {
        return typeOfTestProgram;
    }

    public void setTypeOfTestProgram(TypeOfTestProgram typeOfTestProgram) {
        this.typeOfTestProgram = typeOfTestProgram;
    }

    public SampleDesign getSampleDesign() {
        return sampleDesign;
    }

    public void setSampleDesign(SampleDesign sampleDesign) {
        this.sampleDesign = sampleDesign;
    }

    public StatisticsDesign getStatisticsDesign() {
        return statisticsDesign;
    }

    public void setStatisticsDesign(StatisticsDesign statisticsDesign) {
        this.statisticsDesign = statisticsDesign;
    }

    public DeterminationOfSpecifiedValue getDeterminationOfSpecifiedValue() {
        return determinationOfSpecifiedValue;
    }

    public void setDeterminationOfSpecifiedValue(DeterminationOfSpecifiedValue determinationOfSpecifiedValue) {
        this.determinationOfSpecifiedValue = determinationOfSpecifiedValue;
    }

    public ProjectFunding getProjectFunding() {
        return projectFunding;
    }

    public void setProjectFunding(ProjectFunding projectFunding) {
        this.projectFunding = projectFunding;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }
}
