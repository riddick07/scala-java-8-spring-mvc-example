package name.dargiri.data.dto;

import name.dargiri.data.dto.enums.AddressTypeEnum;

import java.util.UUID;

/**
 * Created by dmitry.karpenko on 12-Jun-14.
 */
public class AddressDTO {

    public final UUID id;
    public final String houseNumber;
    public final String porchNumber;
    public final String flatNumber;
    public final Integer floorNumber;
    public final AddressTypeEnum addressType;
    public final String description;

    public AddressDTO(UUID id, String houseNumber, String porchNumber, String flatNumber, Integer floorNumber, AddressTypeEnum addressType, String description) {
        this.id = id;
        this.houseNumber = houseNumber;
        this.porchNumber = porchNumber;
        this.flatNumber = flatNumber;
        this.floorNumber = floorNumber;
        this.addressType = addressType;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getPorchNumber() {
        return porchNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public AddressTypeEnum getAddressType() {
        return addressType;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "AddressDTO{" +
                "id=" + id +
                ", houseNumber='" + houseNumber + '\'' +
                ", porchNumber='" + porchNumber + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                ", floorNumber=" + floorNumber +
                ", addressType=" + addressType +
                ", description='" + description + '\'' +
                '}';
    }
}
