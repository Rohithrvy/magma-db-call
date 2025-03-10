package com.example.Magma_db_service;

public class OutputResult {
    public String BusineeChannelType;
    public String BusinessSource;
    public String IntermediaryCode;
    public String IntermediaryName;
    public String EntityRelationShipCode;
    public String EntityRelationShipName;
    public String ChannelNumber;
    public String DisplayOfficeCode;
    public String OfficeCode;
    public String OfficeName;
    public String BusinessSourceType;
    public String SPCode;
    public String SPName;

    public OutputResult(String busineeChannelType, String businessSource, String intermediaryCode, String intermediaryName,
                        String entityRelationShipCode, String entityRelationShipName, String channelNumber, String displayOfficeCode,
                        String officeCode, String officeName, String businessSourceType, String spCode, String spName) {
        this.BusineeChannelType = busineeChannelType;
        this.BusinessSource = businessSource;
        this.IntermediaryCode = intermediaryCode;
        this.IntermediaryName = intermediaryName;
        this.EntityRelationShipCode = entityRelationShipCode;
        this.EntityRelationShipName = entityRelationShipName;
        this.ChannelNumber = channelNumber;
        this.DisplayOfficeCode = displayOfficeCode;
        this.OfficeCode = officeCode;
        this.OfficeName = officeName;
        this.BusinessSourceType = businessSourceType;
        this.SPCode = spCode;
        this.SPName = spName;
    }
}
