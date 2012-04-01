/* $This file is distributed under the terms of the license in /doc/license.txt$ */

package edu.cornell.mannlib.vitro.webapp.auth.requestedAction.propstmt;

import com.hp.hpl.jena.ontology.OntModel;

import edu.cornell.mannlib.vitro.webapp.auth.requestedAction.ifaces.RequestedAction;

/**
 * A base class for requested actions that involve adding, editing, or deleting
 * statements from a model.
 */
public abstract class AbstractPropertyStatementAction extends RequestedAction {
	private final OntModel ontModel;

	public AbstractPropertyStatementAction(OntModel ontModel) {
		this.ontModel = ontModel;
	}

	public OntModel getOntModel() {
		return ontModel;
	}
}
