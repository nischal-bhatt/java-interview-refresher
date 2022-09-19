package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	/*
	 *  1. loose coupling
	 *  2. dependencey
	 *  3. IOC
	 *  4. dependency injection
	 *  5. autowiring
	 *  6.
	 */
	
    // What are the beans?
    // What are the dependencies of a bean?
    // Where to search for beans? => No need

    public static void main(String[] args) {

        // BinarySearchImpl binarySearch =
        // new BinarySearchImpl(new QuickSortAlgorithm());
        // Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

        //loose coupling
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

        System.out.println(result);
    }
}