// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import java.util.Set;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("4aa23b8c-0acf-4202-9d27-29abd09009e1")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcIrregularTimeSeries.class, name = "IfcIrregularTimeSeries"), @JsonSubTypes.Type(value = IfcRegularTimeSeries.class, name = "IfcRegularTimeSeries")})
public abstract class IfcTimeSeries implements com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("An unique name for the time series.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a8259487-25da-4b34-a81c-5e5f921f8b44")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("A text description of the data that the series represents.")
	@DataMember(Order = 1)
	@Guid("35b2fdcb-dd9d-4659-9a9f-88ed103cc7e3")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;

	@Description("The start time of a time series.")
	@DataMember(Order = 2)
	@Required()
	@Guid("40888137-c7f3-46ce-b025-d7d141d70954")
	@JacksonXmlProperty(isAttribute=true, localName = "StartTime")
	private String startTime;

	@Description("The end time of a time series.")
	@DataMember(Order = 3)
	@Required()
	@Guid("a0c55cac-3a6b-4188-b40e-86a1b8d8551e")
	@JacksonXmlProperty(isAttribute=true, localName = "EndTime")
	private String endTime;

	@Description("The time series data type.")
	@DataMember(Order = 4)
	@Required()
	@Guid("fe4ee506-c00b-4343-867f-0bfe2de83742")
	@JacksonXmlProperty(isAttribute=true, localName = "TimeSeriesDataType")
	private IfcTimeSeriesDataTypeEnum timeSeriesDataType;

	@Description("The origin of a time series data.")
	@DataMember(Order = 5)
	@Required()
	@Guid("a066d6e2-e023-4c82-b13b-62af49f161e6")
	@JacksonXmlProperty(isAttribute=true, localName = "DataOrigin")
	private IfcDataOriginEnum dataOrigin;

	@Description("Value of the data origin if DataOrigin attribute is USERDEFINED.")
	@DataMember(Order = 6)
	@Guid("0be8d17c-c445-42b4-9a22-47e1c851745e")
	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedDataOrigin")
	private String userDefinedDataOrigin;

	@Description("The unit to be assigned to all values within the time series. Note that mixing units is not allowed. If the value is not given, the global unit for the type of <em>IfcValue</em>, as defined at <em>IfcProject.UnitsInContext</em> is used.")
	@DataMember(Order = 7)
	@Guid("4cef5985-267c-417d-82ae-8c303b8c59e2")
	@JacksonXmlProperty(isAttribute=true, localName = "Unit")
	private IfcUnit unit;

	@Description("Reference to an external reference, e.g. library, classification, or document information, that is associated to the IfcTimeSeries.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute.</blockquote>")
	@Guid("65b0ae8e-3556-403a-86d8-6f15485a4e36")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcExternalReferenceRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasExternalReference")
	private Set<IfcExternalReferenceRelationship> hasExternalReference;


	public IfcTimeSeries()
	{
	}

	public IfcTimeSeries(String name, String startTime, String endTime, IfcTimeSeriesDataTypeEnum timeSeriesDataType, IfcDataOriginEnum dataOrigin)
	{
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.timeSeriesDataType = timeSeriesDataType;
		this.dataOrigin = dataOrigin;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public IfcTimeSeriesDataTypeEnum getTimeSeriesDataType() {
		return this.timeSeriesDataType;
	}

	public void setTimeSeriesDataType(IfcTimeSeriesDataTypeEnum timeSeriesDataType) {
		this.timeSeriesDataType = timeSeriesDataType;
	}

	public IfcDataOriginEnum getDataOrigin() {
		return this.dataOrigin;
	}

	public void setDataOrigin(IfcDataOriginEnum dataOrigin) {
		this.dataOrigin = dataOrigin;
	}

	public String getUserDefinedDataOrigin() {
		return this.userDefinedDataOrigin;
	}

	public void setUserDefinedDataOrigin(String userDefinedDataOrigin) {
		this.userDefinedDataOrigin = userDefinedDataOrigin;
	}

	public IfcUnit getUnit() {
		return this.unit;
	}

	public void setUnit(IfcUnit unit) {
		this.unit = unit;
	}

	public Set<IfcExternalReferenceRelationship> getHasExternalReference() {
		return this.hasExternalReference;
	}


}

