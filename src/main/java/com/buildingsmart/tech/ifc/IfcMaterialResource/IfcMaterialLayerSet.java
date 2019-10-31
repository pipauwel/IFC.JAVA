// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMaterialResource.*;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialDefinition;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayer;

@Guid("c1a5e8bc-cb6b-4466-8130-d2946ca1f8a0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialLayerSet extends IfcMaterialDefinition
{
	@Description("Identification of the <em>IfcMaterialLayer</em>&rsquo;s from which the <em>IfcMaterialLayerSet</em> is composed.")
	@Required()
	@Guid("5a628a68-ffd7-4f73-aa3e-e72f2be216a1")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcMaterialLayer")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "MaterialLayers")
	private List<IfcMaterialLayer> materialLayers;

	@Description("The name by which the <em>IfcMaterialLayerSet</em> is known.")
	@Guid("64d28d03-21af-45f1-8409-87bc5674dfbe")
	@JacksonXmlProperty(isAttribute=true, localName = "LayerSetName")
	private String layerSetName;

	@Description("Definition of the <em>IfcMaterialLayerSet</em> in descriptive terms.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; The attribute has been added at the end of attribute list.  </blockquote>")
	@Guid("52a88214-0845-42fb-b617-1dbe7dc4dcdc")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;


	public IfcMaterialLayerSet()
	{
	}

	public IfcMaterialLayerSet(IfcMaterialLayer[] materialLayers)
	{
		this.materialLayers = new ArrayList<>(Arrays.asList(materialLayers));
	}

	public List<IfcMaterialLayer> getMaterialLayers() {
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

