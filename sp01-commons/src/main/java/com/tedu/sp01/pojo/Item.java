package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 修改了
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	private Integer id;
	private String name;
	private Integer number;
}
