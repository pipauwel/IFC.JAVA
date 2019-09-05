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

@Guid("a5b36357-2503-452f-8599-ce8a92a3ec72")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSensorType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("<p>Identifies the predefined types of sensor from which the type required may be set.</p>")
	@Required()
	@Guid("f82dc96d-8253-4856-9809-f7ea53c18a33")
	private com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcSensorTypeEnum predefinedType;


	public IfcSensorType()
	{
	}

	public IfcSensorType(String globalId, com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcSensorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcSensorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcSensorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

