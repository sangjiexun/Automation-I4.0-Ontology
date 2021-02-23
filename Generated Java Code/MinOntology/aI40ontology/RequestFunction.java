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
 * Source Class: RequestFunction <br>
 * @version generated on Mon Feb 22 13:42:44 COT 2021 by sagga
 */

public interface RequestFunction extends Function {

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
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#callsAService
     */
     
    /**
     * Gets all property values for the callsAService property.<p>
     * 
     * @returns a collection of values for the callsAService property.
     */
    Collection<? extends Service> getCallsAService();

    /**
     * Checks if the class has a callsAService property value.<p>
     * 
     * @return true if there is a callsAService property value.
     */
    boolean hasCallsAService();

    /**
     * Adds a callsAService property value.<p>
     * 
     * @param newCallsAService the callsAService property value to be added
     */
    void addCallsAService(Service newCallsAService);

    /**
     * Removes a callsAService property value.<p>
     * 
     * @param oldCallsAService the callsAService property value to be removed.
     */
    void removeCallsAService(Service oldCallsAService);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#isExecutedBy
     */
     
    /**
     * Gets all property values for the isExecutedBy property.<p>
     * 
     * @returns a collection of values for the isExecutedBy property.
     */
    Collection<? extends Agent> getIsExecutedBy();

    /**
     * Checks if the class has a isExecutedBy property value.<p>
     * 
     * @return true if there is a isExecutedBy property value.
     */
    boolean hasIsExecutedBy();

    /**
     * Adds a isExecutedBy property value.<p>
     * 
     * @param newIsExecutedBy the isExecutedBy property value to be added
     */
    void addIsExecutedBy(Agent newIsExecutedBy);

    /**
     * Removes a isExecutedBy property value.<p>
     * 
     * @param oldIsExecutedBy the isExecutedBy property value to be removed.
     */
    void removeIsExecutedBy(Agent oldIsExecutedBy);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#receivesParameter
     */
     
    /**
     * Gets all property values for the receivesParameter property.<p>
     * 
     * @returns a collection of values for the receivesParameter property.
     */
    Collection<? extends Variable> getReceivesParameter();

    /**
     * Checks if the class has a receivesParameter property value.<p>
     * 
     * @return true if there is a receivesParameter property value.
     */
    boolean hasReceivesParameter();

    /**
     * Adds a receivesParameter property value.<p>
     * 
     * @param newReceivesParameter the receivesParameter property value to be added
     */
    void addReceivesParameter(Variable newReceivesParameter);

    /**
     * Removes a receivesParameter property value.<p>
     * 
     * @param oldReceivesParameter the receivesParameter property value to be removed.
     */
    void removeReceivesParameter(Variable oldReceivesParameter);


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
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasNumberOfParameters
     */
     
    /**
     * Gets all property values for the hasNumberOfParameters property.<p>
     * 
     * @returns a collection of values for the hasNumberOfParameters property.
     */
    Collection<? extends Integer> getHasNumberOfParameters();

    /**
     * Checks if the class has a hasNumberOfParameters property value.<p>
     * 
     * @return true if there is a hasNumberOfParameters property value.
     */
    boolean hasHasNumberOfParameters();

    /**
     * Adds a hasNumberOfParameters property value.<p>
     * 
     * @param newHasNumberOfParameters the hasNumberOfParameters property value to be added
     */
    void addHasNumberOfParameters(Integer newHasNumberOfParameters);

    /**
     * Removes a hasNumberOfParameters property value.<p>
     * 
     * @param oldHasNumberOfParameters the hasNumberOfParameters property value to be removed.
     */
    void removeHasNumberOfParameters(Integer oldHasNumberOfParameters);



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
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasReturnDataType
     */
     
    /**
     * Gets all property values for the hasReturnDataType property.<p>
     * 
     * @returns a collection of values for the hasReturnDataType property.
     */
    Collection<? extends String> getHasReturnDataType();

    /**
     * Checks if the class has a hasReturnDataType property value.<p>
     * 
     * @return true if there is a hasReturnDataType property value.
     */
    boolean hasHasReturnDataType();

    /**
     * Adds a hasReturnDataType property value.<p>
     * 
     * @param newHasReturnDataType the hasReturnDataType property value to be added
     */
    void addHasReturnDataType(String newHasReturnDataType);

    /**
     * Removes a hasReturnDataType property value.<p>
     * 
     * @param oldHasReturnDataType the hasReturnDataType property value to be removed.
     */
    void removeHasReturnDataType(String oldHasReturnDataType);



    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasReturnValue
     */
     
    /**
     * Gets all property values for the hasReturnValue property.<p>
     * 
     * @returns a collection of values for the hasReturnValue property.
     */
    Collection<? extends Object> getHasReturnValue();

    /**
     * Checks if the class has a hasReturnValue property value.<p>
     * 
     * @return true if there is a hasReturnValue property value.
     */
    boolean hasHasReturnValue();

    /**
     * Adds a hasReturnValue property value.<p>
     * 
     * @param newHasReturnValue the hasReturnValue property value to be added
     */
    void addHasReturnValue(Object newHasReturnValue);

    /**
     * Removes a hasReturnValue property value.<p>
     * 
     * @param oldHasReturnValue the hasReturnValue property value to be removed.
     */
    void removeHasReturnValue(Object oldHasReturnValue);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
