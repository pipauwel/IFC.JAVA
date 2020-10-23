// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7b1a1c54-e0c2-488f-9134-36f48e15796a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialLayerWithOffsets extends IfcMaterialLayer
{
	@Description("Orientation of the offset; shall be perpendicular to the parent layer set direction.")
	@DataMember(Order = 0)
	@Required()
	@Guid("87429902-c8f3-4468-9d63-93f270258877")
	@JacksonXmlProperty(isAttribute=true, localName = "offsetDirection")
	private IfcLayerSetDirectionEnum offsetDirection;

	@Description("The numerical value of layer offset, in the direction of the axis assigned by the attribute <em>OffsetDirection</em>. The <em>OffsetValues[1]</em> identifies the offset from the lower position along the axis direction (normally the start of the standard extrusion), the <em>OffsetValues[2]</em> identifies the offset from the upper position along the axis direction (normally the end of the standard extrusion).")
	@DataMember(Order = 1)
	@Required()
	@Guid("2461922a-f119-43ed-a1ef-ca1607b59b2b")
	@MinLength(1)
	@MaxLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcLengthMeasure")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "offsetValues")
	private IfcLengthMeasure[] offsetValues;


	public IfcMaterialLayerWithOffsets()
	{
	}

	public IfcMaterialLayerWithOffsets(IfcNonNegativeLengthMeasure layerThickness, IfcLayerSetDirectionEnum offsetDirection, IfcLengthMeasure[] offsetValues)
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

	public IfcLengthMeasure[] getOffsetValues() {
		return this.offsetValues;
	}


}

