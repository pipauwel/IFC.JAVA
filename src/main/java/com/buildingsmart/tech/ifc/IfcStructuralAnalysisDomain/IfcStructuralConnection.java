// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d4640db1-7b55-4f79-8ba6-05b016369801")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcStructuralConnection extends IfcStructuralItem
{
	@JacksonXmlProperty(isAttribute=false, localName = "AppliedCondition")
	@Description("Optional boundary conditions which define support conditions of this connection object, given in local coordinate directions of the connection object.  If left unspecified, the connection object is assumed to have no supports besides being connected with members.")
	@Guid("f73c29bd-73af-42d0-ba9a-8654e4da5996")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcBoundaryCondition appliedCondition;

	@Description("References to the IfcRelConnectsStructuralMembers relationship by which structural members can be associated to structural connections.")
	@MinLength(1)
	@Guid("e589142e-96a4-4236-be46-02d7d341f21b")
	private Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralMember> connectsStructuralMembers = new HashSet<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralMember>();


	public IfcStructuralConnection()
	{
	}

	public IfcStructuralConnection(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcBoundaryCondition getAppliedCondition() {
		return this.appliedCondition;
	}

	public void setAppliedCondition(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcBoundaryCondition appliedCondition) {
		this.appliedCondition = appliedCondition;
	}

	public Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralMember> getConnectsStructuralMembers() {
		return this.connectsStructuralMembers;
	}


}

