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
 * Source Class: DefaultStateFunction <br>
 * @version generated on Mon Feb 22 13:47:49 COT 2021 by sagga
 */
public class DefaultStateFunction extends WrappedIndividualImpl implements StateFunction {

    public DefaultStateFunction(CodeGenerationInference inference, IRI iri) {
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
     * Object Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#isExecutedBy
     */
     
    public Collection<? extends Foaf:Agent> getIsExecutedBy() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISEXECUTEDBY,
                                               DefaultFoaf:Agent.class);
    }

    public boolean hasIsExecutedBy() {
	   return !getIsExecutedBy().isEmpty();
    }

    public void addIsExecutedBy(Foaf:Agent newIsExecutedBy) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISEXECUTEDBY,
                                       newIsExecutedBy);
    }

    public void removeIsExecutedBy(Foaf:Agent oldIsExecutedBy) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISEXECUTEDBY,
                                          oldIsExecutedBy);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#receivesParameter
     */
     
    public Collection<? extends Variable> getReceivesParameter() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_RECEIVESPARAMETER,
                                               DefaultVariable.class);
    }

    public boolean hasReceivesParameter() {
	   return !getReceivesParameter().isEmpty();
    }

    public void addReceivesParameter(Variable newReceivesParameter) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_RECEIVESPARAMETER,
                                       newReceivesParameter);
    }

    public void removeReceivesParameter(Variable oldReceivesParameter) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_RECEIVESPARAMETER,
                                          oldReceivesParameter);
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
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasNumberOfParameters
     */
     
    public Collection<? extends Integer> getHasNumberOfParameters() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFPARAMETERS, Integer.class);
    }

    public boolean hasHasNumberOfParameters() {
		return !getHasNumberOfParameters().isEmpty();
    }

    public void addHasNumberOfParameters(Integer newHasNumberOfParameters) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFPARAMETERS, newHasNumberOfParameters);
    }

    public void removeHasNumberOfParameters(Integer oldHasNumberOfParameters) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFPARAMETERS, oldHasNumberOfParameters);
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
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasReturnDataType
     */
     
    public Collection<? extends String> getHasReturnDataType() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASRETURNDATATYPE, String.class);
    }

    public boolean hasHasReturnDataType() {
		return !getHasReturnDataType().isEmpty();
    }

    public void addHasReturnDataType(String newHasReturnDataType) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASRETURNDATATYPE, newHasReturnDataType);
    }

    public void removeHasReturnDataType(String oldHasReturnDataType) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASRETURNDATATYPE, oldHasReturnDataType);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasReturnValue
     */
     
    public Collection<? extends Object> getHasReturnValue() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASRETURNVALUE, Object.class);
    }

    public boolean hasHasReturnValue() {
		return !getHasReturnValue().isEmpty();
    }

    public void addHasReturnValue(Object newHasReturnValue) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASRETURNVALUE, newHasReturnValue);
    }

    public void removeHasReturnValue(Object oldHasReturnValue) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASRETURNVALUE, oldHasReturnValue);
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
