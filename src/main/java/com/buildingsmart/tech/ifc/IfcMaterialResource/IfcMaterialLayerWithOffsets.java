// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7b1a1c54-e0c2-488f-9134-36f48e15796a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialLayerWithOffsets extends IfcMaterialLayer
{
	@JacksonXmlProperty(isAttribute=true, localName = "OffsetDirection")
	@Description("Orientation of the offset; shall be perpendicular to the parent layer set direction.")
	@Required()
	@Guid("87429902-c8f3-4468-9d63-93f270258877")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcLayerSetDirectionEnum offsetDirection;

	@JacksonXmlProperty(isAttribute=true, localName = "OffsetValues")
	@Description("The numerical value of layer offset, in the direction of the axis assigned by the attribute <em>OffsetDirection</em>. The <em>OffsetValues[1]</em> identifies the offset from the lower position along the axis direction (normally the start of the standard extrusion), the <em>OffsetValues[2]</em> identifies the offset from the upper position along the axis direction (normally the end of the standard extrusion).")
	@Required()
	@MinLength(1)
	@MaxLength(2)
	@Guid("2461922a-f119-43ed-a1ef-ca1607b59b2b")
	private Double[] offsetValues;


	public IfcMaterialLayerWithOffsets()
	{
	}

	public IfcMaterialLayerWithOffsets(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure layerThickness, com.buildingsmart.tech.ifc.IfcMaterialResource.IfcLayerSetDirectionEnum offsetDirection, Double[] offsetValues)
	{
		super(layerThickness);
		this.offsetDirection = offsetDirection;
		this.offsetValues = offsetValues;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcLayerSetDirectionEnum getOffsetDirection() {
		return this.offsetDirection;
	}

	public void setOffsetDirection(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcLayerSetDirectionEnum offsetDirection) {
		this.offsetDirection = offsetDirection;
	}

	public Double[] getOffsetValues() {
		return this.offsetValues;
	}


}

