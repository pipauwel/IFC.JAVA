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
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcFootingTypeEnum;

@Guid("82272f47-5c4e-4c73-a82a-c5167bd15f6c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFootingType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Subtype of footing.")
	@DataMember(Order = 0)
	@Required()
	@Guid("c19fa949-829d-4996-b812-7b15f623d57c")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcFootingTypeEnum predefinedType;


	public IfcFootingType()
	{
	}

	public IfcFootingType(String globalId, IfcFootingTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcFootingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFootingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

