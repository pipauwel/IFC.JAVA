// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c1a5e8bc-cb6b-4466-8130-d2946ca1f8a0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialLayerSet extends IfcMaterialDefinition
{
	@Description("Identification of the <em>IfcMaterialLayer</em>&rsquo;s from which the <em>IfcMaterialLayerSet</em> is composed.")
	@Required()
	@MinLength(1)
	@Guid("5a628a68-ffd7-4f73-aa3e-e72f2be216a1")
	private List<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayer> materialLayers = new ArrayList<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayer>();

	@JacksonXmlProperty(isAttribute=true, localName = "LayerSetName")
	@Description("The name by which the <em>IfcMaterialLayerSet</em> is known.")
	@Guid("64d28d03-21af-45f1-8409-87bc5674dfbe")
	private String layerSetName;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Definition of the <em>IfcMaterialLayerSet</em> in descriptive terms.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; The attribute has been added at the end of attribute list.  </blockquote>")
	@Guid("52a88214-0845-42fb-b617-1dbe7dc4dcdc")
	private String description;


	public IfcMaterialLayerSet()
	{
	}

	public IfcMaterialLayerSet(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayer[] materialLayers)
	{
		this.materialLayers = new ArrayList<>(Arrays.asList(materialLayers));
	}

	public List<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayer> getMaterialLayers() {
		return this.materialLayers;
	}

	public String getLayerSetName() {
		return this.layerSetName;
	}

	public void setLayerSetName(String layerSetName) {
		this.layerSetName = layerSetName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getTotalThickness() {
		return 0.0;
	}


}

