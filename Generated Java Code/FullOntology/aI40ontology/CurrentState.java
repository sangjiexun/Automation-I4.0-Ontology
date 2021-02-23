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
 * Source Class: CurrentState <br>
 * @version generated on Mon Feb 22 13:47:49 COT 2021 by sagga
 */

public interface CurrentState extends State {

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
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#finalizesLoop
     */
     
    /**
     * Gets all property values for the finalizesLoop property.<p>
     * 
     * @returns a collection of values for the finalizesLoop property.
     */
    Collection<? extends Loop> getFinalizesLoop();

    /**
     * Checks if the class has a finalizesLoop property value.<p>
     * 
     * @return true if there is a finalizesLoop property value.
     */
    boolean hasFinalizesLoop();

    /**
     * Adds a finalizesLoop property value.<p>
     * 
     * @param newFinalizesLoop the finalizesLoop property value to be added
     */
    void addFinalizesLoop(Loop newFinalizesLoop);

    /**
     * Removes a finalizesLoop property value.<p>
     * 
     * @param oldFinalizesLoop the finalizesLoop property value to be removed.
     */
    void removeFinalizesLoop(Loop oldFinalizesLoop);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasNextState
     */
     
    /**
     * Gets all property values for the hasNextState property.<p>
     * 
     * @returns a collection of values for the hasNextState property.
     */
    Collection<? extends State> getHasNextState();

    /**
     * Checks if the class has a hasNextState property value.<p>
     * 
     * @return true if there is a hasNextState property value.
     */
    boolean hasHasNextState();

    /**
     * Adds a hasNextState property value.<p>
     * 
     * @param newHasNextState the hasNextState property value to be added
     */
    void addHasNextState(State newHasNextState);

    /**
     * Removes a hasNextState property value.<p>
     * 
     * @param oldHasNextState the hasNextState property value to be removed.
     */
    void removeHasNextState(State oldHasNextState);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasPreviousState
     */
     
    /**
     * Gets all property values for the hasPreviousState property.<p>
     * 
     * @returns a collection of values for the hasPreviousState property.
     */
    Collection<? extends State> getHasPreviousState();

    /**
     * Checks if the class has a hasPreviousState property value.<p>
     * 
     * @return true if there is a hasPreviousState property value.
     */
    boolean hasHasPreviousState();

    /**
     * Adds a hasPreviousState property value.<p>
     * 
     * @param newHasPreviousState the hasPreviousState property value to be added
     */
    void addHasPreviousState(State newHasPreviousState);

    /**
     * Removes a hasPreviousState property value.<p>
     * 
     * @param oldHasPreviousState the hasPreviousState property value to be removed.
     */
    void removeHasPreviousState(State oldHasPreviousState);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasStateFunction
     */
     
    /**
     * Gets all property values for the hasStateFunction property.<p>
     * 
     * @returns a collection of values for the hasStateFunction property.
     */
    Collection<? extends StateFunction> getHasStateFunction();

    /**
     * Checks if the class has a hasStateFunction property value.<p>
     * 
     * @return true if there is a hasStateFunction property value.
     */
    boolean hasHasStateFunction();

    /**
     * Adds a hasStateFunction property value.<p>
     * 
     * @param newHasStateFunction the hasStateFunction property value to be added
     */
    void addHasStateFunction(StateFunction newHasStateFunction);

    /**
     * Removes a hasStateFunction property value.<p>
     * 
     * @param oldHasStateFunction the hasStateFunction property value to be removed.
     */
    void removeHasStateFunction(StateFunction oldHasStateFunction);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#initializesLoop
     */
     
    /**
     * Gets all property values for the initializesLoop property.<p>
     * 
     * @returns a collection of values for the initializesLoop property.
     */
    Collection<? extends Loop> getInitializesLoop();

    /**
     * Checks if the class has a initializesLoop property value.<p>
     * 
     * @return true if there is a initializesLoop property value.
     */
    boolean hasInitializesLoop();

