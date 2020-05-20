// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("ebffea85-6601-4032-8540-a094ef46f7cb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcArbitraryProfileDefWithVoids extends IfcArbitraryClosedProfileDef
{
	@Description("Set of bounded curves, defining the inner boundaries of the arbitrary profile.")
	@DataMember(Order = 0)
	@Required()
	@Guid("f5a968fa-e9ba-423c-9752-52657d57b5bc")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCurve")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "innerCurves")
	private Set<IfcCurve> innerCurves;


	public IfcArbitraryProfileDefWithVoids()
	{
	}

	public IfcArbitraryProfileDefWithVoids(IfcProfileTypeEnum profileType, IfcCurve outerCurve, IfcCurve[] innerCurves)
	{
		super(profileType, outerCurve);
		this.innerCurves = new HashSet<>(Arrays.asList(innerCurves));
	}

	public Set<IfcCurve> getInnerCurves() {
		return this.innerCurves;
	}


}

