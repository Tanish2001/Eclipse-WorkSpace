package com.aurionpro.test;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionComsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumerObj= (name)->{
			System.out.println("Hello "+ name);
		};
		
		consumerObj.accept("BanTan");
		
		Function<Integer, Integer> functionObj = (number) ->{
			return number*number;
		};
		
		System.out.println(functionObj.apply(21));
		
		BiFunction<String, Integer, String> biFuncObj = (name,age)->{
			return "Hello my name is "+name+" and my age is "+ age;
		};
		
		System.out.println(biFuncObj.apply("BanTan",21));
		
		BiConsumer<String, Integer> biConsumerObj = (name,age)->{
			System.out.println("Hello my name is "+name+" and my age is "+ age);
		};
		biConsumerObj.accept("Asis", 10);
		
		Predicate<Integer> predicateObj = (number)->{
			return number%2==0;
		};
		
		System.out.println(predicateObj.test(31));
		
		BiPredicate<String, String> passWordCheck = (pass1,pass2)->{
			return pass1.equals(pass2);
		};
		
		System.out.println(passWordCheck.test("abc", "aBc"));
	}

}
