package com.ejemplo.dynamicenum;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

import com.ejemplo.properties.MyPropAllKeys;

public class DynamicEnumTest {

	public static void main(String[] args) {
		
		int numero = 0;
		
		DynamicEnum de = new DynamicEnum();
		MyPropAllKeys mpc = new MyPropAllKeys(); 
		
		Set<Object> keys = mpc.getAllKeys();
		for(Object k:keys){
			String key = (String)k;		    
		    de.addEnum(TestEnum.class, key+": "+mpc.getPropertyValue(key));			
		}		
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Coloque el numero de propiedad que desea consultar o presione 0 si desea verlos todos");
		
		numero = reader.nextInt();
		
		if(numero > keys.size()) {
			System.out.println("Ingrese un valor valido");			
		}else {
			if(numero == 0) {
				System.out.println(Arrays.deepToString(TestEnum.values()));
			}else {
				
			}
			System.out.println(TestEnum.values()[numero].toString());
		}				
	}
}
