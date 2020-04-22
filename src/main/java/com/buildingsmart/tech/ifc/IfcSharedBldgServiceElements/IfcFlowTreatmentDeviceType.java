// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctSilencerType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcFilterType;
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcInterceptorType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("a8304da6-feeb-4df7-b790-40123a5f0a85")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcDuctSilencerType.class, name = "IfcDuctSilencerType"), @JsonSubTypes.Type(value = IfcFilterType.class, name = "IfcFilterType"), @JsonSubTypes.Type(value = IfcInterceptorType.class, name = "IfcInterceptorType")})
public abstract class IfcFlowTreatmentDeviceType extends IfcDistributionFlowElementType
{

	public IfcFlowTreatmentDeviceType()
	{
	}

	public IfcFlowTreatmentDeviceType(String globalId)
	{
		super(globalId);
	}


}

