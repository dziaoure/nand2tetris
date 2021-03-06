
package com.akwabasystems.vm;


/**
 * An interface that defines the methods necessary for parsing VM files, and for providing access to the generated
 * assembly code from the commands contained in those files.
 */
public interface Parser {
    
    
    /**
     * Parses the given command
     * 
     * @param command       the command to parse 
     */
    void parse(String command);
    
    
    /**
     * Sets the file name for this parser. This name is used to output unique symbols (labels, return addresses, etc)
     * 
     * @param fileName          the name to set for the parser
     * @return a reference to the Parser instance
     */
    Parser setFileName(String fileName);
    
    
    /**
     * Returns the current function context for this parser
     * 
     * @return the current function context for this parser
     */
    String currentFunctionContext();
    
    
    /**
     * Returns the assembly code from the parsed VM commands
     * 
     * @return the assembly code from the parsed VM commands
     */
    String assemblyCode();
    
    
    /**
     * Specifies whether debugging should be enabled for this parser
     * 
     * @param debugEnabled          a flag that specifies whether to enable debugging for this parser
     * @return a reference to the Parser instance
     */
    VMParser setDebugEnabled(boolean debugEnabled);
    
    
    /**
     * Specifies whether this parser should output the bootstrapping code
     * 
     * @param bootstrapEnabled      a flag that specifies whether to output the bootstrapping code
     * @return a reference to the Parser instance
     */
    VMParser shouldBootstrap(boolean bootstrapEnabled);
    
}
