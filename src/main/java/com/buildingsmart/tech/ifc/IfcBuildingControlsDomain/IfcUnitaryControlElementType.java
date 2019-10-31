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
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcUnitaryControlElementTypeEnum;

@Guid("60a3dc52-6b9a-4ad6-9d45-9ba50c6958e3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcUnitaryControlElementType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType
{
	@Description("<p>Identifies the predefined types of unitary control element from which the type required may be set.</p>")
	@Required()
	@Guid("2f4bb150-03fc-4936-95e8-bab9df94e95c")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcUnitaryControlElementTypeEnum predefinedType;


	public IfcUnitaryControlElementType()
	{
	}

	public IfcUnitaryControlElementType(String globalId, IfcUnitaryControlElementTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcUnitaryControlElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcUnitaryControlElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

