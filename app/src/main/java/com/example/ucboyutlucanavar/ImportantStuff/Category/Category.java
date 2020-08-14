package com.example.ucboyutlucanavar.ImportantStuff.Category;

public class Category {
    private String categoryId;
    private String categoryName;
    private String categoryPic;
    private String categoryCode;

    public Category(String categoryId, String categoryName, String categoryPic, String categoryCode) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryPic = categoryPic;
        this.categoryCode = categoryCode;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryPic() {
        return categoryPic;
    }

    public void setCategoryPic(String categoryPic) {
        this.categoryPic = categoryPic;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
}
