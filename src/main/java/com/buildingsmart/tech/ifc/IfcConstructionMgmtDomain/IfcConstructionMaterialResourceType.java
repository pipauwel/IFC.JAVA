// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain;

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
import com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.*;
import com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcConstructionResourceType;
import com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcConstructionMaterialResourceTypeEnum;

@Guid("affcff56-3734-44c1-8c8d-7681c02ae21b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConstructionMaterialResourceType extends IfcConstructionResourceType
{
	@Description("Defines types of construction material resources.  <p></p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("bebb90d1-4de9-4d43-9119-c0f44b7dccc9")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcConstructionMaterialResourceTypeEnum predefinedType;


	public IfcConstructionMaterialResourceType()
	{
	}

	public IfcConstructionMaterialResourceType(String globalId, IfcConstructionMaterialResourceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcConstructionMaterialResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcConstructionMaterialResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

