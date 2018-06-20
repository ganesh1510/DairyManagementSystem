package team.project.dairymanagementsystem.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity

public class Supplier  {
    @Id
    @Column(name = "nationalId")
    private int national_id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "address")
    private String address;

    @NotNull
    @Column(name = "emailAddress")
    private String email_address;

    @NotNull
    @Column(name = "phone")
    private int phone;

    @Lob
    @Column(name = "pic")
    private byte[] pic;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "contract")
    private Contract contract;

    public Supplier(){

    }

    public Supplier(int national_id, @NotNull String address, @NotNull String email_address, @NotNull int phone, @NotNull byte[] pic, Contract contract) {
        this.national_id = national_id;
        this.address = address;
        this.email_address = email_address;
        this.phone = phone;
        this.pic = pic;
        this.contract = contract;
    }

    public void setNational_id(int national_id) {
        this.national_id = national_id;
    }

    public int getNational_id() {
        return national_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public byte[] getPic() {
        return pic;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "national_id=" + national_id +

                '}';
    }
}
