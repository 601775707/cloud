package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//修改了
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String id;
	private User user;
	private List<Item> items;
}
