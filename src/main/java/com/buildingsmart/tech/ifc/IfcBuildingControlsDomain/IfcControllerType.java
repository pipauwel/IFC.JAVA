// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcBuildingControlsDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("082e1f55-cfe3-44d7-a8e2-234118f81fca")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcControllerType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType
{
	@Description("<p>Identifies the predefined types of controller from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("d80f0fc4-c3a0-4726-9626-b00ad62f3bab")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcControllerTypeEnum predefinedType;


	public IfcControllerType()
	{
	}

	public IfcControllerType(String globalId, IfcControllerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcControllerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcControllerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

