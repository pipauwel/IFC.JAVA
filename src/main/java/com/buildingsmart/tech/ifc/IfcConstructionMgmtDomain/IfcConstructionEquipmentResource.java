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

@Guid("9fada597-3474-49fa-8994-f2b3e432d696")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConstructionEquipmentResource extends IfcConstructionResource
{
	@Description("Defines types of construction equipment resources.  <blockquote class=\"change-ifc2x4\">IFC4 New attribute.</blockquote>")
	@DataMember(Order = 0)
	@Guid("da8f2824-79d3-4e77-bf5c-996ae7f6ff8c")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcConstructionEquipmentResourceTypeEnum predefinedType;


	public IfcConstructionEquipmentResource()
	{
	}

	public IfcConstructionEquipmentResource(String globalId)
	{
		super(globalId);
	}

	public IfcConstructionEquipmentResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcConstructionEquipmentResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

