package com.xyh.game;

import org.hibernate.dialect.MySQL5Dialect;

public class CustomMysqlDialect extends MySQL5Dialect{

	@Override
	public String getTableTypeString() {
		// TODO Auto-generated method stub
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";  
	}
	
}
