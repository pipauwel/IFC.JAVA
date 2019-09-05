// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("a37e785d-9c63-4d0c-acff-e17f5fc43811")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcStructuralMember extends IfcStructuralItem
{
	@Description("Inverse relationship to all structural connections (i.e. to supports or connecting elements) which are defined for this structural member.")
	@Guid("0e5c250b-dcb5-48d9-9260-d187e548238f")
	private Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralMember> connectedBy = new HashSet<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralMember>();


	public IfcStructuralMember()
	{
	}

	public IfcStructuralMember(String globalId)
	{
		super(globalId);
	}

	public Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralMember> getConnectedBy() {
		return this.connectedBy;
	}


}

