// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

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
import com.buildingsmart.tech.ifc.IfcHvacDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTubeBundleTypeEnum;

@Guid("a152e66f-594f-4779-90f7-092829204b79")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTubeBundleType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("Defines the type of tube bundle.")
	@DataMember(Order = 0)
	@Required()
	@Guid("b68c7534-05cc-4f1a-8a8d-a1551285c2ee")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcTubeBundleTypeEnum predefinedType;


	public IfcTubeBundleType()
	{
	}

	public IfcTubeBundleType(String globalId, IfcTubeBundleTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcTubeBundleTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcTubeBundleTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

