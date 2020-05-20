// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("21941ff7-cd01-46b8-8e08-fb02ca673e3a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLaborResource extends IfcConstructionResource
{
	@Description("Defines types of labour resources.  <blockquote class=\"change-ifc2x4\">IFC4 New attribute.</blockquote>")
	@DataMember(Order = 0)
	@Guid("f927db3b-0e45-4370-a0b3-b201cf84b80b")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcLaborResourceTypeEnum predefinedType;


	public IfcLaborResource()
	{
	}

	public IfcLaborResource(String globalId)
	{
		super(globalId);
	}

	public IfcLaborResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcLaborResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

