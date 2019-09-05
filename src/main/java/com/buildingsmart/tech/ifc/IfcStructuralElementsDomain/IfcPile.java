// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("986bf516-0c1c-465d-992a-2150e7aabe95")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPile extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("The predefined generic type of the pile according to function.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional.  Type information can be provided by <em>IfcRelDefinesByType</em> and <em>IfcPileType</em>.</blockquote>")
	@Guid("d2a4fc10-ab8a-4025-a09e-59889c12124b")
	private com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcPileTypeEnum predefinedType;

	@JacksonXmlProperty(isAttribute=true, localName = "ConstructionType")
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Material profile association capability by means of <em>IfcRelAssociatesMaterial</em> has been added.  The attribute <em>ConstructionType</em> should not be used whenever its information can be provided by a material profile set, either associated with the <em>IfcPile</em> object or, if present, with a corresponding instance of <em>IfcPileType</em>.</blockquote>")
	@Guid("68d7f08c-9d56-4f95-ae87-2f3278162109")
	private com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcPileConstructionEnum constructionType;


	public IfcPile()
	{
	}

	public IfcPile(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcPileTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcPileTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcPileConstructionEnum getConstructionType() {
		return this.constructionType;
	}

	public void setConstructionType(com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcPileConstructionEnum constructionType) {
		this.constructionType = constructionType;
	}


}

