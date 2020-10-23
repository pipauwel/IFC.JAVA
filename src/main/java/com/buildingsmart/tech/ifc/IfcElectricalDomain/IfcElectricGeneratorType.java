// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("54734959-8b52-4b23-a9b5-eef44edf8450")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricGeneratorType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("<p>Identifies the predefined types of electric generators from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("90ecd934-9e91-4662-8702-396d56f10ca2")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcElectricGeneratorTypeEnum predefinedType;


	public IfcElectricGeneratorType()
	{
	}

	public IfcElectricGeneratorType(String globalId, IfcElectricGeneratorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcElectricGeneratorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElectricGeneratorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

