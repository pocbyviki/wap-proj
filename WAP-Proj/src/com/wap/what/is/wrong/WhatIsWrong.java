package com.wap.what.is.wrong;

import java.util.HashSet;

public class WhatIsWrong {

	    public static void main(String args[]) {
	        boolean b = false;
	        Double d1 = 0.5d;
	        Double d2 = null;
	        Double result = b ? d1.doubleValue() : d2;// Null pointer access: This expression of type Double is null but requires auto-unboxing
	        // because both expression before and after (:) must return same type 
	        System.out.println(result);
	    }
}
