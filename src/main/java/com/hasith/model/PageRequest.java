package com.hasith.model;

public class PageRequest {
    private int draw;
    private String searchRegex;
    private String searchValue;
    private int orderColumn;
    private String orderDir;
    private int pageSize;
    private int start;

    public PageRequest() {
    }

    public PageRequest(int draw) {
        this.draw = draw;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public String getSearchRegex() {
        return searchRegex;
    }

    public void setSearchRegex(String searchRegex) {
        this.searchRegex = searchRegex;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public int getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(int orderColumn) {
        this.orderColumn = orderColumn;
    }

    public String getOrderDir() {
        return orderDir;
    }

    public void setOrderDir(String orderDir) {
        this.orderDir = orderDir;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }
}
