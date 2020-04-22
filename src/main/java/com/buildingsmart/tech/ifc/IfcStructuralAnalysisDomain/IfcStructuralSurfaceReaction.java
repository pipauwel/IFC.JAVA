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
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceActivityTypeEnum;

@Guid("e9d95f21-bd10-40ff-ada5-a024a15bf019")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralSurfaceReaction extends IfcStructuralReaction
{
	@Description("Type of reaction according to its distribution of load values.")
	@DataMember(Order = 0)
	@Required()
	@Guid("af39cd66-ebd2-471d-9517-590a0858c616")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcStructuralSurfaceActivityTypeEnum predefinedType;


	public IfcStructuralSurfaceReaction()
	{
	}

	public IfcStructuralSurfaceReaction(String globalId, IfcStructuralLoad appliedLoad, IfcGlobalOrLocalEnum globalOrLocal, IfcStructuralSurfaceActivityTypeEnum predefinedType)
	{
		super(globalId, appliedLoad, globalOrLocal);
		this.predefinedType = predefinedType;
	}

	public IfcStructuralSurfaceActivityTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcStructuralSurfaceActivityTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

