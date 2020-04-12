// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c8722acc-8737-44f1-b24d-0eb804a9a4da")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcComplexProperty extends IfcProperty
{
	@Description("Usage description of the <em>IfcComplexProperty</em> within the property set which references the <em>IfcComplexProperty</em>.  <blockquote class=\"note\">NOTE&nbsp; Consider a complex property for glazing properties. The <em>Name</em> attribute of the <em>IfcComplexProperty</em> could be <em>Pset_GlazingProperties</em>, and the UsageName attribute could be <em>OuterGlazingPane</em>.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("f21a5e51-7581-416f-943f-25398d2e3c4d")
	@JacksonXmlProperty(isAttribute=true, localName = "UsageName")
	private String usageName;

	@Description("Set of properties that can be used within this complex property (may include other complex properties).")
	@DataMember(Order = 1)
	@Required()
	@Guid("6321203a-4666-4064-aa58-167b85c5935f")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcProperty")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasProperties")
	private Set<IfcProperty> hasProperties;


	public IfcComplexProperty()
	{
	}

	public IfcComplexProperty(String name, String usageName, IfcProperty[] hasProperties)
	{
		super(name);
		this.usageName = usageName;
		this.hasProperties = new HashSet<>(Arrays.asList(hasProperties));
	}

	public String getUsageName() {
		return this.usageName;
	}

	public void setUsageName(String usageName) {
		this.usageName = usageName;
	}

	public Set<IfcProperty> getHasProperties() {
		return this.hasProperties;
	}


}

