// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRelCoversSpaces;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("ef5bd9a3-9472-49c9-9aa4-173b9444e09a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSpace extends IfcSpatialStructureElement implements IfcSpaceBoundarySelect
{
	@Description("Predefined generic types for a space that are specified in an enumeration. There might be property sets defined specifically for each predefined type.    <blockquote class=\"note\">NOTE&nbsp; Previous use had been to indicates whether the <em>IfcSpace</em> is an interior space by value INTERNAL, or an exterior space by value EXTERNAL. This use is now deprecated, the property 'IsExternal' at 'Pset_SpaceCommon' should be used instead.</blockquote>    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been renamed from <em>ExteriorOrInteriorSpace</em> with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 0)
	@Guid("39555f4a-a49d-4ba2-ac74-c53ebe97b98c")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcSpaceTypeEnum predefinedType;

	@Description("Level of flooring of this space; the average shall be taken, if the space ground surface is sloping or if there are level differences within this space.")
	@DataMember(Order = 1)
	@Guid("0c593fdb-4928-4a7e-b527-c275a3eff283")
	@JacksonXmlProperty(isAttribute=false, localName = "elevationWithFlooring")
	private IfcLengthMeasure elevationWithFlooring;

	@Description("Reference to <em>IfcCovering</em> by virtue of the objectified relationship <em>IfcRelCoversSpaces</em>. It defines the concept of a space having coverings assigned. Those coverings may represent different flooring, or tiling areas.    <blockquote class=\"note\">NOTE&nbsp; Coverings are often managed by the space, and not by the building element, which they cover.</blockquote>  <blockquote class=\"change-ifc2x3\">IFC2x Edition3 CHANGE&nbsp; New inverse relationship. Upward compatibility for file based exchange is guaranteed.</blockquote>")
	@InverseProperty(InverseProp = "relatingSpace", Range = "IfcRelCoversSpaces")
	@Guid("e169375e-bbf4-43b8-a679-bf64711c047f")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelCoversSpaces")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasCoverings")
	private Set<IfcRelCoversSpaces> hasCoverings;

	@Description("Reference to a set of <em>IfcRelSpaceBoundary</em>'s that defines the physical or virtual delimitation of that space against physical or virtual boundaries.")
	@InverseProperty(InverseProp = "relatingSpace", Range = "IfcRelSpaceBoundary")
	@Guid("618d511c-b181-48b0-85bd-f8e858015320")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelSpaceBoundary")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "boundedBy")
	private Set<IfcRelSpaceBoundary> boundedBy;


	public IfcSpace()
	{
	}

	public IfcSpace(String globalId)
	{
		super(globalId);
	}

	public IfcSpaceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSpaceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public IfcLengthMeasure getElevationWithFlooring() {
		return this.elevationWithFlooring;
	}

	public void setElevationWithFlooring(IfcLengthMeasure elevationWithFlooring) {
		this.elevationWithFlooring = elevationWithFlooring;
	}

	public Set<IfcRelCoversSpaces> getHasCoverings() {
		return this.hasCoverings;
	}

	public Set<IfcRelSpaceBoundary> getBoundedBy() {
		return this.boundedBy;
	}


}

