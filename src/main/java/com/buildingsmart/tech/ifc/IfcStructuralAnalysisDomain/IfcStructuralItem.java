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

@Guid("a309fabc-b0bd-4c8d-a1e7-0a91f255ecce")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcStructuralItem extends com.buildingsmart.tech.ifc.IfcKernel.IfcProduct implements IfcStructuralActivityAssignmentSelect
{
	@Description("Inverse relationship to all structural activities (i.e. to actions or reactions) which are assigned to this structural member.")
	@Guid("ee8db982-5c72-477c-b54a-fed63d0326fd")
	private Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralActivity> assignedStructuralActivity = new HashSet<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralActivity>();


	public IfcStructuralItem()
	{
	}

	public IfcStructuralItem(String globalId)
	{
		super(globalId);
	}

	public Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralActivity> getAssignedStructuralActivity() {
		return this.assignedStructuralActivity;
	}


}

