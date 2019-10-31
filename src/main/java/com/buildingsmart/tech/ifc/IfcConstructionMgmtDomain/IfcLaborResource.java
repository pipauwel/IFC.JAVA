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

@Guid("21941ff7-cd01-46b8-8e08-fb02ca673e3a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLaborResource extends IfcConstructionResource
{
	@Description("Defines types of labour resources.  <blockquote class=\"change-ifc2x4\">IFC4 New attribute.</blockquote>")
	@Guid("f927db3b-0e45-4370-a0b3-b201cf84b80b")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcLaborResourceTypeEnum predefinedType;


	public IfcLaborResource()
	{
	}

	public IfcLaborResource(String globalId)
	{
		super(globalId);
	}

	public IfcLaborResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcLaborResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

