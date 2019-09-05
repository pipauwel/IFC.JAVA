// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("3968ca44-8f3e-43f2-ab19-855d7709487b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRepresentationMap implements com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcProductRepresentationSelect
{
	@Description("An axis2 placement that defines the position about which the mapped  representation is mapped.")
	@Required()
	@Guid("ccc26f1c-a4ae-4b02-8980-7af9a9680d54")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement mappingOrigin;

	@JacksonXmlProperty(isAttribute=false, localName = "MappedRepresentation")
	@Description("A representation that is mapped to at least one mapped item.")
	@Required()
	@Guid("66c50edd-89c8-4bf7-9312-05facd806895")
	private com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation mappedRepresentation;

	@Description("Reference to the shape aspect that represents part of the shape or its feature distinctively.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; Inverse attribute added.  </blockquote>")
	@Guid("706e409b-b397-4d89-af8c-f070939b0668")
	private Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect> hasShapeAspects = new HashSet<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect>();

	@Guid("10781165-90b6-4b8f-bb3e-340053c55543")
	private Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcMappedItem> mapUsage = new HashSet<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcMappedItem>();


	public IfcRepresentationMap()
	{
	}

	public IfcRepresentationMap(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement mappingOrigin, com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation mappedRepresentation)
	{
		this.mappingOrigin = mappingOrigin;
		this.mappedRepresentation = mappedRepresentation;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement getMappingOrigin() {
		return this.mappingOrigin;
	}

	public void setMappingOrigin(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement mappingOrigin) {
		this.mappingOrigin = mappingOrigin;
	}

	public com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation getMappedRepresentation() {
		return this.mappedRepresentation;
	}

	public void setMappedRepresentation(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation mappedRepresentation) {
		this.mappedRepresentation = mappedRepresentation;
	}

	public Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcShapeAspect> getHasShapeAspects() {
		return this.hasShapeAspects;
	}

	public Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcMappedItem> getMapUsage() {
		return this.mapUsage;
	}


}

