package com.shanyuanjie.qna.util;

import java.io.Serializable;
import java.util.List;

public class PageUtil<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	//当前页码数
	private int pageNum;
	//每页显示的数量
	private int pageSize;
	//总记录数
	private int rowCount;
	//总页码数
	private int pageCount;
	//本次查询从多少记录开始
	private int rowStart;
	//本次查询的结果
	List<T> list = null;

	//是否有上一页
	private boolean hasPrevious;
	//首页
	private int firstPage;
	//上一页
	private int previousPage;
	//是否有下一页
	private boolean hasNext;
	//尾页
	private int lastPage;
	//下一页
	private int nextPage;

	//每页最多有多少页码数
	private int everyPageCount;
	//每页页码开始
	private int everyPageStart;
	//每页页码结束
	private int everyPageEnd;

	/**
	 * 初始化分页数据
	 * @param pageNum
	 * @param pageSize
	 * @param rowCount
	 */
	public PageUtil(String pageNumString, String pageSizeString, int rowCount) {
		//当前页码数
		this.pageNum = pageNumString == null ? 1 : Integer.parseInt(pageNumString);
		//每页显示的数量
		this.pageSize = pageSizeString == null ? 5 : Integer.parseInt(pageSizeString);
		//总记录数
		this.rowCount = rowCount;
		//总页码数
		this.pageCount = (int) Math.ceil(rowCount * 1.0 / pageSize);
		if (pageNum > pageCount && pageCount > 0) {
			this.pageNum = pageCount;
		}
		//本次查询从多少记录开始
		this.rowStart = (pageNum - 1) * pageSize;
		//是否有上一页
		if (pageNum > 1) {
			this.hasPrevious = true;
			//首页
			this.firstPage = 1;
			//上一页
			this.previousPage = pageNum - 1;
		}
		//是否有下一页
		if (pageNum < pageCount) {
			this.hasNext = true;
			//尾页
			this.lastPage = pageCount;
			//下一页
			this.nextPage = pageNum + 1;
		}
		//每页最多有多少页码数
		this.everyPageCount = 10;
		//每页页码开始
		this.everyPageStart = (pageNum - everyPageCount / 2) >= 1 ? (pageNum - everyPageCount / 2) : 1;
		//每页页码结束
		this.everyPageEnd = (pageNum + everyPageCount / 2) <= pageCount ? (pageNum + everyPageCount / 2) : pageCount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getRowStart() {
		return rowStart;
	}

	public void setRowStart(int rowStart) {
		this.rowStart = rowStart;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public boolean isHasPrevious() {
		return hasPrevious;
	}

	public void setHasPrevious(boolean hasPrevious) {
		this.hasPrevious = hasPrevious;
	}

	public int getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getPreviousPage() {
		return previousPage;
	}

	public void setPreviousPage(int previousPage) {
		this.previousPage = previousPage;
	}

	public boolean isHasNext() {
		return hasNext;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getEveryPageCount() {
		return everyPageCount;
	}

	public void setEveryPageCount(int everyPageCount) {
		this.everyPageCount = everyPageCount;
	}

	public int getEveryPageStart() {
		return everyPageStart;
	}

	public void setEveryPageStart(int everyPageStart) {
		this.everyPageStart = everyPageStart;
	}

	public int getEveryPageEnd() {
		return everyPageEnd;
	}

	public void setEveryPageEnd(int everyPageEnd) {
		this.everyPageEnd = everyPageEnd;
	}

}
