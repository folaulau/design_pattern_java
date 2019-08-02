package com.lovemesomecoding.b.creation.builder;

import com.lovemesomecoding.utils.ObjectUtils;
import com.lovemesomecoding.utils.RandomGeneratorUtils;

public class BuilderMain {

	public static void main(String[] args) {
		Product product = Product.newProduct()
                .id(RandomGeneratorUtils.getAccountUuid())
                .description("TV 46'")
                .value(2000.00)
                .name("TV 46'")
            .build();
		
		System.out.println(ObjectUtils.toJson(product));
	}

}
