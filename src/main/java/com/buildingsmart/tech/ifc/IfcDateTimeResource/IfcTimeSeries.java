// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("4aa23b8c-0acf-4202-9d27-29abd09009e1")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcTimeSeries implements com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("An unique name for the time series.")
	@Required()
	@Guid("a8259487-25da-4b34-a81c-5e5f921f8b44")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("A text description of the data that the series represents.")
	@Guid("35b2fdcb-dd9d-4659-9a9f-88ed103cc7e3")
	private String description;

	@JacksonXmlProperty(isAttribute=true, localName = "StartTime")
	@Description("The start time of a time series.")
	@Required()
	@Guid("40888137-c7f3-46ce-b025-d7d141d70954")
	private String startTime;

	@JacksonXmlProperty(isAttribute=true, localName = "EndTime")
	@Description("The end time of a time series.")
	@Required()
	@Guid("a0c55cac-3a6b-4188-b40e-86a1b8d8551e")
	private String endTime;

	@JacksonXmlProperty(isAttribute=true, localName = "TimeSeriesDataType")
	@Description("The time series data type.")
	@Required()
	@Guid("fe4ee506-c00b-4343-867f-0bfe2de83742")
	private com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeriesDataTypeEnum timeSeriesDataType;

	@JacksonXmlProperty(isAttribute=true, localName = "DataOrigin")
	@Description("The origin of a time series data.")
	@Required()
	@Guid("a066d6e2-e023-4c82-b13b-62af49f161e6")
	private com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDataOriginEnum dataOrigin;

	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedDataOrigin")
	@Description("Value of the data origin if DataOrigin attribute is USERDEFINED.")
	@Guid("0be8d17c-c445-42b4-9a22-47e1c851745e")
	private String userDefinedDataOrigin;

	@Description("The unit to be assigned to all values within the time series. Note that mixing units is not allowed. If the value is not given, the global unit for the type of <em>IfcValue</em>, as defined at <em>IfcProject.UnitsInContext</em> is used.")
	@Guid("4cef5985-267c-417d-82ae-8c303b8c59e2")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit unit;

	@Description("Reference to an external reference, e.g. library, classification, or document information, that is associated to the IfcTimeSeries.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute.</blockquote>")
	@MinLength(1)
	@Guid("65b0ae8e-3556-403a-86d8-6f15485a4e36")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> hasExternalReference = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship>();


	public IfcTimeSeries()
	{
	}

	public IfcTimeSeries(String name, String startTime, String endTime, com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeriesDataTypeEnum timeSeriesDataType, com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDataOriginEnum dataOrigin)
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

	public com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeriesDataTypeEnum getTimeSeriesDataType() {
		return this.timeSeriesDataType;
	}

	public void setTimeSeriesDataType(com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeriesDataTypeEnum timeSeriesDataType) {
		this.timeSeriesDataType = timeSeriesDataType;
	}

	public com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDataOriginEnum getDataOrigin() {
		return this.dataOrigin;
	}

	public void setDataOrigin(com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDataOriginEnum dataOrigin) {
		this.dataOrigin = dataOrigin;
	}

	public String getUserDefinedDataOrigin() {
		return this.userDefinedDataOrigin;
	}

	public void setUserDefinedDataOrigin(String userDefinedDataOrigin) {
		this.userDefinedDataOrigin = userDefinedDataOrigin;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit getUnit() {
		return this.unit;
	}

	public void setUnit(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit unit) {
		this.unit = unit;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> getHasExternalReference() {
		return this.hasExternalReference;
	}


}

