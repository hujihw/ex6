package oop.ex6.sjava_objects.blocks;

import oop.ex6.sjava_objects.SJavaException;
import oop.ex6.sjava_objects.SJavaObject;
import oop.ex6.sjava_objects.variables.SuperVar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * This is the super class of all of the block objects in the S-Java language.
 * @author Omri Kaplan and Asaf Eztion
 */
public abstract class SuperBlock extends SJavaObject {

    /* Data Members */
    private Hashtable<String, SuperVar> variables;
    private SuperBlock parent;

    /* Constructors */
    /**
     * Initializes the parent of the new block.
     * @param parent    The block parent of the new block.
     * @param name the name of the block
     */
    SuperBlock(String name, SuperBlock parent) {
        super(name);
        this.parent = parent;
        variables = new Hashtable<>();
    }

    /* methods */

    /**
     * delegates the putt method to the variables hash table
     * @param key the name of the variable
     * @param value the variable object
     */
    public void addVariable(String key, SuperVar value) {
        variables.put(key, value);
    }

    /**
     * Delegates the get method of the variables Hash table.
     * @param key    The key of the variable object we want to get.
     * @return The variable object found.
     */
    public SuperVar getVariable(String key) {
        return variables.get(key);
    }

    /**
     * The parent block getter.
     * @return The parent block.
     */
    public SuperBlock getParent() {
        return parent;
    }

    /**
     * The parent block setter.
     * @param parent    The parent block of the current block.
     * @throws SJavaException throws any SJavaException onwards
     */
    public void setParent(SuperBlock parent) throws SJavaException {
        this.parent = parent;
    }
}
