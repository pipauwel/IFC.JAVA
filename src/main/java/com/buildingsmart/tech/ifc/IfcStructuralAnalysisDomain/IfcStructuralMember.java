// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

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
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.*;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralCurveMember;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceMember;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralItem;

@Guid("a37e785d-9c63-4d0c-acff-e17f5fc43811")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcStructuralCurveMember.class, name = "IfcStructuralCurveMember"), @JsonSubTypes.Type(value = IfcStructuralSurfaceMember.class, name = "IfcStructuralSurfaceMember")})
public abstract class IfcStructuralMember extends IfcStructuralItem
{
	@Description("Inverse relationship to all structural connections (i.e. to supports or connecting elements) which are defined for this structural member.")
	@InverseProperty(InverseProp = "RelatingStructuralMember", Range = "IfcRelConnectsStructuralMember")
	@Guid("0e5c250b-dcb5-48d9-9260-d187e548238f")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelConnectsStructuralMember")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ConnectedBy")
	private Set<IfcRelConnectsStructuralMember> connectedBy;


	public IfcStructuralMember()
	{
	}

	public IfcStructuralMember(String globalId)
	{
		super(globalId);
	}

	public Set<IfcRelConnectsStructuralMember> getConnectedBy() {
		return this.connectedBy;
	}


}

