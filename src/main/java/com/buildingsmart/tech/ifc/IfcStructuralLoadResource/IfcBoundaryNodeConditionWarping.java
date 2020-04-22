// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

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
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.*;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcBoundaryNodeCondition;

@Guid("276b65b6-ad1b-4f76-9a7e-2ed708c3c554")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoundaryNodeConditionWarping extends IfcBoundaryNodeCondition
{
	@Description("Defines the warping stiffness value.")
	@DataMember(Order = 0)
	@Guid("2ccf083b-ef73-4270-b3b5-2cb990710788")
	@JacksonXmlProperty(isAttribute=true, localName = "WarpingStiffness")
	private IfcWarpingStiffnessSelect warpingStiffness;


	public IfcBoundaryNodeConditionWarping()
	{
	}

	public IfcWarpingStiffnessSelect getWarpingStiffness() {
		return this.warpingStiffness;
	}

	public void setWarpingStiffness(IfcWarpingStiffnessSelect warpingStiffness) {
		this.warpingStiffness = warpingStiffness;
	}


}

