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

@Guid("7036c849-da9d-45cc-b0e7-a07e7e66f2c5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCrewResourceType extends IfcConstructionResourceType
{
	@Description("Defines types of crew resources.  <p></p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("f9939f7c-0af4-4687-a908-5b65c54becdd")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCrewResourceTypeEnum predefinedType;


	public IfcCrewResourceType()
	{
	}

	public IfcCrewResourceType(String globalId, IfcCrewResourceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCrewResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCrewResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

