package oop.ex6.sjava_objects.blocks;

import oop.ex6.sjava_objects.SJavaException;

/**
 * Produce block Objects.
 * @author Omri Kaplan & Asaf Etzion
 */
public class BlockFactory {
    /**
     * The method that creates new blocks.
     * When a new block needs to be created, this method id invoked with the new block's type and given
     * parameters.
     * @param blockType     The type of the block we want to create.
     * @param parameters    The parameters relevant for this block's creation.
     * @return The new block.
     * @throws
     */
    public static SuperBlock produceBlock(String blockType, String parameters) throws
            SJavaException {
        switch (blockType) {
            case "main":
                return new MainBlock();
            case "ifWhile":
                return new IfWhileBlock(parameters);
            default:
                return new MethodBlock(blockType, parameters);
        }
    }
}
