// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation;

@Guid("3968ca44-8f3e-43f2-ab19-855d7709487b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRepresentationMap implements com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcProductRepresentationSelect
{
	@Description("An axis2 placement that defines the position about which the mapped  representation is mapped.")
	@Required()
	@Guid("ccc26f1c-a4ae-4b02-8980-7af9a9680d54")
	@JacksonXmlProperty(isAttribute=true, localName = "MappingOrigin")
	private IfcAxis2Placement mappingOrigin;

	@Description("A representation that is mapped to at least one mapped item.")
	@Required()
	@Guid("66c50edd-89c8-4bf7-9312-05facd806895")
	@JacksonXmlProperty(isAttribute=false, localName = "MappedRepresentation")
	private IfcRepresentation mappedRepresentation;

	@Description("Reference to the shape aspect that represents part of the shape or its feature distinctively.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; Inverse attribute added.  </blockquote>")
	@Guid("706e409b-b397-4d89-af8c-f070939b0668")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcShapeAspect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasShapeAspects")
	private Set<IfcShapeAspect> hasShapeAspects;

	@Guid("10781165-90b6-4b8f-bb3e-340053c55543")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcMappedItem")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "MapUsage")
	private Set<IfcMappedItem> mapUsage;


	public IfcRepresentationMap()
	{
	}

	public IfcRepresentationMap(IfcAxis2Placement mappingOrigin, IfcRepresentation mappedRepresentation)
	{
		this.mappingOrigin = mappingOrigin;
		this.mappedRepresentation = mappedRepresentation;
	}

	public IfcAxis2Placement getMappingOrigin() {
		return this.mappingOrigin;
	}

	public void setMappingOrigin(IfcAxis2Placement mappingOrigin) {
		this.mappingOrigin = mappingOrigin;
	}

	public IfcRepresentation getMappedRepresentation() {
		return this.mappedRepresentation;
	}

	public void setMappedRepresentation(IfcRepresentation mappedRepresentation) {
		this.mappedRepresentation = mappedRepresentation;
	}

	public Set<IfcShapeAspect> getHasShapeAspects() {
		return this.hasShapeAspects;
	}

	public Set<IfcMappedItem> getMapUsage() {
		return this.mapUsage;
	}


}

