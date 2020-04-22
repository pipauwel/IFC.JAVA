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

@Guid("3770d6cc-7b84-41f9-b413-dd23f8cab584")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCrewResource extends IfcConstructionResource
{
	@Description("Defines types of crew resources.  <blockquote class=\"change-ifc2x4\">IFC4 New attribute.</blockquote>")
	@DataMember(Order = 0)
	@Guid("fd0a2ad8-3efa-46e5-a534-fefe0d6f9bce")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcCrewResourceTypeEnum predefinedType;


	public IfcCrewResource()
	{
	}

	public IfcCrewResource(String globalId)
	{
		super(globalId);
	}

	public IfcCrewResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCrewResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

