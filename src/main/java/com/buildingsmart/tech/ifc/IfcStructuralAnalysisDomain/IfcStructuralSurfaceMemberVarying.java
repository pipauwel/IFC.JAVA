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
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceMember;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceMemberTypeEnum;

@Guid("66950826-279c-419b-94ba-f2cc8d28c876")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralSurfaceMemberVarying extends IfcStructuralSurfaceMember
{

	public IfcStructuralSurfaceMemberVarying()
	{
	}

	public IfcStructuralSurfaceMemberVarying(String globalId, IfcStructuralSurfaceMemberTypeEnum predefinedType)
	{
		super(globalId, predefinedType);
	}


}

