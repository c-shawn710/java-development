package MethodsMiniExercises;

public class Product {
    private String id;
    private int stockQuantity;
    private String name;
    private String description;
    private String productCode;

    public Product(String productCode, String name, String id) {
        this.id = id;
        this.name = name;
        this.productCode = productCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void order(int amount) {
        boolean inStock = true;
        String sub = name.substring(0, 3);
        if(amount > 0) {
            System.out.println("Product " + "'" + sub + "' in stock: " + inStock);
        } else {
            System.out.println("Product " + "'" + sub + "' in stock: " + false);
        }
    }

    /*public void order() {
        List<String>
    }*/
}
