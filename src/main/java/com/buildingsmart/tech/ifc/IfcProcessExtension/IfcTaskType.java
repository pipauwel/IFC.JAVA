// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

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
import com.buildingsmart.tech.ifc.IfcProcessExtension.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProcess;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcTaskTypeEnum;

@Guid("77b2b704-db87-472e-a29a-8703008a914e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTaskType extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProcess
{
	@Description("Identifies the predefined types of a task type from which       the type required may be set.")
	@Required()
	@Guid("6d753b35-1021-4b5f-b5e3-88577c0039e5")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcTaskTypeEnum predefinedType;

	@Description("The method of work used in carrying out a task.")
	@Guid("15b56ebb-668c-4abe-8828-59a6ecbd8ec2")
	@JacksonXmlProperty(isAttribute=true, localName = "WorkMethod")
	private String workMethod;


	public IfcTaskType()
	{
	}

	public IfcTaskType(String globalId, IfcTaskTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcTaskTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcTaskTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public String getWorkMethod() {
		return this.workMethod;
	}

	public void setWorkMethod(String workMethod) {
		this.workMethod = workMethod;
	}


}

