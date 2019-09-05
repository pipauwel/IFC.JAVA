// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e531750b-2617-4ede-a937-600436a845d0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFilterType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDeviceType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("The type of air filter.")
	@Required()
	@Guid("449d9bdb-9417-4757-b740-445955b5c858")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFilterTypeEnum predefinedType;


	public IfcFilterType()
	{
	}

	public IfcFilterType(String globalId, com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFilterTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFilterTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFilterTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

