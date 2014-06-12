package name.dargiri.data.dto.enums;

/**
 * Created by dmitry.karpenko on 12-Jun-14.
 */
public enum AccountTypeEnum {

    VK("vk"), FACEBOOK("Facebook"), TWITTER("Twitter");

    private String name;

    AccountTypeEnum(String name) {
        this.name = name;
    }
}
