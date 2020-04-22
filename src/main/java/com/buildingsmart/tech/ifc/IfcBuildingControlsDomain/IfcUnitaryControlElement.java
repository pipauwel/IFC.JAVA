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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement;

@Guid("cfc09c9c-67e9-4354-9a3c-87e3d2f14839")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcUnitaryControlElement extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement
{
	@DataMember(Order = 0)
	@Guid("5fd251f6-8d60-4ce4-bc91-5e5791b8cf4a")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcUnitaryControlElementTypeEnum predefinedType;


	public IfcUnitaryControlElement()
	{
	}

	public IfcUnitaryControlElement(String globalId)
	{
		super(globalId);
	}

	public IfcUnitaryControlElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcUnitaryControlElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

