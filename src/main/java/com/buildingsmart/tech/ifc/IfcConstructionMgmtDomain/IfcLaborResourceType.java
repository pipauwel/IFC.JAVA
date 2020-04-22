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
import com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcLaborResourceTypeEnum;

@Guid("3c666024-11d1-4495-9763-09f6ca7f89e7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLaborResourceType extends IfcConstructionResourceType
{
	@Description("Defines types of labour resources.  <p></p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("b175b20f-a6bc-4143-92dc-685e7d251824")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcLaborResourceTypeEnum predefinedType;


	public IfcLaborResourceType()
	{
	}

	public IfcLaborResourceType(String globalId, IfcLaborResourceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcLaborResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcLaborResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

