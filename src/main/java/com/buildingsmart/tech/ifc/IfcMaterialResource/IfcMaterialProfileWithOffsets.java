// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d4e70fb0-cafe-4e54-a0ae-0074daa2942a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialProfileWithOffsets extends IfcMaterialProfile
{
	@Description("The numerical value of profile offset, in the direction of the axis direction - always AXIS1 that is, the axis along the extrusion path. The <em>OffsetValues[1]</em> identifies the offset from the lower position along the axis direction (normally the start of the standard extrusion), the <em>OffsetValues[2]</em> identifies the offset from the upper position along the axis direction (normally the end of the standard extrusion).")
	@DataMember(Order = 0)
	@Required()
	@Guid("a1551007-b463-4a06-a0c7-6958bc00a9a9")
	@MinLength(1)
	@MaxLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcLengthMeasure")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "offsetValues")
	private IfcLengthMeasure[] offsetValues;


	public IfcMaterialProfileWithOffsets()
	{
	}

	public IfcMaterialProfileWithOffsets(IfcProfileDef profile, IfcLengthMeasure[] offsetValues)
	{
		super(profile);
		this.offsetValues = offsetValues;
	}

	public IfcLengthMeasure[] getOffsetValues() {
		return this.offsetValues;
	}


}

