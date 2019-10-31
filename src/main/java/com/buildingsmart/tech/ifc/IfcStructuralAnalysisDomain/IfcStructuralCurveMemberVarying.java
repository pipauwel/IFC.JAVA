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
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralCurveMember;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralCurveMemberTypeEnum;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection;

@Guid("4e0d2a97-7485-4958-a7af-66da7c2d8c31")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralCurveMemberVarying extends IfcStructuralCurveMember
{

	public IfcStructuralCurveMemberVarying()
	{
	}

	public IfcStructuralCurveMemberVarying(String globalId, IfcStructuralCurveMemberTypeEnum predefinedType, IfcDirection axis)
	{
		super(globalId, predefinedType, axis);
	}


}

