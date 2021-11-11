package com.github.fyamvbf.sandbox.hibernagteValidatorContainerElementConstraintsSample;



import java.util.Iterator;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private static Validator validator;

    @BeforeClass
    public static void setUpValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }


    @Test
    public void carIsValid() {
    	System.out.println(java.lang.annotation.ElementType.TYPE_USE);
        System.out.print("Javaバージョン(java.version):");
        System.out.println(System.getProperty("java.version"));
    	Car car = new Car();
    	car.addPart( "Wheel" );
    	car.addPart( "Handle" );
    	car.addData("data1");

    	Set<ConstraintViolation<Car>> constraintViolations = validator.validate( car );

    	assertEquals( 0, constraintViolations.size() );

    	Car car2 = new Car();
    	car2.addPart( "Wheel" );
    	car2.addPart( null );

    	constraintViolations = validator.validate( car2 );
    	assertEquals( 2, constraintViolations.size() );

    	for (Iterator<ConstraintViolation<Car>> iterator = constraintViolations.iterator(); iterator.hasNext();) {
			ConstraintViolation<Car> constraintViolation = (ConstraintViolation<Car>) iterator.next();
	    	System.err.print("違反内容:propertyPath=" + constraintViolation.getPropertyPath());
	    	System.err.println(",invalidValid=" + constraintViolation.getInvalidValue() );

		}


    }
}