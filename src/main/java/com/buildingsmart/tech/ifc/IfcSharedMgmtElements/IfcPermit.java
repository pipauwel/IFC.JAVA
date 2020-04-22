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

@Guid("68afab75-4967-4f29-8e43-1f456d2a85d0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPermit extends com.buildingsmart.tech.ifc.IfcKernel.IfcControl
{
	@Description("Identifies the predefined types of permit that can be granted.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added.</blockquote>")
	@DataMember(Order = 0)
	@Guid("0e7d5fb5-5730-488d-81d5-0a45b54a9f9c")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcPermitTypeEnum predefinedType;

	@Description("The status currently assigned to the permit.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added.</blockquote>")
	@DataMember(Order = 1)
	@Guid("1486b92f-8a56-432e-a9b9-a8ef085ead05")
	@JacksonXmlProperty(isAttribute=true, localName = "Status")
	private String status;

	@Description("Detailed description of the request.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added.</blockquote>")
	@DataMember(Order = 2)
	@Guid("90a8f164-66d0-4aac-bcc6-4b738708490c")
	@JacksonXmlProperty(isAttribute=true, localName = "LongDescription")
	private String longDescription;


	public IfcPermit()
	{
	}

	public IfcPermit(String globalId)
	{
		super(globalId);
	}

	public IfcPermitTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcPermitTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}


}

