// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e531750b-2617-4ede-a937-600436a845d0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFilterType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDeviceType
{
	@Description("The type of air filter.")
	@DataMember(Order = 0)
	@Required()
	@Guid("449d9bdb-9417-4757-b740-445955b5c858")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcFilterTypeEnum predefinedType;


	public IfcFilterType()
	{
	}

	public IfcFilterType(String globalId, IfcFilterTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcFilterTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFilterTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

