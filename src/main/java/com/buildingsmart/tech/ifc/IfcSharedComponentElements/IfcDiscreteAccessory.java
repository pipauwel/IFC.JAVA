// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("5ba7cc3f-c0c3-42e3-bfe3-f54531a32ef7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDiscreteAccessory extends IfcElementComponent
{
	@Description("Subtype of discrete accessory.  If USERDEFINED, the type is further qualified by means of the inherited attribute <em>ObjectType</em>.  Refer to <em>IfcDiscreteAccessoryType</em> for a non-exclusive list of userdefined type designations which are applicable to <em>IfcDiscreteAccessory</em> as well.")
	@DataMember(Order = 0)
	@Guid("563130f8-4a34-4ff4-bb1f-2c739a1dfa47")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcDiscreteAccessoryTypeEnum predefinedType;


	public IfcDiscreteAccessory()
	{
	}

	public IfcDiscreteAccessory(String globalId)
	{
		super(globalId);
	}

	public IfcDiscreteAccessoryTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDiscreteAccessoryTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

