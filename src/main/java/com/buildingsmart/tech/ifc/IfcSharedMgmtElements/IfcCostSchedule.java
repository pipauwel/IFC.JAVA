// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedMgmtElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcSharedMgmtElements.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcControl;

@Guid("ff373331-377a-4ddd-8781-060d4b4f0828")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCostSchedule extends com.buildingsmart.tech.ifc.IfcKernel.IfcControl
{
	@Description("Predefined generic type for a cost schedule that is specified in an enumeration. There may be a property set given specifically for the predefined types.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been made optional.</blockquote>")
	@Guid("11588a64-9704-464e-859a-69c5c7ed8693")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcCostScheduleTypeEnum predefinedType;

	@Description("The current status of a cost schedule. Examples of status values that might be used for a cost schedule status include:  <ul>  <li> PLANNED </li>  <li> APPROVED </li>  <li> AGREED </li>  <li> ISSUED </li>  <li> STARTED </li>  </ul>")
	@Guid("69cf6268-7c30-4f3d-a314-486cc0140ad1")
	@JacksonXmlProperty(isAttribute=true, localName = "Status")
	private String status;

	@Description("The date and time on which the cost schedule was submitted.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Type changed from IfcDateTimeSelect.</blockquote>")
	@Guid("01517834-9aeb-40dd-9b60-86a3bc514efc")
	@JacksonXmlProperty(isAttribute=true, localName = "SubmittedOn")
	private String submittedOn;

	@Description("The date and time that this cost schedule is updated; this allows tracking the schedule history.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Type changed from IfcDateTimeSelect.</blockquote>")
	@Guid("99952380-22fd-4754-9d3d-84dca6afe470")
	@JacksonXmlProperty(isAttribute=true, localName = "UpdateDate")
	private String updateDate;


	public IfcCostSchedule()
	{
	}

	public IfcCostSchedule(String globalId)
	{
		super(globalId);
	}

	public IfcCostScheduleTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCostScheduleTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubmittedOn() {
		return this.submittedOn;
	}

	public void setSubmittedOn(String submittedOn) {
		this.submittedOn = submittedOn;
	}

	public String getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}


}

