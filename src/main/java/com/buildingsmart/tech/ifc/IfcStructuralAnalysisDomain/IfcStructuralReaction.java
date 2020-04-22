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
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralCurveReaction;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralPointReaction;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceReaction;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralActivity;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum;

@Guid("f0e940ad-cfed-49d8-a850-023bd268a88a")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcStructuralCurveReaction.class, name = "IfcStructuralCurveReaction"), @JsonSubTypes.Type(value = IfcStructuralPointReaction.class, name = "IfcStructuralPointReaction"), @JsonSubTypes.Type(value = IfcStructuralSurfaceReaction.class, name = "IfcStructuralSurfaceReaction")})
public abstract class IfcStructuralReaction extends IfcStructuralActivity
{

	public IfcStructuralReaction()
	{
	}

	public IfcStructuralReaction(String globalId, IfcStructuralLoad appliedLoad, IfcGlobalOrLocalEnum globalOrLocal)
	{
		super(globalId, appliedLoad, globalOrLocal);
	}


}

