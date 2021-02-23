package aI40ontology;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: AnalogOutput <br>
 * @version generated on Mon Feb 22 13:42:44 COT 2021 by sagga
 */

public interface AnalogOutput extends Output, AnalogVariable {

    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#actsOver
     */
     
    /**
     * Gets all property values for the actsOver property.<p>
     * 
     * @returns a collection of values for the actsOver property.
     */
    Collection<? extends ObjectO> getActsOver();

    /**
     * Checks if the class has a actsOver property value.<p>
     * 
     * @return true if there is a actsOver property value.
     */
    boolean hasActsOver();

    /**
     * Adds a actsOver property value.<p>
     * 
     * @param newActsOver the actsOver property value to be added
     */
    void addActsOver(ObjectO newActsOver);

    /**
     * Removes a actsOver property value.<p>
     * 
     * @param oldActsOver the actsOver property value to be removed.
     */
    void removeActsOver(ObjectO oldActsOver);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#belongsToSequence
     */
     
    /**
     * Gets all property values for the belongsToSequence property.<p>
     * 
     * @returns a collection of values for the belongsToSequence property.
     */
    Collection<? extends Sequence> getBelongsToSequence();

    /**
     * Checks if the class has a belongsToSequence property value.<p>
     * 
     * @return true if there is a belongsToSequence property value.
     */
    boolean hasBelongsToSequence();

    /**
     * Adds a belongsToSequence property value.<p>
     * 
     * @param newBelongsToSequence the belongsToSequence property value to be added
     */
    void addBelongsToSequence(Sequence newBelongsToSequence);

    /**
     * Removes a belongsToSequence property value.<p>
     * 
     * @param oldBelongsToSequence the belongsToSequence property value to be removed.
     */
    void removeBelongsToSequence(Sequence oldBelongsToSequence);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#isContextVariableOf
     */
     
    /**
     * Gets all property values for the isContextVariableOf property.<p>
     * 
     * @returns a collection of values for the isContextVariableOf property.
     */
    Collection<? extends ExecutionScope> getIsContextVariableOf();

    /**
     * Checks if the class has a isContextVariableOf property value.<p>
     * 
     * @return true if there is a isContextVariableOf property value.
     */
    boolean hasIsContextVariableOf();

    /**
     * Adds a isContextVariableOf property value.<p>
     * 
     * @param newIsContextVariableOf the isContextVariableOf property value to be added
     */
    void addIsContextVariableOf(ExecutionScope newIsContextVariableOf);

    /**
     * Removes a isContextVariableOf property value.<p>
     * 
     * @param oldIsContextVariableOf the isContextVariableOf property value to be removed.
     */
    void removeIsContextVariableOf(ExecutionScope oldIsContextVariableOf);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasAssociatedMemory
     */
     
    /**
     * Gets all property values for the hasAssociatedMemory property.<p>
     * 
     * @returns a collection of values for the hasAssociatedMemory property.
     */
    Collection<? extends String> getHasAssociatedMemory();

    /**
     * Checks if the class has a hasAssociatedMemory property value.<p>
     * 
     * @return true if there is a hasAssociatedMemory property value.
     */
    boolean hasHasAssociatedMemory();

    /**
     * Adds a hasAssociatedMemory property value.<p>
     * 
     * @param newHasAssociatedMemory the hasAssociatedMemory property value to be added
     */
    void addHasAssociatedMemory(String newHasAssociatedMemory);

    /**
     * Removes a hasAssociatedMemory property value.<p>
     * 
     * @param oldHasAssociatedMemory the hasAssociatedMemory property value to be removed.
     */
    void removeHasAssociatedMemory(String oldHasAssociatedMemory);



    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasDataType
     */
     
    /**
     * Gets all property values for the hasDataType property.<p>
     * 
     * @returns a collection of values for the hasDataType property.
     */
    Collection<? extends String> getHasDataType();

    /**
     * Checks if the class has a hasDataType property value.<p>
     * 
     * @return true if there is a hasDataType property value.
     */
    boolean hasHasDataType();

    /**
     * Adds a hasDataType property value.<p>
     * 
     * @param newHasDataType the hasDataType property value to be added
     */
    void addHasDataType(String newHasDataType);

    /**
     * Removes a hasDataType property value.<p>
     * 
     * @param oldHasDataType the hasDataType property value to be removed.
     */
    void removeHasDataType(String oldHasDataType);



    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasDescription
     */
     
    /**
     * Gets all property values for the hasDescription property.<p>
     * 
     * @returns a collection of values for the hasDescription property.
     */
    Collection<? extends String> getHasDescription();

    /**
     * Checks if the class has a hasDescription property value.<p>
     * 
     * @return true if there is a hasDescription property value.
     */
    boolean hasHasDescription();

    /**
     * Adds a hasDescription property value.<p>
     * 
     * @param newHasDescription the hasDescription property value to be added
     */
    void addHasDescription(String newHasDescription);

    /**
     * Removes a hasDescription property value.<p>
     * 
     * @param oldHasDescription the hasDescription property value to be removed.
     */
    void removeHasDescription(String oldHasDescription);



    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasNumberOfTasks
     */
     
    /**
     * Gets all property values for the hasNumberOfTasks property.<p>
     * 
     * @returns a collection of values for the hasNumberOfTasks property.
     */
    Collection<? extends Integer> getHasNumberOfTasks();

    /**
     * Checks if the class has a hasNumberOfTasks property value.<p>
     * 
     * @return true if there is a hasNumberOfTasks property value.
     */
    boolean hasHasNumberOfTasks();

    /**
     * Adds a hasNumberOfTasks property value.<p>
     * 
     * @param newHasNumberOfTasks the hasNumberOfTasks property value to be added
     */
    void addHasNumberOfTasks(Integer newHasNumberOfTasks);

    /**
     * Removes a hasNumberOfTasks property value.<p>
     * 
     * @param oldHasNumberOfTasks the hasNumberOfTasks property value to be removed.
     */
    void removeHasNumberOfTasks(Integer oldHasNumberOfTasks);



    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasRelatedOntology
     */
     
    /**
     * Gets all property values for the hasRelatedOntology property.<p>
     * 
     * @returns a collection of values for the hasRelatedOntology property.
     */
    Collection<? extends Object> getHasRelatedOntology();

    /**
     * Checks if the class has a hasRelatedOntology property value.<p>
     * 
     * @return true if there is a hasRelatedOntology property value.
     */
    boolean hasHasRelatedOntology();

    /**
     * Adds a hasRelatedOntology property value.<p>
     * 
     * @param newHasRelatedOntology the hasRelatedOntology property value to be added
     */
    void addHasRelatedOntology(Object newHasRelatedOntology);

    /**
     * Removes a hasRelatedOntology property value.<p>
     * 
     * @param oldHasRelatedOntology the hasRelatedOntology property value to be removed.
     */
    void removeHasRelatedOntology(Object oldHasRelatedOntology);



    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasValue
     */
     
    /**
     * Gets all property values for the hasValue property.<p>
     * 
     * @returns a collection of values for the hasValue property.
     */
    Collection<? extends Object> getHasValue();

    /**
     * Checks if the class has a hasValue property value.<p>
     * 
     * @return true if there is a hasValue property value.
     */
    boolean hasHasValue();

    /**
     * Adds a hasValue property value.<p>
     * 
     * @param newHasValue the hasValue property value to be added
     */
    void addHasValue(Object newHasValue);

    /**
     * Removes a hasValue property value.<p>
     * 
     * @param oldHasValue the hasValue property value to be removed.
     */
    void removeHasValue(Object oldHasValue);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
