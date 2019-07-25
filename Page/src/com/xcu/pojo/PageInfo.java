package com.xcu.pojo;

import java.util.List;
import java.util.Map;

public class PageInfo {
	private int PageSize;//每页显示个数
	private int PageNumber;//当前显示第几页
	private long total; //总页数
	private List<?> list;  //当前也显示的数据
	public int getPageSize() {
		return PageSize;
	}
	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}
	public int getPageNumber() {
		return PageNumber;
	}
	public void setPageNumber(int pageNumber) {
		PageNumber = pageNumber;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + PageNumber;
		result = prime * result + PageSize;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + (int) (total ^ (total >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PageInfo other = (PageInfo) obj;
		if (PageNumber != other.PageNumber)
			return false;
		if (PageSize != other.PageSize)
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (total != other.total)
			return false;
		return true;
	}
	public PageInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageInfo(int pageSize, int pageNumber, long total, List<?> list) {
		super();
		PageSize = pageSize;
		PageNumber = pageNumber;
		this.total = total;
		this.list = list;
	}
	
}
