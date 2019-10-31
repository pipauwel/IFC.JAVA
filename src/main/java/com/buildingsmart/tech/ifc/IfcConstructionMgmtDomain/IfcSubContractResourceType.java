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
import com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcSubContractResourceTypeEnum;

@Guid("352fd6e0-58e5-4a63-905c-991b1079ef81")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSubContractResourceType extends IfcConstructionResourceType
{
	@Description("Defines types of subcontract resources.  <p></p>")
	@Required()
	@Guid("5a5ee4dc-db65-4bab-b553-4a7593fedbe1")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcSubContractResourceTypeEnum predefinedType;


	public IfcSubContractResourceType()
	{
	}

	public IfcSubContractResourceType(String globalId, IfcSubContractResourceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcSubContractResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSubContractResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

