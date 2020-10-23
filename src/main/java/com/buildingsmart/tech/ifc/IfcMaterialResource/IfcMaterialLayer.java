// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1550d694-6c4a-46c4-9661-12b1956f035d")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcMaterialLayerWithOffsets.class, name = "IfcMaterialLayerWithOffsets"))
public class IfcMaterialLayer extends IfcMaterialDefinition
{
	@Description("Optional reference to the material from which the layer is constructed. Note that if this value is not given, it does not denote a layer with no material (an air gap), it only means that the material is not specified at that point.")
	@DataMember(Order = 0)
	@Guid("5e1b64ef-4e51-4312-8c39-0c01567e2571")
	@JacksonXmlProperty(isAttribute=false, localName = "material")
	private IfcMaterial material;

	@Description("The thickness of the material layer. The meaning of \"thickness\" depends on its usage. In case of building elements elements utilizing <em>IfcMaterialLayerSetUsage</em>, the dimension is measured along the positive <em>LayerSetDirection</em> as specified in <em>IfcMaterialLayerSetUsage</em>.    <blockquote class=\"note\">NOTE&nbsp; The attribute value can be 0. for material thicknesses very close to zero, such as for a membrane. Material layers with thickess 0. may not be rendered in the geometric representation.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute datatype has been changed to <em>IfcNonNegativeLengthMeasure</em> allowing for 0. as thickness.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("37ff71f7-f0fc-487e-b121-8627e1c4e98a")
	@JacksonXmlProperty(isAttribute=false, localName = "layerThickness")
	private IfcNonNegativeLengthMeasure layerThickness;

	@Description("Indication of whether the material layer represents an air layer (or cavity).   <ul>    <li class=\"small\">set to TRUE if the material layer is an air gap and provides air exchange from the layer to the outside air.</li>    <li class=\"small\">set to UNKNOWN if the material layer is an air gap and does not provide air exchange (or when this information about air exchange of the air gap is not available).</li>    <li class=\"small\">set to FALSE if the material layer is a solid material layer (the default).</li>   </ul>")
	@DataMember(Order = 2)
	@Guid("e6dcc683-da58-48b5-959e-f29b34e3b2e2")
	@JacksonXmlProperty(isAttribute=false, localName = "isVentilated")
	private IfcLogical isVentilated;

	@Description("The name by which the material layer is known.")
	@DataMember(Order = 3)
	@Guid("7d73652c-4300-4f34-8cf4-e54ea78193cd")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("Definition of the material layer in more descriptive terms than given by attributes Name or Category.")
	@DataMember(Order = 4)
	@Guid("0bc92180-96da-475d-b6d4-3cdef5c86dc3")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;

	@Description("Category of the material layer, e.g. the role it has in the layer set it belongs to (such as 'load bearing', 'thermal insulation' etc.). The list of keywords might be extended by model view definitions, however the following keywords shall apply in general:  <ul>   <li class=\"small\">'LoadBearing' &mdash; for all material layers having a load bearing function.</li>   <li class=\"small\">'Insulation' &mdash; for all material layers having an insolating function. </li>   <li class=\"small\">'Inner finish' &mdash; for the material layer being the inner finish.</li>   <li class=\"small\">'Outer finish' &mdash; for the material layer being the outer finish.</li>  </ul>")
	@DataMember(Order = 5)
	@Guid("9675de3e-375b-4012-ad71-905a53587020")
	@JacksonXmlProperty(isAttribute=false, localName = "category")
	private IfcLabel category;

	@Description("The relative priority of the layer, expressed as normalised integer range [0..100]. Controls how layers intersect in connections and corners of building elements: a layer from one element protrudes into (i.e. displaces) a layer from another element in a joint of these elements if the former element's layer has higher priority than the latter. The priority value for a material layer in an element has to be set and maintained by software applications in relation to the material layers in connected elements.    <blockquote class=\"note\">NOTE&nbsp; The layer priority at a connection may be overridden by the priority attributes of <em>IfcRelConnectsPathElements</em> if that relationship is used to establish a logical connection between two building elements having a layer structure.</blockquote>")
	@DataMember(Order = 6)
	@Guid("4c9dfd48-454b-4406-93cb-179480e17654")
	@JacksonXmlProperty(isAttribute=false, localName = "priority")
	private IfcInteger priority;

	@Description("Reference to the <em>IfcMaterialLayerSet</em> in which the material layer is included.")
	@InverseProperty(InverseProp = "materialLayers", Range = "IfcMaterialLayerSet")
	@Guid("f2c9c962-d35f-4ea5-b566-2dba24893f5a")
	/*@JacksonXmlProperty(isAttribute=false, localName = "toMaterialLayerSet")*/
	@JsonIgnore
	private IfcMaterialLayerSet toMaterialLayerSet;


	public IfcMaterialLayer()
	{
	}

	public IfcMaterialLayer(IfcNonNegativeLengthMeasure layerThickness)
	{
		this.layerThickness = layerThickness;
	}

	public IfcMaterial getMaterial() {
		return this.material;
	}

	public void setMaterial(IfcMaterial material) {
		this.material = material;
	}

	public IfcNonNegativeLengthMeasure getLayerThickness() {
		return this.layerThickness;
	}

	public void setLayerThickness(IfcNonNegativeLengthMeasure layerThickness) {
		this.layerThickness = layerThickness;
	}

	public IfcLogical getIsVentilated() {
		return this.isVentilated;
	}

	public void setIsVentilated(IfcLogical isVentilated) {
		this.isVentilated = isVentilated;
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}

	public IfcText getDescription() {
		return this.description;
	}

	public void setDescription(IfcText description) {
		this.description = description;
	}

	public IfcLabel getCategory() {
		return this.category;
	}

	public void setCategory(IfcLabel category) {
		this.category = category;
	}

	public IfcInteger getPriority() {
		return this.priority;
	}

	public void setPriority(IfcInteger priority) {
		this.priority = priority;
	}

	public IfcMaterialLayerSet getToMaterialLayerSet() {
		return this.toMaterialLayerSet;
	}

	public void setToMaterialLayerSet(IfcMaterialLayerSet toMaterialLayerSet) {
		this.toMaterialLayerSet = toMaterialLayerSet;
	}


}

