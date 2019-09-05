// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b5068876-210f-4343-a93a-674f2a9e63ff")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelSpaceBoundary extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Reference to one spaces that is delimited by this boundary.")
	@Required()
	@Guid("f8599c4e-f4c7-493b-acaf-453c795e6070")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpaceBoundarySelect relatingSpace;

	@JacksonXmlProperty(isAttribute=false, localName = "RelatedBuildingElement")
	@Description("Reference to <strike>Building</strike> Element, that defines the Space Boundaries.  <blockquote class=\"change-ifc2x\">IFC2x CHANGE&nbsp; The data type has been changed from <em>IfcBuildingElement</em> to <em>IfcElement</em> with upward compatibility for file based exchange. </blockquote>    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to be mandatory.</blockquote>")
	@Required()
	@Guid("6523e107-ea64-416e-a049-ceda315c7e48")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatedBuildingElement;

	@JacksonXmlProperty(isAttribute=false, localName = "ConnectionGeometry")
	@Description("Physical representation of the space boundary. Provided as a <u>curve or</u> surface given within the LCS of the space.  <blockquote class=\"change-ifc2x\">IFC2x CHANGE&nbsp; The data type has been changed from <em>IfcConnectionSurfaceGeometry</em> to <em>IfcConnectionGeometry</em> with upward compatibility for file based exchange.</blockquote>")
	@Guid("1e9b8391-2d9c-4039-8d4a-922a0ee5c8c2")
	private com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionGeometry connectionGeometry;

	@JacksonXmlProperty(isAttribute=true, localName = "PhysicalOrVirtualBoundary")
	@Description("Defines, whether the Space Boundary is physical (Physical) or virtual (Virtual).")
	@Required()
	@Guid("229c3b86-471b-488d-bcb1-333acb26d486")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcPhysicalOrVirtualEnum physicalOrVirtualBoundary;

	@JacksonXmlProperty(isAttribute=true, localName = "InternalOrExternalBoundary")
	@Description("Defines, whether the Space Boundary is internal (Internal), or external, i.e. adjacent to open space (that can be an partially enclosed space, such as terrace (External).")
	@Required()
	@Guid("8a88debb-6d88-4f0b-80bc-706ba9f88f51")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcInternalOrExternalEnum internalOrExternalBoundary;


	public IfcRelSpaceBoundary()
	{
	}

	public IfcRelSpaceBoundary(String globalId, com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpaceBoundarySelect relatingSpace, com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatedBuildingElement, com.buildingsmart.tech.ifc.IfcProductExtension.IfcPhysicalOrVirtualEnum physicalOrVirtualBoundary, com.buildingsmart.tech.ifc.IfcProductExtension.IfcInternalOrExternalEnum internalOrExternalBoundary)
	{
		super(globalId);
		this.relatingSpace = relatingSpace;
		this.relatedBuildingElement = relatedBuildingElement;
		this.physicalOrVirtualBoundary = physicalOrVirtualBoundary;
		this.internalOrExternalBoundary = internalOrExternalBoundary;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpaceBoundarySelect getRelatingSpace() {
		return this.relatingSpace;
	}

	public void setRelatingSpace(com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpaceBoundarySelect relatingSpace) {
		this.relatingSpace = relatingSpace;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement getRelatedBuildingElement() {
		return this.relatedBuildingElement;
	}

	public void setRelatedBuildingElement(com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatedBuildingElement) {
		this.relatedBuildingElement = relatedBuildingElement;
	}

	public com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionGeometry getConnectionGeometry() {
		return this.connectionGeometry;
	}

	public void setConnectionGeometry(com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionGeometry connectionGeometry) {
		this.connectionGeometry = connectionGeometry;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcPhysicalOrVirtualEnum getPhysicalOrVirtualBoundary() {
		return this.physicalOrVirtualBoundary;
	}

	public void setPhysicalOrVirtualBoundary(com.buildingsmart.tech.ifc.IfcProductExtension.IfcPhysicalOrVirtualEnum physicalOrVirtualBoundary) {
		this.physicalOrVirtualBoundary = physicalOrVirtualBoundary;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcInternalOrExternalEnum getInternalOrExternalBoundary() {
		return this.internalOrExternalBoundary;
	}

	public void setInternalOrExternalBoundary(com.buildingsmart.tech.ifc.IfcProductExtension.IfcInternalOrExternalEnum internalOrExternalBoundary) {
		this.internalOrExternalBoundary = internalOrExternalBoundary;
	}


}

