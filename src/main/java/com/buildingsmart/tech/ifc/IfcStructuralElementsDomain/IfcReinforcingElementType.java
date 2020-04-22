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
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingBarType;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingMeshType;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcTendonAnchorType;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcTendonType;
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponentType;

@Guid("23b7cd2f-4d94-4873-ae81-0fd81cb966a0")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcReinforcingBarType.class, name = "IfcReinforcingBarType"), @JsonSubTypes.Type(value = IfcReinforcingMeshType.class, name = "IfcReinforcingMeshType"), @JsonSubTypes.Type(value = IfcTendonAnchorType.class, name = "IfcTendonAnchorType"), @JsonSubTypes.Type(value = IfcTendonType.class, name = "IfcTendonType")})
public abstract class IfcReinforcingElementType extends com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponentType
{

	public IfcReinforcingElementType()
	{
	}

	public IfcReinforcingElementType(String globalId)
	{
		super(globalId);
	}


}

