// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain;

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
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDeviceType;
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcInterceptorTypeEnum;

@Guid("3e1ba150-53c8-4f6f-9108-9d1b7a4f8573")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcInterceptorType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDeviceType
{
	@DataMember(Order = 0)
	@Required()
	@Guid("59a62703-ed7f-4e93-8084-125d02bc8b41")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcInterceptorTypeEnum predefinedType;


	public IfcInterceptorType()
	{
	}

	public IfcInterceptorType(String globalId, IfcInterceptorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcInterceptorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcInterceptorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

