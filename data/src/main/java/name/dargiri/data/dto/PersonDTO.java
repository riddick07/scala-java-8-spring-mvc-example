package name.dargiri.data.dto;

import java.util.List;
import java.util.UUID;

public class PersonDTO {

    public final UUID id;
    public final String name;
    public final String surname;
    public final String mobilePhone;
    public final String personalPhone;
    public final String secondName;
    public final String sex;
    public final String dob;
    public final AddressDTO currentAddress;
    public final AddressDTO nativeAddress;
    public final List<AddressDTO> places;
    public final RelativeDTO relatives;
    public final AddressDTO job;
    public final String jobPosition;
    public final List<AccountDTO> accounts;
    public final String aboutMe;


    public PersonDTO(UUID id, String name, String surname, String mobilePhone, String personalPhone,
                     String secondName, String sex, String dob, AddressDTO currentAddress, AddressDTO nativeAddress, List<AddressDTO> places,
                     RelativeDTO relatives, AddressDTO job, String jobPosition, List<AccountDTO> accounts, String aboutMe) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.mobilePhone = mobilePhone;
        this.personalPhone = personalPhone;
        this.secondName = secondName;
        this.sex = sex;
        this.dob = dob;
        this.currentAddress = currentAddress;
        this.nativeAddress = nativeAddress;
        this.places = places;
        this.relatives = relatives;
        this.job = job;
        this.jobPosition = jobPosition;
        this.accounts = accounts;
        this.aboutMe = aboutMe;
    }


    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", personalPhone='" + personalPhone + '\'' +
                ", secondName='" + secondName + '\'' +
                ", sex='" + sex + '\'' +
                ", dob='" + dob + '\'' +
                ", currentAddress=" + currentAddress +
                ", nativeAddress=" + nativeAddress +
                ", places=" + places +
                ", relatives=" + relatives +
                ", job=" + job +
                ", jobPosition='" + jobPosition + '\'' +
                ", accounts=" + accounts +
                ", aboutMe='" + aboutMe + '\'' +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getPersonalPhone() {
        return personalPhone;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSex() {
        return sex;
    }

    public String getDob() {
        return dob;
    }

    public AddressDTO getCurrentAddress() {
        return currentAddress;
    }

    public AddressDTO getNativeAddress() {
        return nativeAddress;
    }

    public List<AddressDTO> getPlaces() {
        return places;
    }

    public RelativeDTO getRelatives() {
        return relatives;
    }

    public AddressDTO getJob() {
        return job;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public List<AccountDTO> getAccounts() {
        return accounts;
    }

    public String getAboutMe() {
        return aboutMe;
    }
}
