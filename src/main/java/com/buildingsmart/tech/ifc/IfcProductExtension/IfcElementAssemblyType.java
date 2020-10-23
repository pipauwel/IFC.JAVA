// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("cf32f5f3-9164-4283-8a8d-cfbf1a4bcc3e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElementAssemblyType extends IfcElementType
{
	@Description("Predefined types to define the particular type of the transport element. There may be property set definitions available for each predefined type.")
	@DataMember(Order = 0)
	@Required()
	@Guid("45aa3a72-bdd4-4e5b-b2d9-27b82bc19e4d")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcElementAssemblyTypeEnum predefinedType;


	public IfcElementAssemblyType()
	{
	}

	public IfcElementAssemblyType(String globalId, IfcElementAssemblyTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcElementAssemblyTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElementAssemblyTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

