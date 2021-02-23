package aI40ontology.impl;

import aI40ontology.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultSetElement <br>
 * @version generated on Mon Feb 22 13:47:49 COT 2021 by sagga
 */
public class DefaultSetElement extends WrappedIndividualImpl implements SetElement {

    public DefaultSetElement(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#belongsToSequence
     */
     
    public Collection<? extends Sequence> getBelongsToSequence() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_BELONGSTOSEQUENCE,
                                               DefaultSequence.class);
    }

    public boolean hasBelongsToSequence() {
	   return !getBelongsToSequence().isEmpty();
    }

    public void addBelongsToSequence(Sequence newBelongsToSequence) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_BELONGSTOSEQUENCE,
                                       newBelongsToSequence);
    }

    public void removeBelongsToSequence(Sequence oldBelongsToSequence) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_BELONGSTOSEQUENCE,
                                          oldBelongsToSequence);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasDescription
     */
     
    public Collection<? extends String> getHasDescription() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDESCRIPTION, String.class);
    }

    public boolean hasHasDescription() {
		return !getHasDescription().isEmpty();
    }

    public void addHasDescription(String newHasDescription) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDESCRIPTION, newHasDescription);
    }

    public void removeHasDescription(String oldHasDescription) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDESCRIPTION, oldHasDescription);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasNumberOfStates
     */
     
    public Collection<? extends Integer> getHasNumberOfStates() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFSTATES, Integer.class);
    }

    public boolean hasHasNumberOfStates() {
		return !getHasNumberOfStates().isEmpty();
    }

    public void addHasNumberOfStates(Integer newHasNumberOfStates) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFSTATES, newHasNumberOfStates);
    }

    public void removeHasNumberOfStates(Integer oldHasNumberOfStates) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFSTATES, oldHasNumberOfStates);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasNumberOfTasks
     */
     
    public Collection<? extends Integer> getHasNumberOfTasks() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTASKS, Integer.class);
    }

    public boolean hasHasNumberOfTasks() {
		return !getHasNumberOfTasks().isEmpty();
    }

    public void addHasNumberOfTasks(Integer newHasNumberOfTasks) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTASKS, newHasNumberOfTasks);
    }

    public void removeHasNumberOfTasks(Integer oldHasNumberOfTasks) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTASKS, oldHasNumberOfTasks);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasNumberOfTransitions
     */
     
    public Collection<? extends Integer> getHasNumberOfTransitions() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTRANSITIONS, Integer.class);
    }

    public boolean hasHasNumberOfTransitions() {
		return !getHasNumberOfTransitions().isEmpty();
    }

    public void addHasNumberOfTransitions(Integer newHasNumberOfTransitions) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTRANSITIONS, newHasNumberOfTransitions);
    }

    public void removeHasNumberOfTransitions(Integer oldHasNumberOfTransitions) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTRANSITIONS, oldHasNumberOfTransitions);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasRelatedOntology
     */
     
    public Collection<? extends Object> getHasRelatedOntology() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASRELATEDONTOLOGY, Object.class);
    }

    public boolean hasHasRelatedOntology() {
		return !getHasRelatedOntology().isEmpty();
    }

    public void addHasRelatedOntology(Object newHasRelatedOntology) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASRELATEDONTOLOGY, newHasRelatedOntology);
    }

    public void removeHasRelatedOntology(Object oldHasRelatedOntology) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASRELATEDONTOLOGY, oldHasRelatedOntology);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#isParentSetElement
     */
     
    public Collection<? extends Boolean> getIsParentSetElement() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISPARENTSETELEMENT, Boolean.class);
    }

    public boolean hasIsParentSetElement() {
		return !getIsParentSetElement().isEmpty();
    }

    public void addIsParentSetElement(Boolean newIsParentSetElement) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISPARENTSETELEMENT, newIsParentSetElement);
    }

    public void removeIsParentSetElement(Boolean oldIsParentSetElement) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISPARENTSETELEMENT, oldIsParentSetElement);
    }


    /* ***************************************************
     * Data Property https://w3id.org/i40/sto#abbreviation
     */
     
    public Collection<? extends Object> getHas_Abbreviated_Name() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_ABBREVIATED_NAME, Object.class);
    }

    public boolean hasHas_Abbreviated_Name() {
		return !getHas_Abbreviated_Name().isEmpty();
    }

    public void addHas_Abbreviated_Name(Object newHas_Abbreviated_Name) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_ABBREVIATED_NAME, newHas_Abbreviated_Name);
    }

    public void removeHas_Abbreviated_Name(Object oldHas_Abbreviated_Name) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_ABBREVIATED_NAME, oldHas_Abbreviated_Name);
    }


}
