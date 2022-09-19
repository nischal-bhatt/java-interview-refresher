package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class BinarySearchImpl {

   // @Autowired
    //sortAlgorithm is a dependency
    private SortAlgorithm sortAlgorithm;

    //constructor injection
    @Autowired
    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
		System.out.println("creating.....");
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        // Search the array
        return 666;
    }
    
    public BinarySearchImpl()
    {
    	System.out.println("creating.....");
    }

}
