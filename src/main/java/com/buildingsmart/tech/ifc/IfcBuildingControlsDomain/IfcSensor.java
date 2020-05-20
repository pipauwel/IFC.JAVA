// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcBuildingControlsDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f8dc24f1-371f-42ce-af2b-1102b868f220")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSensor extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement
{
	@DataMember(Order = 0)
	@Guid("b3152fc9-1085-471d-afc9-32cd6d46fcb6")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcSensorTypeEnum predefinedType;


	public IfcSensor()
	{
	}

	public IfcSensor(String globalId)
	{
		super(globalId);
	}

	public IfcSensorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSensorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

