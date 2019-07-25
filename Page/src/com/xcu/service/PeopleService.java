package com.xcu.service;

import java.io.IOException;

import com.xcu.pojo.PageInfo;

public interface PeopleService {
	PageInfo showPage(int pageSize,int pageNumber) throws IOException;
	void m2();
	void m24();
}
