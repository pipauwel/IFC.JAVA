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
import com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcCrewResourceTypeEnum;

@Guid("7036c849-da9d-45cc-b0e7-a07e7e66f2c5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCrewResourceType extends IfcConstructionResourceType
{
	@Description("Defines types of crew resources.  <p></p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("f9939f7c-0af4-4687-a908-5b65c54becdd")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcCrewResourceTypeEnum predefinedType;


	public IfcCrewResourceType()
	{
	}

	public IfcCrewResourceType(String globalId, IfcCrewResourceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCrewResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCrewResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

