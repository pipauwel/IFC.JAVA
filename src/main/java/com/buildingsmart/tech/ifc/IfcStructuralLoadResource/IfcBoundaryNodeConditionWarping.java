// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("276b65b6-ad1b-4f76-9a7e-2ed708c3c554")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoundaryNodeConditionWarping extends IfcBoundaryNodeCondition
{
	@Description("Defines the warping stiffness value.")
	@Guid("2ccf083b-ef73-4270-b3b5-2cb990710788")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcWarpingStiffnessSelect warpingStiffness;


	public IfcBoundaryNodeConditionWarping()
	{
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcWarpingStiffnessSelect getWarpingStiffness() {
		return this.warpingStiffness;
	}

	public void setWarpingStiffness(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcWarpingStiffnessSelect warpingStiffness) {
		this.warpingStiffness = warpingStiffness;
	}


}

