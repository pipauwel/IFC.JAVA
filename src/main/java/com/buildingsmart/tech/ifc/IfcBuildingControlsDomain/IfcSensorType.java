// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcBuildingControlsDomain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcSensorTypeEnum;

@Guid("a5b36357-2503-452f-8599-ce8a92a3ec72")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSensorType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType
{
	@Description("<p>Identifies the predefined types of sensor from which the type required may be set.</p>")
	@Required()
	@Guid("f82dc96d-8253-4856-9809-f7ea53c18a33")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcSensorTypeEnum predefinedType;


	public IfcSensorType()
	{
	}

	public IfcSensorType(String globalId, IfcSensorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcSensorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSensorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

