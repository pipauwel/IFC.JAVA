// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("b462c716-83fc-438a-b8ad-e04082530bab")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcConnectedFaceSet.class, name = "IfcConnectedFaceSet"), @JsonSubTypes.Type(value = IfcEdge.class, name = "IfcEdge"), @JsonSubTypes.Type(value = IfcFace.class, name = "IfcFace"), @JsonSubTypes.Type(value = IfcFaceBound.class, name = "IfcFaceBound"), @JsonSubTypes.Type(value = IfcLoop.class, name = "IfcLoop"), @JsonSubTypes.Type(value = IfcPath.class, name = "IfcPath"), @JsonSubTypes.Type(value = IfcVertex.class, name = "IfcVertex")})
public abstract class IfcTopologicalRepresentationItem extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem
{

	public IfcTopologicalRepresentationItem()
	{
	}


}

