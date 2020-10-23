// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("fd42c2cc-cf4e-429b-adc8-a92410ba4fcb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPumpType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowMovingDeviceType
{
	@Description("Defines the type of pump typically used in building services.")
	@DataMember(Order = 0)
	@Required()
	@Guid("8be7377a-5007-4096-a894-874194c70a00")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcPumpTypeEnum predefinedType;


	public IfcPumpType()
	{
	}

	public IfcPumpType(String globalId, IfcPumpTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcPumpTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcPumpTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

