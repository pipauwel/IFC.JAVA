// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b80d3213-eccf-4e8a-84a3-21c1381ff3cc")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcSchedulingTime
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Optional name for the time definition.")
	@Guid("9ce7ee5d-0c3d-4394-9ba0-4cd0ff38d925")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "DataOrigin")
	@Description("Specifies the origin of the scheduling time entity. It currently      differentiates between predicted, simulated, measured, and user defined values.")
	@Guid("a82843cd-7cb9-4fac-b255-c3bf8dfcfcc1")
	private com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDataOriginEnum dataOrigin;

	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedDataOrigin")
	@Description("Value of the data origin if DataOrigin attribute is USERDEFINED.")
	@Guid("9619b2c7-3037-4380-8c25-83f4ded0ab84")
	private String userDefinedDataOrigin;


	public IfcSchedulingTime()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDataOriginEnum getDataOrigin() {
		return this.dataOrigin;
	}

	public void setDataOrigin(com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDataOriginEnum dataOrigin) {
		this.dataOrigin = dataOrigin;
	}

	public String getUserDefinedDataOrigin() {
		return this.userDefinedDataOrigin;
	}

	public void setUserDefinedDataOrigin(String userDefinedDataOrigin) {
		this.userDefinedDataOrigin = userDefinedDataOrigin;
	}


}

