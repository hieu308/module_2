package bai_tap_them.model;

public class Brand {
    private String id;
    private String nameBrand;
    private String country;

    public Brand(String id, String nameBrand, String country) {
        this.id = id;
        this.nameBrand = nameBrand;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return
                "code='" + id +
                        ", nameBrand='" + nameBrand +
                        ", country='" + country
                ;
    }
}
