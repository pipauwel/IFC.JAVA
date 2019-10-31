// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFittingType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableFittingTypeEnum;

@Guid("6b600515-6cd1-4099-92e8-b13faa4d285c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCableFittingType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFittingType
{
	@Description("<p>Identifies the predefined types of cable fitting from which the type required may be set.</p>")
	@Required()
	@Guid("e45b3f87-bb57-407e-ae06-d5e07c6e2c84")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcCableFittingTypeEnum predefinedType;


	public IfcCableFittingType()
	{
	}

	public IfcCableFittingType(String globalId, IfcCableFittingTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCableFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCableFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

