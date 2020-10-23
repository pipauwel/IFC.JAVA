// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstraintResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcInteger;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("52a0c859-f1c0-4241-adbc-cefb7dba1a07")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcReference implements com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValueSelect, IfcMetricValueSelect
{
	@Description("Optional identifier of the entity or type such as 'IfcMaterialLayerSet'. For entity, type, or select-based references within a collection, this resolves the reference to such type.   If omitted, the type is assumed to be the same as the declared referencing attribute.    <blockquote class=\"example\">EXAMPLE&nbsp; <i>IfcRelAssociatesMaterial</i>.<i>RelatingMaterial</i> may be resolved to <i>IfcMaterialLayerSet</i>.</blockquote>")
	@DataMember(Order = 0)
	@Guid("9296cf24-0e54-4bba-8ade-a03d7c943f86")
	@JacksonXmlProperty(isAttribute=false, localName = "typeIdentifier")
	private IfcIdentifier typeIdentifier;

	@Description("Optionally identifies a direct or inverse attribute within an entity such as 'MaterialLayers'.   If <i>TypeIdentifier</i> is specified and refers to an entity, the attribute must exist within the referenced entity.  A null value indicates a reference to the type or entity itself, such as for indicating that the type of a value must match a specified constraint.")
	@DataMember(Order = 1)
	@Guid("825c70d1-c75f-4ff3-897d-132bdb4bbe13")
	@JacksonXmlProperty(isAttribute=false, localName = "attributeIdentifier")
	private IfcIdentifier attributeIdentifier;

	@Description("Optionally identifies an instance within a collection according to name.  If the instance has an attribute called 'Name', such attribute is used for comparison; otherwise the first STRING-based attribute of the entity is used.    <blockquote class=\"example\">EXAMPLE&nbsp; <i>IfcRoot</i>-based entities such as <i>IfcPropertySet</i> use the <i>Name</i> attribute; <i>IfcRepresentation</i> entities use the <i>RepresentationIdentifier</i> attribute.</blockquote>")
	@DataMember(Order = 2)
	@Guid("a911d000-d91f-48c2-aa54-872b9383db5c")
	@JacksonXmlProperty(isAttribute=false, localName = "instanceName")
	private IfcLabel instanceName;

	@Description("Optionally identifies an instance within a collection according to position starting at 1.  For referencing single-level collections, this attribute contains a single member; for referencing multi-level collections, then this LIST attribute contains multiple members starting from the outer-most index.")
	@DataMember(Order = 3)
	@Guid("dec4faf5-8fe8-497e-aa25-b29372c1a09e")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcInteger")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "listPositions")
	private List<IfcInteger> listPositions;

	@Description("Optional reference to an inner value for ENTITY, SELECT, SET, or LIST attributes.  A path may be formed by linking <i>IfcReference</i> instances together.  <blockquote class=\"example\">EXAMPLE&nbsp; A material layer thickness may be referenced using several instances:   #1=IFCREFERENCE($,'IfcSlab','HasAssociations',#2);   #2=IFCREFERENCE($,'IfcMaterialLayerSet','MaterialLayers',#3);   #3=IFCREFERENCE('Core','IfcMaterialLayer','LayerThickness',$);   </blockquote>")
	@DataMember(Order = 4)
	@Guid("889b3f67-4f49-48f8-b360-d95b00381b6c")
	@JacksonXmlProperty(isAttribute=false, localName = "innerReference")
	private IfcReference innerReference;


	public IfcReference()
	{
	}

	public IfcIdentifier getTypeIdentifier() {
		return this.typeIdentifier;
	}

	public void setTypeIdentifier(IfcIdentifier typeIdentifier) {
		this.typeIdentifier = typeIdentifier;
	}

	public IfcIdentifier getAttributeIdentifier() {
		return this.attributeIdentifier;
	}

	public void setAttributeIdentifier(IfcIdentifier attributeIdentifier) {
		this.attributeIdentifier = attributeIdentifier;
	}

	public IfcLabel getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(IfcLabel instanceName) {
		this.instanceName = instanceName;
	}

	public List<IfcInteger> getListPositions() {
		return this.listPositions;
	}

	public IfcReference getInnerReference() {
		return this.innerReference;
	}

	public void setInnerReference(IfcReference innerReference) {
		this.innerReference = innerReference;
	}


}

