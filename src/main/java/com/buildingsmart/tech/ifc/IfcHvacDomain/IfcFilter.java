// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("fbd8918c-206e-4acf-a0db-5cf33829a98a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFilter extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDevice
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("304be249-0ed2-41a4-9f5e-62c0cfecb414")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFilterTypeEnum predefinedType;


	public IfcFilter()
	{
	}

	public IfcFilter(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFilterTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFilterTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

