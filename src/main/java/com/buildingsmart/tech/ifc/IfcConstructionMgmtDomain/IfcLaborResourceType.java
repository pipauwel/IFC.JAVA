// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("3c666024-11d1-4495-9763-09f6ca7f89e7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLaborResourceType extends IfcConstructionResourceType
{
	@Description("Defines types of labour resources.  <p></p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("b175b20f-a6bc-4143-92dc-685e7d251824")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcLaborResourceTypeEnum predefinedType;


	public IfcLaborResourceType()
	{
	}

	public IfcLaborResourceType(String globalId, IfcLaborResourceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcLaborResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcLaborResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

