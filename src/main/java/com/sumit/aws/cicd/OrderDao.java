package com.sumit.aws.cicd;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {

	public List<Order> getOrders(){
		return Stream.of(
				new Order(101,"Mobile",1,30000),
				new Order(102,"Book",4,2000),
				new Order(103,"Laptop",1,150000),
				new Order(104,"Headset",1,1799)
				).collect(Collectors.toList());
	}
}
