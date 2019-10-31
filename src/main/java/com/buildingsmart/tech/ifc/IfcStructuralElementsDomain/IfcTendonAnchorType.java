// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

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
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.*;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingElementType;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcTendonAnchorTypeEnum;

@Guid("6591c79a-0b26-4315-8d59-cd0e5ef03555")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTendonAnchorType extends IfcReinforcingElementType
{
	@Description("Subtype of tendon anchor.")
	@Required()
	@Guid("bc3db412-e609-4c5f-8be2-4f8b21f27a08")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcTendonAnchorTypeEnum predefinedType;


	public IfcTendonAnchorType()
	{
	}

	public IfcTendonAnchorType(String globalId, IfcTendonAnchorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcTendonAnchorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcTendonAnchorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

