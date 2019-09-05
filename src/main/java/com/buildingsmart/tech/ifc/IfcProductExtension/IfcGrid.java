// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("dfb6beda-5c7c-4df8-bbc6-b101ce4006f3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGrid extends com.buildingsmart.tech.ifc.IfcKernel.IfcProduct
{
	@Description("List of grid axes defining the first row of grid lines.")
	@Required()
	@MinLength(1)
	@Guid("bdb5916c-3554-4cf8-af9f-c8f845cd2167")
	private List<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcGridAxis> uAxes = new ArrayList<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcGridAxis>();

	@Description("List of grid axes defining the second row of grid lines.")
	@Required()
	@MinLength(1)
	@Guid("1717252a-3745-4aa4-a034-8dcd37a0d186")
	private List<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcGridAxis> vAxes = new ArrayList<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcGridAxis>();

	@Description("List of grid axes defining the third row of grid lines. It may be given in the case of a triangular grid.")
	@MinLength(1)
	@Guid("d9aa56a8-d4cc-43e3-ba44-e2f43708fed0")
	private List<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcGridAxis> wAxes = new ArrayList<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcGridAxis>();

	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Predefined types to define the particular type of the grid.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute.  </blockquote>")
	@Guid("dd530a2a-4234-4800-82ff-77018c7df73e")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcGridTypeEnum predefinedType;

	@Description("Relationship to a spatial structure element, to which the grid is primarily associated.  <blockquote class=\"change-ifc2x\">IFC2x CHANGE&nbsp; The inverse relationship has been added to <em>IfcGrid</em> with upward compatibility</blockquote>")
	@MaxLength(1)
	@Guid("eab7c659-344b-47a3-82ed-2c7243b71a28")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelContainedInSpatialStructure> containedInStructure = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelContainedInSpatialStructure>();


	public IfcGrid()
	{
	}

	public IfcGrid(String globalId, com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcGridAxis[] uAxes, com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcGridAxis[] vAxes)
	{
		super(globalId);
		this.uAxes = new ArrayList<>(Arrays.asList(uAxes));
		this.vAxes = new ArrayList<>(Arrays.asList(vAxes));
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcGridAxis> getUAxes() {
		return this.uAxes;
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcGridAxis> getVAxes() {
		return this.vAxes;
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcGridAxis> getWAxes() {
		return this.wAxes;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcGridTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcProductExtension.IfcGridTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelContainedInSpatialStructure> getContainedInStructure() {
		return this.containedInStructure;
	}


}

