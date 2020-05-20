// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("eb9cba99-d452-42f5-91a7-7d9d1195d90d")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcConnectionPointEccentricity.class, name = "IfcConnectionPointEccentricity"))
public class IfcConnectionPointGeometry extends IfcConnectionGeometry
{
	@Description("Point at which the connected object is aligned at the relating element, given in the LCS of the relating element.")
	@DataMember(Order = 0)
	@Required()
	@Guid("976628c1-26d5-43ee-819d-e2ef622cf70c")
	@JacksonXmlProperty(isAttribute=true, localName = "pointOnRelatingElement")
	private IfcPointOrVertexPoint pointOnRelatingElement;

	@Description("Point at which connected objects are aligned at the related element, given in the LCS of the related element. If the information is omitted, then the origin of the related element is used.")
	@DataMember(Order = 1)
	@Guid("393301b1-7137-4011-bbd9-6e513c7d079f")
	@JacksonXmlProperty(isAttribute=true, localName = "pointOnRelatedElement")
	private IfcPointOrVertexPoint pointOnRelatedElement;


	public IfcConnectionPointGeometry()
	{
	}

	public IfcConnectionPointGeometry(IfcPointOrVertexPoint pointOnRelatingElement)
	{
		this.pointOnRelatingElement = pointOnRelatingElement;
	}

	public IfcPointOrVertexPoint getPointOnRelatingElement() {
		return this.pointOnRelatingElement;
	}

	public void setPointOnRelatingElement(IfcPointOrVertexPoint pointOnRelatingElement) {
		this.pointOnRelatingElement = pointOnRelatingElement;
	}

	public IfcPointOrVertexPoint getPointOnRelatedElement() {
		return this.pointOnRelatedElement;
	}

	public void setPointOnRelatedElement(IfcPointOrVertexPoint pointOnRelatedElement) {
		this.pointOnRelatedElement = pointOnRelatedElement;
	}


}

