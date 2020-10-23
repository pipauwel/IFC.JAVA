// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("c1a5e8bc-cb6b-4466-8130-d2946ca1f8a0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialLayerSet extends IfcMaterialDefinition
{
	@Description("Identification of the <em>IfcMaterialLayer</em>&rsquo;s from which the <em>IfcMaterialLayerSet</em> is composed.")
	@DataMember(Order = 0)
	@Required()
	@Guid("5a628a68-ffd7-4f73-aa3e-e72f2be216a1")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcMaterialLayer")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "materialLayers")
	private List<IfcMaterialLayer> materialLayers;

	@Description("The name by which the <em>IfcMaterialLayerSet</em> is known.")
	@DataMember(Order = 1)
	@Guid("64d28d03-21af-45f1-8409-87bc5674dfbe")
	@JacksonXmlProperty(isAttribute=false, localName = "layerSetName")
	private IfcLabel layerSetName;

	@Description("Definition of the <em>IfcMaterialLayerSet</em> in descriptive terms.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; The attribute has been added at the end of attribute list.  </blockquote>")
	@DataMember(Order = 2)
	@Guid("52a88214-0845-42fb-b617-1dbe7dc4dcdc")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;


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

	public IfcLabel getLayerSetName() {
		return this.layerSetName;
	}

	public void setLayerSetName(IfcLabel layerSetName) {
		this.layerSetName = layerSetName;
	}

	public IfcText getDescription() {
		return this.description;
	}

	public void setDescription(IfcText description) {
		this.description = description;
	}

	@JsonIgnore
	public double getTotalThickness() {
		//TODO
		// TotalThickness:=IfcMlsTotalThickness(SELF)
		return 0.0;
	}


}

