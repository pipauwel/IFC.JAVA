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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricGeneratorTypeEnum;

@Guid("54734959-8b52-4b23-a9b5-eef44edf8450")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricGeneratorType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("<p>Identifies the predefined types of electric generators from which the type required may be set.</p>")
	@Required()
	@Guid("90ecd934-9e91-4662-8702-396d56f10ca2")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcElectricGeneratorTypeEnum predefinedType;


	public IfcElectricGeneratorType()
	{
	}

	public IfcElectricGeneratorType(String globalId, IfcElectricGeneratorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcElectricGeneratorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElectricGeneratorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

