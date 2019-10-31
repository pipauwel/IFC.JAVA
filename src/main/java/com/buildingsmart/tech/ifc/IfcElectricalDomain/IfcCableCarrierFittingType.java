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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableCarrierFittingTypeEnum;

@Guid("fd9b5bec-e42a-4c5e-bc8a-bd72ae76b43a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCableCarrierFittingType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFittingType
{
	@Description("<p>Identifies the predefined types of cable carrier fitting from which the type required may be set.</p>")
	@Required()
	@Guid("8608a724-6294-4993-ac2b-b30f39f1853a")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcCableCarrierFittingTypeEnum predefinedType;


	public IfcCableCarrierFittingType()
	{
	}

	public IfcCableCarrierFittingType(String globalId, IfcCableCarrierFittingTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCableCarrierFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCableCarrierFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

