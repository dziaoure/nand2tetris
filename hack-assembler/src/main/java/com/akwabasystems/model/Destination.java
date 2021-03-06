
package com.akwabasystems.model;

import java.util.stream.Stream;


/**
 * An enumeration of the different destination fields in a C-instruction. Each field (or constant) has a method for
 * returning its bit string.
 * 
 * The enum class also contains method for returning the enum constant whose bit string matches a given string. If no
 * matching constant is found, the default "NONE" constant is returned.
 */
public enum Destination {
    
    NONE {
        @Override
        public String toBitString() {
            return "000";
        }
    },
    
    M {
        @Override
        public String toBitString() {
            return "001";
        }
    },
    
    D {
        @Override
        public String toBitString() {
            return "010";
        }
    },
    
    MD {
        @Override
        public String toBitString() {
            return "011";
        }
    },
    
    A {
        @Override
        public String toBitString() {
            return "100";
        }
    },
    
    AM {
        @Override
        public String toBitString() {
            return "101";
        }
    },
    
    AD {
        @Override
        public String toBitString() {
            return "110";
        }
    },
    
    AMD {
        @Override
        public String toBitString() {
            return "111";
        }
    };
    
    
    /**
     * Returns the enum constant whose name matches the given mnemonic
     * 
     * @param mnemonic          the name of the mnemonic to find
     * @return the enum constant whose name matches the given mnemonic
     */
    public static Destination fromMnemonic(String mnemonic) {
        
        return Stream.of(values())
                     .filter((destination) -> destination.name().equalsIgnoreCase(mnemonic))
                     .findFirst()
                     .orElse(NONE);

    }
    
    
    /**
     * Returns the enum constant whose bit string matches the given bits
     * 
     * @param bits          the bit string of the mnemonic to find
     * @return the enum constant whose bit string matches the given bits
     */
    public static Destination fromBits(String bits) {
        
        return Stream.of(values())
                     .filter((destination) -> destination.toBitString().equals(bits))
                     .findFirst()
                     .orElse(NONE);
        
    }
    
    
    /**
     * Returns the string representation of the bits for this enum constant
     * 
     * @return the string representation of the bits for this enum constant
     */
    public abstract String toBitString();
    
}
