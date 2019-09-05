// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("ebffea85-6601-4032-8540-a094ef46f7cb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcArbitraryProfileDefWithVoids extends IfcArbitraryClosedProfileDef
{
	@Description("Set of bounded curves, defining the inner boundaries of the arbitrary profile.")
	@Required()
	@MinLength(1)
	@Guid("f5a968fa-e9ba-423c-9752-52657d57b5bc")
	private Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve> innerCurves = new HashSet<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve>();


	public IfcArbitraryProfileDefWithVoids()
	{
	}

	public IfcArbitraryProfileDefWithVoids(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum profileType, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve outerCurve, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve[] innerCurves)
	{
		super(profileType, outerCurve);
		this.innerCurves = new HashSet<>(Arrays.asList(innerCurves));
	}

	public Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve> getInnerCurves() {
		return this.innerCurves;
	}


}

