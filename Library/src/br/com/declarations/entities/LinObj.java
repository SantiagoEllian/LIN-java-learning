package br.com.declarations.entities;

import br.com.declarations.entities.Author;
import java.util.Arrays;
import java.lang.reflect.*;


public class LinObj {
	// Parameterized constructor
    public LinObj(Object... args) {
    	Class cls = this.getClass();
        Field[] fields = cls.getDeclaredFields();

        // Find class ID fields if exists
        Field[] nonIDFields = {};
        Field IDfield = null;
        try {
        	IDfield = cls.getDeclaredField("ID");
        	nonIDFields = Arrays.stream(fields).filter(f -> f.getName() != "ID").toArray(Field[]::new);
        }
        catch(NoSuchFieldException e){
        	nonIDFields = fields;
        }

        // Assert number of non-ID fields equals to number of constructor arguments
        if(nonIDFields.length != args.length) {
        	System.out.println("PLS FIX ME");
        	//TODO throw new Exception("Wrong number of arguments for class " + cls.getName());
        }

        // Populate ID fields
        if(IDfield != null) {
        	//TODO Create class for unique ID handling. Just a bunch of 0's for now.
        	setField(IDfield, "00000");
        }
        // Populate non-ID fields
        for(int i = 0; i < nonIDFields.length; i++) {
    		setField(nonIDFields[i], args[i]);
        }
    }
    
    
    private void setField(Field field, Object value) {
    	// Swap field accessibility to set value
    	try {
			field.setAccessible(true);
			field.set(this, value);
			field.setAccessible(false);
        } 
    	catch(Exception e) {
            // Add logger to inform field remained null for whatever failing reasons
        }
    }

}
