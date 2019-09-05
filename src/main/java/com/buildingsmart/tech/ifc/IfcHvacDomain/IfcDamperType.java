// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b8de85d0-242c-4557-ad69-4310a1b46caa")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDamperType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Type of damper.")
	@Required()
	@Guid("708a30b6-ae25-4d2c-97c7-37de2da7c7c3")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDamperTypeEnum predefinedType;


	public IfcDamperType()
	{
	}

	public IfcDamperType(String globalId, com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDamperTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDamperTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDamperTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

