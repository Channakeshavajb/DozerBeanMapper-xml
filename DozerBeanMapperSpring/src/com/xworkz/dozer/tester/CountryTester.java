package com.xworkz.dozer.tester;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import com.xworkz.dozer.entity.CountryEntity;
import com.xworkz.dozer.entity.MyCountryEntity;
import com.xworkz.dozer.entity.StateCountryEntity;



public class CountryTester {

	public static void main(String[] args) {

		
		CountryEntity countryEntity=new CountryEntity();
		countryEntity.setName("india");
		countryEntity.setAddress("Asia");
		
		countryEntity.getState().add(new StateCountryEntity("karnataka","s1","south"));
		countryEntity.getState().add(new StateCountryEntity("andra","s2","south-east"));
		countryEntity.getState().add(new StateCountryEntity("tamilnadu","s3","south-north"));
		countryEntity.getState().add(new StateCountryEntity("kerala","s4","south-west"));
		
		System.out.println(countryEntity);
		
		DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
		dozerBeanMapper.setMappingFiles(Arrays.asList("mappings\\DozerMapping.xml"));
		MyCountryEntity myCountryEntity=dozerBeanMapper.map(countryEntity, MyCountryEntity.class);
		
		System.out.println(myCountryEntity);
		
	}

}
