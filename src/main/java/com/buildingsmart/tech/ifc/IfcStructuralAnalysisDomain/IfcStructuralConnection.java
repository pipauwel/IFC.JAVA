// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcBoundaryCondition;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("d4640db1-7b55-4f79-8ba6-05b016369801")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcStructuralCurveConnection.class, name = "IfcStructuralCurveConnection"), @JsonSubTypes.Type(value = IfcStructuralPointConnection.class, name = "IfcStructuralPointConnection"), @JsonSubTypes.Type(value = IfcStructuralSurfaceConnection.class, name = "IfcStructuralSurfaceConnection")})
public abstract class IfcStructuralConnection extends IfcStructuralItem
{
	@Description("Optional boundary conditions which define support conditions of this connection object, given in local coordinate directions of the connection object.  If left unspecified, the connection object is assumed to have no supports besides being connected with members.")
	@DataMember(Order = 0)
	@Guid("f73c29bd-73af-42d0-ba9a-8654e4da5996")
	@JacksonXmlProperty(isAttribute=false, localName = "appliedCondition")
	private IfcBoundaryCondition appliedCondition;

	@Description("References to the IfcRelConnectsStructuralMembers relationship by which structural members can be associated to structural connections.")
	@InverseProperty(InverseProp = "relatedStructuralConnection", Range = "IfcRelConnectsStructuralMember")
	@Guid("e589142e-96a4-4236-be46-02d7d341f21b")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelConnectsStructuralMember")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "connectsStructuralMembers")
	private Set<IfcRelConnectsStructuralMember> connectsStructuralMembers;


	public IfcStructuralConnection()
	{
	}

	public IfcStructuralConnection(String globalId)
	{
		super(globalId);
	}

	public IfcBoundaryCondition getAppliedCondition() {
		return this.appliedCondition;
	}

	public void setAppliedCondition(IfcBoundaryCondition appliedCondition) {
		this.appliedCondition = appliedCondition;
	}

	public Set<IfcRelConnectsStructuralMember> getConnectsStructuralMembers() {
		return this.connectsStructuralMembers;
	}


}

