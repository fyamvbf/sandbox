package com.github.fyamvbf.sandbox.hibernagteValidatorContainerElementConstraintsSample;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.HashSet;
import java.util.Set;

public class Car {

	private @ValidPart String data ;

	@Valid
    private Set<@ValidPart String> parts = new HashSet<>();

    public void addPart(String part) {
        parts.add( part );
    }

    public void addData(String data) {
    	this.data = data;
    }

    //...

}