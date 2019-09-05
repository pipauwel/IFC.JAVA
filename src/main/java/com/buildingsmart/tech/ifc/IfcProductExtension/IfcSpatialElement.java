// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a77e2e44-45fd-486d-8869-116757040301")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcSpatialElement extends com.buildingsmart.tech.ifc.IfcKernel.IfcProduct
{
	@JacksonXmlProperty(isAttribute=true, localName = "LongName")
	@Description("Long name for a spatial structure element, used for informal purposes. It should be used, if available, in conjunction with the inherited <em>Name</em> attribute.  <blockquote class=\"note\">    NOTE&nbsp; In many scenarios the <em>Name</em> attribute refers to the short name or number of a spacial element, and the <em>LongName</em> refers to the full descriptive name.  </blockquote>")
	@Guid("2bcb01eb-ff5e-4e42-a804-13d6364682a1")
	private String longName;

	@JacksonXmlProperty(isAttribute=false, localName = "ContainsElements")
	@Description("Set of spatial containment relationships, that holds those elements, which are contained within this element of the project spatial structure.  <blockquote class=\"note\">NOTE&nbsp; The spatial containment relationship, established by <em>IfcRelContainedInSpatialStructure</em>, is required to be an hierarchical relationship, where each element can only be assigned to 0 or 1 spatial structure element.</blockquote>")
	@Guid("ba25c1df-d29f-4d55-8f38-2390bf48ba41")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelContainedInSpatialStructure> containsElements = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelContainedInSpatialStructure>();

	@Description("Set of relationships to systems, that provides a certain service to the spatial element for which it is defined. The relationship is handled by the objectified relationship <em>IfcRelServicesBuildings</em>.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The inverse attribute has been promoted to the new supertype <em>IfcSpatialElement</em> with upward compatibility for file based exchange.</blockquote>")
	@Guid("15e959b7-d280-49c7-84da-b6470edf05ac")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelServicesBuildings> servicedBySystems = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelServicesBuildings>();

	@JacksonXmlProperty(isAttribute=false, localName = "ReferencesElements")
	@Description("Set of spatial reference relationships, that holds those elements, which are referenced, but not contained, within this element of the project spatial structure.  <blockquote class=\"change-ifc2x4\">NOTE&nbsp; The spatial reference relationship, established by <em>IfcRelReferencedInSpatialStructure</em>, is not required to be an hierarchical relationship, i.e. each element can be assigned to 0, 1 or many spatial structure elements.</blockquote>  <blockquote class=\"example\">EXAMPLE&nbsp; A curtain wall maybe contained in the ground floor, but maybe referenced in all floors, it reaches.</blockquote>  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The inverse attribute has been added with upward compatibility for file based exchange.</blockquote>  <blockquote class=\"change-ifc2x4\">Ø\\X")
	@Guid("b2b6b73c-8240-478f-94ac-454a8fb0cbd7")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelReferencedInSpatialStructure> referencesElements = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelReferencedInSpatialStructure>();


	public IfcSpatialElement()
	{
	}

	public IfcSpatialElement(String globalId)
	{
		super(globalId);
	}

	public String getLongName() {
		return this.longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelContainedInSpatialStructure> getContainsElements() {
		return this.containsElements;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelServicesBuildings> getServicedBySystems() {
		return this.servicedBySystems;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelReferencedInSpatialStructure> getReferencesElements() {
		return this.referencesElements;
	}


}

