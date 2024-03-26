package Lesson6;

public class Product {

        private  String nameOfProduct;
        private  Integer productCode;
        public   Double price;
        public   String productDescription;
        public   Boolean productAvailability;

        public Product (String nameOfProduct, Integer productCode, Double price, String productDescription, Boolean productAvailability) {

            this.nameOfProduct = nameOfProduct;
            this.productCode = productCode;
            this.price = price;
            this.productDescription = productDescription;
            this.productAvailability = productAvailability;

        }

        public String getNameOfProduct() {
            return nameOfProduct;
        }

        public Integer getProductCode() {
            return productCode;
        }

        public void setPrice(Double newPrice) {
            this.price = newPrice;
        }

        public String getProductDescription() {
            return productDescription;
        }
        public void setProductAvailability(Boolean availability) {
            this.productAvailability = availability;

    }

}

