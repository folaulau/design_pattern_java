package com.lovemesomecoding.a.creation.singleton;

/*
 * This approach has serialization and thread-safety guaranteed.
 */
public enum EnumSingleton {
	
	INSTANCE("Initial class info"); 
	
	private String info;
	  
    private EnumSingleton(String info) {
        this.info = info;
    }
    
    // this is thread-safe and serialization safe.
    public EnumSingleton getInstance() {
        return INSTANCE;
    }
    
    public String getInfo() {
    	return info;
    }
    
}
