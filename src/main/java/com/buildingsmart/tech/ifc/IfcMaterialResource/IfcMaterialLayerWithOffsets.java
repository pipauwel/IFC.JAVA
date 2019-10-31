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
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayer;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcLayerSetDirectionEnum;

@Guid("7b1a1c54-e0c2-488f-9134-36f48e15796a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialLayerWithOffsets extends IfcMaterialLayer
{
	@Description("Orientation of the offset; shall be perpendicular to the parent layer set direction.")
	@Required()
	@Guid("87429902-c8f3-4468-9d63-93f270258877")
	@JacksonXmlProperty(isAttribute=true, localName = "OffsetDirection")
	private IfcLayerSetDirectionEnum offsetDirection;

	@Description("The numerical value of layer offset, in the direction of the axis assigned by the attribute <em>OffsetDirection</em>. The <em>OffsetValues[1]</em> identifies the offset from the lower position along the axis direction (normally the start of the standard extrusion), the <em>OffsetValues[2]</em> identifies the offset from the upper position along the axis direction (normally the end of the standard extrusion).")
	@Required()
	@Guid("2461922a-f119-43ed-a1ef-ca1607b59b2b")
	@MinLength(1)
	@MaxLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "OffsetValues")
	private Double[] offsetValues;


	public IfcMaterialLayerWithOffsets()
	{
	}

	public IfcMaterialLayerWithOffsets(IfcNonNegativeLengthMeasure layerThickness, IfcLayerSetDirectionEnum offsetDirection, Double[] offsetValues)
	{
		super(layerThickness);
		this.offsetDirection = offsetDirection;
		this.offsetValues = offsetValues;
	}

	public IfcLayerSetDirectionEnum getOffsetDirection() {
		return this.offsetDirection;
	}

	public void setOffsetDirection(IfcLayerSetDirectionEnum offsetDirection) {
		this.offsetDirection = offsetDirection;
	}

	public Double[] getOffsetValues() {
		return this.offsetValues;
	}


}