    /**
     * Adds a initializesLoop property value.<p>
     * 
     * @param newInitializesLoop the initializesLoop property value to be added
     */
    void addInitializesLoop(Loop newInitializesLoop);

    /**
     * Removes a initializesLoop property value.<p>
     * 
     * @param oldInitializesLoop the initializesLoop property value to be removed.
     */
    void removeInitializesLoop(Loop oldInitializesLoop);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#isConnectedToTransition
     */
     
    /**
     * Gets all property values for the isConnectedToTransition property.<p>
     * 
     * @returns a collection of values for the isConnectedToTransition property.
     */
    Collection<? extends Transition> getIsConnectedToTransition();

    /**
     * Checks if the class has a isConnectedToTransition property value.<p>
     * 
     * @return true if there is a isConnectedToTransition property value.
     */
    boolean hasIsConnectedToTransition();

    /**
     * Adds a isConnectedToTransition property value.<p>
     * 
     * @param newIsConnectedToTransition the isConnectedToTransition property value to be added
     */
    void addIsConnectedToTransition(Transition newIsConnectedToTransition);

    /**
     * Removes a isConnectedToTransition property value.<p>
     * 
     * @param oldIsConnectedToTransition the isConnectedToTransition property value to be removed.
     */
    void removeIsConnectedToTransition(Transition oldIsConnectedToTransition);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#receivesExecutionScope
     */
     
    /**
     * Gets all property values for the receivesExecutionScope property.<p>
     * 
     * @returns a collection of values for the receivesExecutionScope property.
     */
    Collection<? extends ExecutionScope> getReceivesExecutionScope();

    /**
     * Checks if the class has a receivesExecutionScope property value.<p>
     * 
     * @return true if there is a receivesExecutionScope property value.
     */
    boolean hasReceivesExecutionScope();

    /**
     * Adds a receivesExecutionScope property value.<p>
     * 
     * @param newReceivesExecutionScope the receivesExecutionScope property value to be added
     */
    void addReceivesExecutionScope(ExecutionScope newReceivesExecutionScope);

    /**
     * Removes a receivesExecutionScope property value.<p>
     * 
     * @param oldReceivesExecutionScope the receivesExecutionScope property value to be removed.
     */
    void removeReceivesExecutionScope(ExecutionScope oldReceivesExecutionScope);


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
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#isActive
     */
     
    /**
     * Gets all property values for the isActive property.<p>
     * 
     * @returns a collection of values for the isActive property.
     */
    Collection<? extends Boolean> getIsActive();

    /**
     * Checks if the class has a isActive property value.<p>
     * 
     * @return true if there is a isActive property value.
     */
    boolean hasIsActive();

    /**
     * Adds a isActive property value.<p>
     * 
     * @param newIsActive the isActive property value to be added
     */
    void addIsActive(Boolean newIsActive);

    /**
     * Removes a isActive property value.<p>
     * 
     * @param oldIsActive the isActive property value to be removed.
     */
    void removeIsActive(Boolean oldIsActive);



    /* ***************************************************
     * Property https://w3id.org/i40/sto#abbreviation
     */
     
    /**
     * Gets all property values for the has_Abbreviated_Name property.<p>
     * 
     * @returns a collection of values for the has_Abbreviated_Name property.
     */
    Collection<? extends Object> getHas_Abbreviated_Name();

    /**
     * Checks if the class has a has_Abbreviated_Name property value.<p>
     * 
     * @return true if there is a has_Abbreviated_Name property value.
     */
    boolean hasHas_Abbreviated_Name();

    /**
     * Adds a has_Abbreviated_Name property value.<p>
     * 
     * @param newHas_Abbreviated_Name the has_Abbreviated_Name property value to be added
     */
    void addHas_Abbreviated_Name(Object newHas_Abbreviated_Name);

    /**
     * Removes a has_Abbreviated_Name property value.<p>
     * 
     * @param oldHas_Abbreviated_Name the has_Abbreviated_Name property value to be removed.
     */
    void removeHas_Abbreviated_Name(Object oldHas_Abbreviated_Name);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
