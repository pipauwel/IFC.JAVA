// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("77b2b704-db87-472e-a29a-8703008a914e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTaskType extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProcess
{
	@Description("Identifies the predefined types of a task type from which       the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("6d753b35-1021-4b5f-b5e3-88577c0039e5")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcTaskTypeEnum predefinedType;

	@Description("The method of work used in carrying out a task.")
	@DataMember(Order = 1)
	@Guid("15b56ebb-668c-4abe-8828-59a6ecbd8ec2")
	@JacksonXmlProperty(isAttribute=true, localName = "workMethod")
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

