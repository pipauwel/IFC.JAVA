// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("03067245-b9da-400b-8de8-c6189fa9b928")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStyledItem extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem
{
	@JsonIgnore
	@Description("A geometric representation item to which the style is assigned.    <blockquote class=\"change-ifc2x2\">IFC2x2 Add2 CHANGE The attribute <em>Item</em> has been made optional. Upward compatibility for file based exchange is guaranteed.</blockquote>")
	@Guid("1f40d575-2832-4c30-80dc-77a3fcabd3c9")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem item;

	@Description("Representation styles which are assigned, either to an geometric representation item, or to a material definition.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The data type has been changed to <em>IfcStyleAssignmentSelect</em> with upward compatibility   for file based exchange.</blockquote>    <blockquote class=\"note\">NOTE&nbsp; Only the select item <em>IfcPresentationStyle</em> shall be used from IFC4 onwards, the <em>IfcPresentationStyleAssignment</em> has been deprecated.</blockquote>")
	@Required()
	@MinLength(1)
	@Guid("d38b5c99-b51e-4f5a-a2a5-140d9071d049")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcStyleAssignmentSelect> styles = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcStyleAssignmentSelect>();

	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("The word, or group of words, by which the styled item is referred to.")
	@Guid("d82e6d30-0872-439b-9e6c-e97111ad8266")
	private String name;


	public IfcStyledItem()
	{
	}

	public IfcStyledItem(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcStyleAssignmentSelect[] styles)
	{
		this.styles = new HashSet<>(Arrays.asList(styles));
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem getItem() {
		return this.item;
	}

	public void setItem(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem item) {
		this.item = item;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcStyleAssignmentSelect> getStyles() {
		return this.styles;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

