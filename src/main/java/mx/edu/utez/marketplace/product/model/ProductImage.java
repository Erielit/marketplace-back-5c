package mx.edu.utez.marketplace.product.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(columnDefinition = "longblob")
    private byte[] fileBase64;
    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonIgnore
    private Product product;

    public ProductImage() {
    }

    public ProductImage(String name, byte[] fileBase64, Product product) {
        this.name = name;
        this.fileBase64 = fileBase64;
        this.product = product;
    }

    public ProductImage(long id, String name, byte[] fileBase64, Product product) {
        this.id = id;
        this.name = name;
        this.fileBase64 = fileBase64;
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getFileBase64() {
        return fileBase64;
    }

    public void setFileBase64(byte[] fileBase64) {
        this.fileBase64 = fileBase64;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
