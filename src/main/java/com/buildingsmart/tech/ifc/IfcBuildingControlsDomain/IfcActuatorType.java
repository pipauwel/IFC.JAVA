// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcBuildingControlsDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c5566ffc-0c41-4c04-8976-47ec60b36fda")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcActuatorType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("<p>Identifies the predefined types of actuator from which the type required may be set.</p>")
	@Required()
	@Guid("0e4f0d49-2432-4458-b687-8429bcd48735")
	private com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcActuatorTypeEnum predefinedType;


	public IfcActuatorType()
	{
	}

	public IfcActuatorType(String globalId, com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcActuatorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcActuatorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcActuatorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

