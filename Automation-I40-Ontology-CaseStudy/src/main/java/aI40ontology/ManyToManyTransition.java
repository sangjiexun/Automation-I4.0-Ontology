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
 * Source Class: ManyToManyTransition <br>
 * @version generated on Mon Feb 22 13:42:44 COT 2021 by sagga
 */

public interface ManyToManyTransition extends Transition {

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
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasTransitionFunction
     */
     
    /**
     * Gets all property values for the hasTransitionFunction property.<p>
     * 
     * @returns a collection of values for the hasTransitionFunction property.
     */
    Collection<? extends TransitionFunction> getHasTransitionFunction();

    /**
     * Checks if the class has a hasTransitionFunction property value.<p>
     * 
     * @return true if there is a hasTransitionFunction property value.
     */
    boolean hasHasTransitionFunction();

    /**
     * Adds a hasTransitionFunction property value.<p>
     * 
     * @param newHasTransitionFunction the hasTransitionFunction property value to be added
     */
    void addHasTransitionFunction(TransitionFunction newHasTransitionFunction);

    /**
     * Removes a hasTransitionFunction property value.<p>
     * 
     * @param oldHasTransitionFunction the hasTransitionFunction property value to be removed.
     */
    void removeHasTransitionFunction(TransitionFunction oldHasTransitionFunction);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#isConnectedToState
     */
     
    /**
     * Gets all property values for the isConnectedToState property.<p>
     * 
     * @returns a collection of values for the isConnectedToState property.
     */
    Collection<? extends State> getIsConnectedToState();

    /**
     * Checks if the class has a isConnectedToState property value.<p>
     * 
     * @return true if there is a isConnectedToState property value.
     */
    boolean hasIsConnectedToState();

    /**
     * Adds a isConnectedToState property value.<p>
     * 
     * @param newIsConnectedToState the isConnectedToState property value to be added
     */
    void addIsConnectedToState(State newIsConnectedToState);

    /**
     * Removes a isConnectedToState property value.<p>
     * 
     * @param oldIsConnectedToState the isConnectedToState property value to be removed.
     */
    void removeIsConnectedToState(State oldIsConnectedToState);


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
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#isEnabled
     */
     
    /**
     * Gets all property values for the isEnabled property.<p>
     * 
     * @returns a collection of values for the isEnabled property.
     */
    Collection<? extends Boolean> getIsEnabled();

    /**
     * Checks if the class has a isEnabled property value.<p>
     * 
     * @return true if there is a isEnabled property value.
     */
    boolean hasIsEnabled();

    /**
     * Adds a isEnabled property value.<p>
     * 
     * @param newIsEnabled the isEnabled property value to be added
     */
    void addIsEnabled(Boolean newIsEnabled);

    /**
     * Removes a isEnabled property value.<p>
     * 
     * @param oldIsEnabled the isEnabled property value to be removed.
     */
    void removeIsEnabled(Boolean oldIsEnabled);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
