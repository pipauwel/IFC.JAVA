// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("03067245-b9da-400b-8de8-c6189fa9b928")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStyledItem extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem
{
	@Description("A geometric representation item to which the style is assigned.    <blockquote class=\"change-ifc2x2\">IFC2x2 Add2 CHANGE The attribute <em>Item</em> has been made optional. Upward compatibility for file based exchange is guaranteed.</blockquote>")
	@DataMember(Order = 0)
	@Guid("1f40d575-2832-4c30-80dc-77a3fcabd3c9")
	@JsonIgnore
	private IfcRepresentationItem item;

	@Description("Representation styles which are assigned, either to an geometric representation item, or to a material definition.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The data type has been changed to <em>IfcStyleAssignmentSelect</em> with upward compatibility   for file based exchange.</blockquote>    <blockquote class=\"note\">NOTE&nbsp; Only the select item <em>IfcPresentationStyle</em> shall be used from IFC4 onwards, the <em>IfcPresentationStyleAssignment</em> has been deprecated.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("d38b5c99-b51e-4f5a-a2a5-140d9071d049")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcStyleAssignmentSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "styles")
	private Set<IfcStyleAssignmentSelect> styles;

	@Description("The word, or group of words, by which the styled item is referred to.")
	@DataMember(Order = 2)
	@Guid("d82e6d30-0872-439b-9e6c-e97111ad8266")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;


	public IfcStyledItem()
	{
	}

	public IfcStyledItem(IfcStyleAssignmentSelect[] styles)
	{
		this.styles = new HashSet<>(Arrays.asList(styles));
	}

	public IfcRepresentationItem getItem() {
		return this.item;
	}

	public void setItem(IfcRepresentationItem item) {
		this.item = item;
	}

	public Set<IfcStyleAssignmentSelect> getStyles() {
		return this.styles;
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}


}

