// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponentType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("23b7cd2f-4d94-4873-ae81-0fd81cb966a0")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcReinforcingBarType.class, name = "IfcReinforcingBarType"), @JsonSubTypes.Type(value = IfcReinforcingMeshType.class, name = "IfcReinforcingMeshType"), @JsonSubTypes.Type(value = IfcTendonAnchorType.class, name = "IfcTendonAnchorType"), @JsonSubTypes.Type(value = IfcTendonType.class, name = "IfcTendonType")})
public abstract class IfcReinforcingElementType extends IfcElementComponentType
{

	public IfcReinforcingElementType()
	{
	}

	public IfcReinforcingElementType(String globalId)
	{
		super(globalId);
	}


}

