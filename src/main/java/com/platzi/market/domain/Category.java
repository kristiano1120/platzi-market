package com.platzi.market.domain;

public class Category {
    private int categortyId;
    private String category;
    private boolean active;

    public int getCategortyId() {
        return categortyId;
    }

    public void setCategortyId(int categortyId) {
        this.categortyId = categortyId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
