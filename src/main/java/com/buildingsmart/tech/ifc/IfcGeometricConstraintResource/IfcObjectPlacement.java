// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("d7b307f1-5ef1-47c0-ae0c-e0ef2a8a6bf6")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcObjectPlacement
{
	@Description("The <em>IfcObjectPlacement</em> shall be used to provide a placement and   an object coordinate system for instances of <em>IfcProduct</em>.   <blockquote class=\"note\">     If an <em>IfcObjectPlacement</em> is shared by many instances of <em>IfcProduct</em>      it does not apply a semantic meaning of being a shared placement that needs to be      maintained. The same instance of <em>IfcObjectPlacement</em> could simply be used to     reduce exchange file size.  </blockquote>  <blockquote class=\"change-ifc2x3\">     IFC2x3 CHANGE&nbsp; New inverse attribute.  </blockquote>  <blockquote class=\"change-ifc2x4\">     IFC4 CHANGE&nbsp; The cardinality has changed to 0..n to allow reuse of instances of      <em>IfcObjectPlacement</em> as placement object in one to many products. It takes also     into account that it can act as a placement for <em>IfcStructuralAnalysisModel</em>.  </blockquote>")
	@Guid("badd4380-1510-40db-86e6-386eac940e22")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcProduct> placesObject = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcProduct>();

	@Description("Placements that are given relative to this placement of an object.")
	@Guid("27fc033d-5ad5-4a3e-a8a8-5b74f2b80a81")
	private Set<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcLocalPlacement> referencedByPlacements = new HashSet<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcLocalPlacement>();


	public IfcObjectPlacement()
	{
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcProduct> getPlacesObject() {
		return this.placesObject;
	}

	public Set<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcLocalPlacement> getReferencedByPlacements() {
		return this.referencedByPlacements;
	}


}

