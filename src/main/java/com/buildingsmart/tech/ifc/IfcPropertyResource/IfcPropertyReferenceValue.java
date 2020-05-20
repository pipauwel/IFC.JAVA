// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7c1a56a5-26cf-4e5b-932f-55d94501a267")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertyReferenceValue extends IfcSimpleProperty
{
	@Description("Description of the use of the referenced value within the property. It is a descriptive text that may hold an expression or other additional information.")
	@DataMember(Order = 0)
	@Guid("3f4121ae-3567-4718-8910-fd4fd7fc9822")
	@JacksonXmlProperty(isAttribute=false, localName = "usageName")
	private IfcText usageName;

	@Description("Reference to another property entity through one of the select types in the <em>IfcObjectReferenceSelect</em>.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been made optional with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 1)
	@Guid("adf61d9f-3105-4adb-bf7d-b567adaae2f6")
	@JacksonXmlProperty(isAttribute=true, localName = "propertyReference")
	private IfcObjectReferenceSelect propertyReference;


	public IfcPropertyReferenceValue()
	{
	}

	public IfcPropertyReferenceValue(IfcIdentifier name)
	{
		super(name);
	}

	public IfcText getUsageName() {
		return this.usageName;
	}

	public void setUsageName(IfcText usageName) {
		this.usageName = usageName;
	}

	public IfcObjectReferenceSelect getPropertyReference() {
		return this.propertyReference;
	}

	public void setPropertyReference(IfcObjectReferenceSelect propertyReference) {
		this.propertyReference = propertyReference;
	}


}

