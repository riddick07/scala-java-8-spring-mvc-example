package name.dargiri.data.model;

import name.dargiri.data.dto.enums.AddressTypeEnum;
import name.dargiri.data.dto.enums.RelationTypeEnum;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "address_book")
public class Address extends AbstractModel<UUID> implements Model<UUID> {

    private UUID id;
    private String houseNumber;
    private String porchNumber;
    private String flatNumber;
    private Integer floorNumber;
    private AddressTypeEnum addressType;
    private String description;
    private Person person;

    public Address() {
    }

    @Override
    public void assignId() {
        id = UUID.randomUUID();
    }

    @Override
    @Id
    @Column(name = "id")
    public UUID getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name="person_id", nullable=false)
    public Person getPerson() {
        return person;
    }

    @Column(name = "house")
    public String getHouseNumber() {
        return houseNumber;
    }

    @Column(name = "porch")
    public String getPorchNumber() {
        return porchNumber;
    }

    @Column(name = "flat")
    public String getFlatNumber() {
        return flatNumber;
    }

    @Column(name = "floor")
    public Integer getFloorNumber() {
        return floorNumber;
    }

    @Column(name = "type")
    public AddressTypeEnum getAddressType() {
        return addressType;
    }

    @Column
    public String getDescription() {
        return description;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setPorchNumber(String porchNumber) {
        this.porchNumber = porchNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setAddressType(AddressTypeEnum addressType) {
        this.addressType = addressType;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
