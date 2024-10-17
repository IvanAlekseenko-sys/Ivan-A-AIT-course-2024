package homework_26.workshop.model;

import java.util.Objects;

public abstract class Detail {

    //fields
    protected long barcode;
    protected double size;
    protected String material;
    protected String vendor;
    protected double weight;


    public Detail(long barcode, double size, String material, String vendor, double weight) {
        this.barcode = barcode;
        this.size = size;
        this.material = material;
        this.vendor = vendor;
        this.weight = weight;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Detail detail)) return false;
        return barcode == detail.barcode && Double.compare(size, detail.size) == 0 && Double.compare(weight, detail.weight) == 0 && Objects.equals(material, detail.material) && Objects.equals(vendor, detail.vendor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcode, size, material, vendor, weight);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Detail{");
        sb.append("barcode=").append(barcode);
        sb.append(", size=").append(size);
        sb.append(", material='").append(material).append('\'');
        sb.append(", vendor='").append(vendor).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
