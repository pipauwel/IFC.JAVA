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
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralReaction;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralCurveActivityTypeEnum;

@Guid("d85746e9-e456-40b1-9f23-87262b226375")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralCurveReaction extends IfcStructuralReaction
{
	@Description("Type of reaction according to its distribution of load values.")
	@Required()
	@Guid("090260b8-a1fe-4aec-889e-d8fd90137b39")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcStructuralCurveActivityTypeEnum predefinedType;


	public IfcStructuralCurveReaction()
	{
	}

	public IfcStructuralCurveReaction(String globalId, IfcStructuralLoad appliedLoad, IfcGlobalOrLocalEnum globalOrLocal, IfcStructuralCurveActivityTypeEnum predefinedType)
	{
		super(globalId, appliedLoad, globalOrLocal);
		this.predefinedType = predefinedType;
	}

	public IfcStructuralCurveActivityTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcStructuralCurveActivityTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

