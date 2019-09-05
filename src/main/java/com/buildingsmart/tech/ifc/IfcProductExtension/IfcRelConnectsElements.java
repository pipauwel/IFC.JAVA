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

@Guid("2749c418-fb5d-400d-92ce-0c491a55cbd7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelConnectsElements extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@JacksonXmlProperty(isAttribute=false, localName = "ConnectionGeometry")
	@Description("The geometric shape representation of the connection geometry that is provided in the object coordinate system of the <em>RelatingElement</em> (mandatory) and in the object coordinate system of the <em>RelatedElement</em> (optionally).")
	@Guid("5b2207fa-16ea-4fe2-900a-652e7e2b521e")
	private com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionGeometry connectionGeometry;

	@JacksonXmlProperty(isAttribute=false, localName = "RelatingElement")
	@Description("Reference to a subtype of <em>IfcElement</em> that is connected by the connection relationship in the role of <em>RelatingElement</em>.")
	@Required()
	@Guid("f875bb4c-3105-4b90-a8d1-25dfc10e0f90")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatingElement;

	@JacksonXmlProperty(isAttribute=false, localName = "RelatedElement")
	@Description("Reference to a subtype of <em>IfcElement</em> that is connected by the connection relationship in the role of <em>RelatedElement</em>.")
	@Required()
	@Guid("eb56d278-f844-4217-8731-9c4cc688940e")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatedElement;


	public IfcRelConnectsElements()
	{
	}

	public IfcRelConnectsElements(String globalId, com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatingElement, com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatedElement)
	{
		super(globalId);
		this.relatingElement = relatingElement;
		this.relatedElement = relatedElement;
	}

	public com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionGeometry getConnectionGeometry() {
		return this.connectionGeometry;
	}

	public void setConnectionGeometry(com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcConnectionGeometry connectionGeometry) {
		this.connectionGeometry = connectionGeometry;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement getRelatingElement() {
		return this.relatingElement;
	}

	public void setRelatingElement(com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatingElement) {
		this.relatingElement = relatingElement;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement getRelatedElement() {
		return this.relatedElement;
	}

	public void setRelatedElement(com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatedElement) {
		this.relatedElement = relatedElement;
	}


}

