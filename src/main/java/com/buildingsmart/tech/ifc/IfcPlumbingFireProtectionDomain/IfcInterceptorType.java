// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("3e1ba150-53c8-4f6f-9108-9d1b7a4f8573")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcInterceptorType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDeviceType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Required()
	@Guid("59a62703-ed7f-4e93-8084-125d02bc8b41")
	private com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcInterceptorTypeEnum predefinedType;


	public IfcInterceptorType()
	{
	}

	public IfcInterceptorType(String globalId, com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcInterceptorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcInterceptorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcInterceptorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

