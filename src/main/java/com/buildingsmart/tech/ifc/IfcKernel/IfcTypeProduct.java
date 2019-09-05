// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("de22199b-0d1f-4205-842f-3dea858c822b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTypeProduct extends IfcTypeObject implements IfcProductSelect
{
	@Description("List of unique representation maps. Each representation map describes a block definition of the shape of the product style. By providing more than one representation map, a multi-view block definition can be given.")
	@MinLength(1)
	@Guid("f1cc5d32-2c48-43ef-9814-701621b457a5")
	private List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationMap> representationMaps = new ArrayList<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationMap>();

	@JacksonXmlProperty(isAttribute=true, localName = "Tag")
	@Description("The tag (or label) identifier at the particular type of a product, e.g. the article number (like the EAN). It is the identifier at the specific level.")
	@Guid("59d94263-1a31-4d38-8cb7-efb44b1a6814")
	private String tag;

	@Description("Reference to the <em>IfcRelAssignsToProduct</em> relationship, by which other products, processes, controls, resources or actors (as subtypes of <em>IfcObjectDefinition</em>) can be related to this product type.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp;  New inverse relationship.</blockquote>")
	@Guid("4ac81661-5fee-4465-897b-54cba1c0bfe6")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToProduct> referencedBy = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToProduct>();


	public IfcTypeProduct()
	{
	}

	public IfcTypeProduct(String globalId)
	{
		super(globalId);
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationMap> getRepresentationMaps() {
		return this.representationMaps;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToProduct> getReferencedBy() {
		return this.referencedBy;
	}


}

