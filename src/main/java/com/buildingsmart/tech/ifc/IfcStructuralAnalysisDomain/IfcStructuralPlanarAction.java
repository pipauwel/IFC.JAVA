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
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceAction;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceActivityTypeEnum;

@Guid("5b95095d-4d9c-4dd1-a2ae-b405d104fffe")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralPlanarAction extends IfcStructuralSurfaceAction
{

	public IfcStructuralPlanarAction()
	{
	}

	public IfcStructuralPlanarAction(String globalId, IfcStructuralLoad appliedLoad, IfcGlobalOrLocalEnum globalOrLocal, IfcStructuralSurfaceActivityTypeEnum predefinedType)
	{
		super(globalId, appliedLoad, globalOrLocal, predefinedType);
	}


}

