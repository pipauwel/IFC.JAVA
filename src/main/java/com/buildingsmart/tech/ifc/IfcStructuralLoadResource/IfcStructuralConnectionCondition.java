// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ea3beaa7-301b-4f86-8c4f-4356baa1c79f")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcFailureConnectionCondition.class, name = "IfcFailureConnectionCondition"), @JsonSubTypes.Type(value = IfcSlippageConnectionCondition.class, name = "IfcSlippageConnectionCondition")})
public abstract class IfcStructuralConnectionCondition
{
	@Description("Optionally defines a name for this connection condition.")
	@DataMember(Order = 0)
	@Guid("a1bcf73e-6ba2-4b5b-bcda-3b3e613a4703")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;


	public IfcStructuralConnectionCondition()
	{
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}


}

