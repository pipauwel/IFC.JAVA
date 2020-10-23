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

@Guid("0183b4f6-26f5-49bc-be00-a887d350340e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConstructionEquipmentResourceType extends IfcConstructionResourceType
{
	@Description("Defines types of construction equipment resources.  <p></p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("99d4b03f-35f6-42c2-92ff-4620180871f2")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcConstructionEquipmentResourceTypeEnum predefinedType;


	public IfcConstructionEquipmentResourceType()
	{
	}

	public IfcConstructionEquipmentResourceType(String globalId, IfcConstructionEquipmentResourceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcConstructionEquipmentResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcConstructionEquipmentResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

