package tokolaptop.models;

public class Laptop {
    private int stok;
    private String id, merek, model, spesifikasi;
    private double harga;
    
    public Laptop(String id, String merek, String model, String spesifikasi, double harga, int stok){
        this.id = id;
        this.merek = merek;
        this.model = model;
        this.spesifikasi = spesifikasi;
        this.harga = harga;
        this.stok = stok;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public void setSpesifikasi(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
