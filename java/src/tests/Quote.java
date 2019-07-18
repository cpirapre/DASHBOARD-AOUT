package tests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	
	private String type;
	private Value value;
	
	public Quote() {
		
	}
	
	public String getType(){
		
	}
	
	public void setType(String type) {
		this.type=type;
		
	}
	
	public Value getValue() {
		
	}
	
	public void setValue(Value value) {
		this.value=value;
	}
	
	@Override
	public String toString() {
		return "Quote{" +
				"type='" + type + '\'' +
				", value=" + value +
				'}';
	}

}
