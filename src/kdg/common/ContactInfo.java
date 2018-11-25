package kdg.common;

public class ContactInfo {
    private Address address;
    private String email;
    private String tel;

    public ContactInfo(Address address, String email, String tel) {
        this.address = address;
        this.email = email;
        this.tel = tel;
    }

    //region getters en setters

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    //endregion
}
