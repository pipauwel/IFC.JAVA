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
import com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcConstructionResource;

@Guid("7a284148-2d7a-4765-b4e6-59fd177792f3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConstructionMaterialResource extends IfcConstructionResource
{
	@Description("Defines types of construction material resources.  <blockquote class=\"change-ifc2x4\">IFC4 New attribute.</blockquote>")
	@Guid("ebc589df-50eb-4ae8-9581-ccadc54d6260")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcConstructionMaterialResourceTypeEnum predefinedType;


	public IfcConstructionMaterialResource()
	{
	}

	public IfcConstructionMaterialResource(String globalId)
	{
		super(globalId);
	}

	public IfcConstructionMaterialResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcConstructionMaterialResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

