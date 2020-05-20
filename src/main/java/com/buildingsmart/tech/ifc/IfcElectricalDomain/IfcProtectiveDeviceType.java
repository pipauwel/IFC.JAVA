// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("42a11802-b62b-451b-b13b-bbbd59194027")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProtectiveDeviceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType
{
	@Description("<p>Identifies the predefined types of protective device from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("63f1f340-e5f4-4898-a768-09b5fac4220b")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcProtectiveDeviceTypeEnum predefinedType;


	public IfcProtectiveDeviceType()
	{
	}

	public IfcProtectiveDeviceType(String globalId, IfcProtectiveDeviceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcProtectiveDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcProtectiveDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

