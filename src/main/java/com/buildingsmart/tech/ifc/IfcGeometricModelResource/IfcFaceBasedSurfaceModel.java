// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("284e8880-6f10-4fea-873a-8e1ec3cf8cc0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFaceBasedSurfaceModel extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcSurfaceOrFaceSurface
{
	@Description("The set of connected face sets comprising the face based surface model.")
	@Required()
	@MinLength(1)
	@Guid("308594ab-aaa8-43db-a1ee-8f3d428b7337")
	private Set<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcConnectedFaceSet> fbsmFaces = new HashSet<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcConnectedFaceSet>();


	public IfcFaceBasedSurfaceModel()
	{
	}

	public IfcFaceBasedSurfaceModel(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcConnectedFaceSet[] fbsmFaces)
	{
		this.fbsmFaces = new HashSet<>(Arrays.asList(fbsmFaces));
	}

	public Set<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcConnectedFaceSet> getFbsmFaces() {
		return this.fbsmFaces;
	}

	public int getDim() {
		return 0;
	}


}

