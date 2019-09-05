// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1b957306-e396-43ea-b6ee-e7e28d37f9e9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDistributionPort extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort
{
	@JacksonXmlProperty(isAttribute=true, localName = "FlowDirection")
	@Description("Enumeration that identifies if this port is a Sink (inlet), a Source (outlet) or both a SinkAndSource.")
	@Guid("a44dc32a-3cf7-492e-98af-13a4db7286bf")
	private com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowDirectionEnum flowDirection;

	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("05f9c057-d349-4b93-91f9-6f8288935c79")
	private com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionPortTypeEnum predefinedType;

	@JacksonXmlProperty(isAttribute=true, localName = "SystemType")
	@Description("Enumeration that identifies the system type.  If a system type is defined, the port may only be connected to other ports having the same system type.")
	@Guid("d0969115-9b35-4d3f-b259-e5c103df1863")
	private com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionSystemEnum systemType;


	public IfcDistributionPort()
	{
	}

	public IfcDistributionPort(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowDirectionEnum getFlowDirection() {
		return this.flowDirection;
	}

	public void setFlowDirection(com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowDirectionEnum flowDirection) {
		this.flowDirection = flowDirection;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionPortTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionPortTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionSystemEnum getSystemType() {
		return this.systemType;
	}

	public void setSystemType(com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionSystemEnum systemType) {
		this.systemType = systemType;
	}


}

