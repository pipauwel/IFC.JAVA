// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

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
import com.buildingsmart.tech.ifc.IfcTopologyResource.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcConnectedFaceSet;

@Guid("284e8880-6f10-4fea-873a-8e1ec3cf8cc0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFaceBasedSurfaceModel extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcSurfaceOrFaceSurface
{
	@Description("The set of connected face sets comprising the face based surface model.")
	@Required()
	@Guid("308594ab-aaa8-43db-a1ee-8f3d428b7337")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcConnectedFaceSet")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "FbsmFaces")
	private Set<IfcConnectedFaceSet> fbsmFaces;


	public IfcFaceBasedSurfaceModel()
	{
	}

	public IfcFaceBasedSurfaceModel(IfcConnectedFaceSet[] fbsmFaces)
	{
		this.fbsmFaces = new HashSet<>(Arrays.asList(fbsmFaces));
	}

	public Set<IfcConnectedFaceSet> getFbsmFaces() {
		return this.fbsmFaces;
	}

	public int getDim() {
		return 0;
	}


}

